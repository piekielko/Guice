package guice.uiexample;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

public class TestFrameModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Sluchacz.class).in(Scopes.SINGLETON);
		bind(JButton.class).annotatedWith(Names.named("nazwa")).toInstance(
				new JButton("Przycisk annotowany"));
		bind(AbstractAction.class).annotatedWith(Names.named("quitaction"))
				.toInstance(new AbstractAction("name of button") {
					public void actionPerformed(ActionEvent e) {
						System.out.println("Exit...");
						System.exit(0);
					}
				});
	}
}
