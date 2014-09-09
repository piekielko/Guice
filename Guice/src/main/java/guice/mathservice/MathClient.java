package guice.mathservice;

import com.google.inject.Inject;

public class MathClient {
	private final IMathAdditionService mathService;

	@Inject
	public MathClient(IMathAdditionService mathService) {
		this.mathService = mathService;
	}

	public int sumOfAllConsecutiveNumbers(int n) {
		return mathService.sumOfAllConsecutiveNumbers(n);
	}
}