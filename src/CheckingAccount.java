
/* This program create a checking class with 3 attributes: account number, owner's name and balance
 * The program's name is CheckingAccount
 */
import java.util.*;

public class CheckingAccount {
	String ownerName;
	double accountBalance;

	public CheckingAccount(int accountNumber) {
		// The constructor has one parameter: accountNumber
		System.out.println("The account number is: " + accountNumber);
	}

	// Setter and Getter for Owner Name
	public void setName(String name) {
		ownerName = name;
	}

	public String getName() {
		return ownerName;
	}

	// Setter and Getter for Balance
	public void setBalance(double balance) {
		accountBalance = balance;
	}

	public double getBalance() {
		return accountBalance;
	}

	// Main class
	public static void main(String[] args) {
		// Object Creation
		int number;
		String name2;
		double balance2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number: ");
		number = sc.nextInt();
		CheckingAccount checkingAccount = new CheckingAccount(number);

		// Set and get Owner Name
		
		System.out.println("Enter the owner name: ");
		name2 = sc.next();
		checkingAccount.setName(name2);
		System.out.println("The ownername is: " + checkingAccount.getName());


		// Set and get Account Balance
		
		System.out.println("Enter the account balance: ");
		balance2 = sc.nextDouble();
		if (balance2 < 0) {
			System.out.println("The account balance is wrong");
			balance2 = 0;
		}
		checkingAccount.setBalance(balance2);
		System.out.println("The account balance is: " + checkingAccount.getBalance());

	}

}
