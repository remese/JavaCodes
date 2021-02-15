
public class NumberOfPrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		for (int number = 2; number < 10000; number++) {
			if (isPrime(number)) {
				count = count + 1;
			}
		}
		System.out.println("The number of prime numbers < 10000 is " + count);
	}

	// Check whether number is prime
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}
		return true; // number is prime
	}
}