package guice.mathservice;

public class MathServiceFactory {
	private MathServiceFactory() {
	}

	private static IMathAdditionService mathService = new SnailAdditionService();

	public static IMathAdditionService getInstance() {
		return mathService;
	}

	public static void setInstance(IMathAdditionService service) {
		mathService = service;
	}
}