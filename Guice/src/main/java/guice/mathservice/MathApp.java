package guice.mathservice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MathApp {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new MathModule());
		MathClient mathClient = injector.getInstance(MathClient.class);
		mathClient.sumOfAllConsecutiveNumbers(1000);
	}
}
