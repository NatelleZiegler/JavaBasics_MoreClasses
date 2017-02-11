import java.util.*;
public class CashRegisterDemo {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String itemDescription = "A pair of jeans";
	int unitsOnHand = 22;
	double price = 100.00;
	RetailItem jeans = new RetailItem(itemDescription, unitsOnHand, price);
	
	System.out.print("Enter how many jeans would you like to purchase: ");
	int numItems = scan.nextInt();
	scan.nextLine();
	while(numItems < 0) {
		System.out.println("The number of items you entered cannot be less than zero.");
		System.out.print("Enter how many jeans would you like to purchase: ");
		numItems = scan.nextInt();
		scan.nextLine();
	}
	
	CashRegister reg = new CashRegister(jeans, numItems);
	double subtotal, total, tax;
	subtotal = reg.getSubtotal();
	tax = reg.getTax();
	total = reg.getTotal();
	
	System.out.println();
	System.out.printf("Subtotal: $%,.2f\n", subtotal);
	System.out.printf("Tax: $%,.2f\n", tax);
	System.out.println("-----------------------------");
	System.out.printf("Total: $%,.2f\n", total);
	
	}
}