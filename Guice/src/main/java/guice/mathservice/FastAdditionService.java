package guice.mathservice;

public class FastAdditionService implements IMathAdditionService {
	@Override
	public int sumOfAllConsecutiveNumbers(int n) {
		long startTime = System.nanoTime();
		int sum = (n * (n + 1)) / 2;
		long endTime = System.nanoTime();
		System.out.println("Fast Addition Service - Sum : " + sum);
		System.out.println("Time Complexity - O(1) and Time Taken : "
				+ (endTime - startTime));
		return sum;
	}
}
