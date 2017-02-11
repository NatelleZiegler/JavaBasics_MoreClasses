public class CashRegister {
	private RetailItem item;
	private int quantity;
	
	//constructor that accepts a member of the Retail Item class as an argument
	public CashRegister(RetailItem retail, int numItems) {
		item = new RetailItem(retail.getDescription(), retail.getUnitsOnHand(), retail.getPrice());
		quantity = numItems;
	}
	
	public double getSubtotal() {
		double total;
		total = item.getPrice() * quantity;
		return total;
	}
	
	public double getTax() {
		double saleTax;
		saleTax = (item.getPrice() * quantity) * .06;
		return saleTax;
	}
	
	public double getTotal() {
		double saleTax = (item.getPrice() * quantity) * .06;
		double finalTotal = (item.getPrice() * quantity) + saleTax;
		return finalTotal;
	}
}
	
	