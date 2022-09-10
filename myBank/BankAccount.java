//Import
import java.text.SimpleDateFormat;
import java.util.Date;
//Class
public class BankAccount {
    //Assign Variable
    private String accountNumber;
    private String accountName;
    private double balance;
    //Set Account Name
    public void setAccountName(String name){
        accountName = name;
    }
    //Get Account Number From generateAccountNumber();
    public String getAccountNumber(){
        generateAccountNumber();
        return accountNumber;
    }
    //Get Account Name and return to myOutput();
    public String getAccountName(){
        return accountName;
    }
    //Return Balance to myOutput();
    public double checkBalance(){
        return balance;
    }
    //Calculate Balance and return witdraw balance to myOutput();
    public void withdraw(double witdrawamt){
        balance = balance -  witdrawamt;
    }
    //Calculate Balance and return deposit balance to myOutput();
    public void deposit(double depositamt){
        balance = balance + depositamt;
    }
    //Generate Account Number and return to getAccountNumber();
    private String generateAccountNumber(){
        Date thisDate = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("yyyyMMddHHmmss");
        accountNumber = dateForm.format(thisDate);
        return accountNumber;
    }    
}