import java.util.ArrayList;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		long theNumber = 600851475144L;
		long sqrRootOfTheNumber = Math.round(Math.sqrt(theNumber));
		ArrayList<Long> listOfPrimeFactors = new ArrayList<>();
		if (sqrRootOfTheNumber % 2 == 0) {
			sqrRootOfTheNumber--;
		}
		for (long l = sqrRootOfTheNumber; l >= 3; l-=2) {
			if ((theNumber % l == 0) && (isPrime(l) == true)) {
				System.out.println("The largest prime is " + l);
				break;
			}
		}
		if ((sqrRootOfTheNumber >= 2) && (theNumber % 2 == 0)) {
			listOfPrimeFactors.add(2L);
		}
	}

	public static boolean isPrime(long num){
		long sqrRootOfNum = Math.round(Math.sqrt(num));
		if ((sqrRootOfNum >= 2) && (num % 2 == 0)) {
			return false;
		}
		for (long l = 3; l <= sqrRootOfNum; l+=2) {
			if (num % l == 0) {
				return false;
			}
		}
		return true;
	}

}

