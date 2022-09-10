//Import
import javax.swing.*;
import java.text.*;
//Class
public class BUBank {
    //Assign Variable 
    public String getInputName;
    public String getInput;
    public double depoInput;
    public double witdrawInput;
    public String output;
    //Constructor
    private BankAccount baccount;
    public BUBank(){
        baccount = new BankAccount();
    }
    //Main
    public static void main(String [] arg) {
        BUBank program = new BUBank() ;
        program.start();
    }
    //Calling Function
    public void start(){
        nameInput();
        myOutput();
        selectFunction();
    }
    //Select Menu
    public void selectFunction(){
        String[] myMenu = {"Cancel", "Rename", "Witdraw", "deposit", "Balance"};
        int menu = (JOptionPane.showOptionDialog(null, "Welcome to BUBank", "BUBank",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, myMenu, 0));
        while (menu != 0){
            if (menu == 4){
                myOutput();
                selectFunction();
            } 
            else if (menu == 3){
                depositInput();
                myOutput();
                selectFunction();
            }
            else if (menu == 2){
                witdrawInput();
                myOutput();
                selectFunction();
            }
            else if (menu == 1){
                nameInput();
                myOutput();
                selectFunction();
            }
            break;
        }
    }
    //Input Name
    public void nameInput(){
        getInputName = JOptionPane.showInputDialog(null, "Enter a desired account name");
        baccount.setAccountName(getInputName);
    }
    //Input Deposit
    public void depositInput(){
        getInput = JOptionPane.showInputDialog(null, "Deposit amount");
        depoInput = Double.parseDouble(getInput);
        baccount.deposit(depoInput);
    }
    //Input Witdraw
    public void witdrawInput(){
        getInput = JOptionPane.showInputDialog(null, "Witdraw amount");
        witdrawInput = Double.parseDouble(getInput);
        baccount.withdraw(witdrawInput);
    }
    //Display Output
    public void myOutput(){
        DecimalFormat format = new DecimalFormat("0.00");
        output = "Bank account was created completely\n" + "----------------------" + "\nAccount Name: "+ baccount.getAccountName() +"\nAccount Number: "+baccount.getAccountNumber()+"\nBalance: "+format.format(baccount.checkBalance());
        JOptionPane.showMessageDialog(null, output);
    }
}