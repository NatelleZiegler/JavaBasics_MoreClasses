public class MonthDemo {
	public static void main(String[] args) {
		Month monthA = new Month();
		Month monthB = new Month(8);
		Month monthC = new Month("November");
		
		System.out.println(monthA + "\n" + monthB + "\n" + monthC);
	}
}