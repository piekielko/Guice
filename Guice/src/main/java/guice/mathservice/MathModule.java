package guice.mathservice;

import com.google.inject.AbstractModule;

public class MathModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(IMathAdditionService.class).to(SnailAdditionService.class);
		//bind(IMathAdditionService.class).to(FastAdditionService.class);
	}
}