public class Prime {
	public static void main(String[] args) {
		boolean isPrime;
		for(int i = 2; i <= 100; i++) {
			isPrime = true;
			for(int div = 2; div <= 9; div++) {
				int remain;
				remain = i % div;
				if((remain == 0) && (i != div)) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(i + " is prime.");
			}
		}
	}
}