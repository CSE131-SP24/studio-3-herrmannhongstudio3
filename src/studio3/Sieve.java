package studio3;

public class Sieve {

	public static void main(String[] args) {
		int n = 40;
		boolean[] numbers = new boolean [n];
		for (int i=0; i<n; i++){
			numbers[i] = true;
		}
		numbers[0] = false;
		numbers[1] = false;
		for (int i=2;i<(Math.sqrt(n));i++) { // all the prime numbers that have multiples within n
			for (int j=i*i;j<n;j+=i) {
				numbers [j] = false;
			}
		}
		for (int i = 0; i<n; i++) {
			if (numbers[i] == true) {
				System.out.println(i);
			}
		}
	}
}
