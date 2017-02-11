public class BankCopy {
	public static void main(String[] args) {
		//create a bank account object
		BankAccount myAccount = new BankAccount(100.00);
		
		//Declare a bank account variable
		BankAccount accountTwo;
		
		accountTwo = myAccount.copy(myAccount);
		
		System.out.println("First bank account: " + myAccount.getBalance());
		System.out.println("Second bank account: " + accountTwo.getBalance());
		
		//Confirm that we have two objects
		if(myAccount == accountTwo) {
			System.out.println("The myAccount and accountTwo variables reference the same objects.");
		}
		else {
			System.out.println("The myAccount and accountTwo variables reference different objects.");
		}
	}
}