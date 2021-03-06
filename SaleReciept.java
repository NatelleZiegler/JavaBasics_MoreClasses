import java.util.*;
import java.io.*;
public class SaleReciept {
	public static void main(String[] args) throws IOException {
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
	
	PrintWriter outputFile = new PrintWriter("Receipt.txt");
	outputFile.println("SALES RECEIPT");
	outputFile.printf("Unit Price: $%.2f\n", price);
	outputFile.println("Quantity: " + numItems);
	outputFile.printf("Subtotal: $%,.2f\n", subtotal);
	outputFile.printf("Tax: $%,.2f\n", tax);
	outputFile.println("-----------------------------");
	outputFile.printf("Total: $%,.2f\n", total);
	outputFile.close();
	
	}
}