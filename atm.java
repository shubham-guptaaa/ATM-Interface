import java.util.Scanner;
public class atm {

    // Display current balance in account
    public static void displayBalance(int balance) {
        System.out.println("Current Balance : " + balance);
        System.out.println();
    }

    // Withdraw amount and update the balance
    public static int amountWithdrawing(int balance, int withdrawAmount) {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : "+ withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        } else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }

    // Deposit amount and update the balance
    public static int amountDepositing(int balance, int depositAmount) {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount : "+ depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your Money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ATM PIN : " );
        int pin = sc.nextInt();
        int digit = 0;
        while(pin!=0){
            pin = pin/10;
            digit++;
        }
        if(digit>4){
            System.out.println("Invalid PIN");
        }
        else{
        int balance = 10000;
        // calling display balance
        displayBalance(balance);
        System.out.print("Enter your withdraw Amount :");
        int withdrawAmount = sc.nextInt();
        // withdrawing amount
        balance = amountWithdrawing(balance, withdrawAmount);
        System.out.print("\nEnter your Deposite Ammount :");
        int depositAmount = sc.nextInt();
        
        // depositing amount
        balance = amountDepositing(balance, depositAmount);
        sc.close();
        }
    }
}
