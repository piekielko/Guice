package guice.uiexample;

import java.awt.BorderLayout;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

public class TestFrame extends JFrame {

	@Inject
	public TestFrame(Panelik panel, @Named("nazwa") JButton button, Sluchacz s,
			@Named("quitaction") AbstractAction asquit, JButton quit, JButton marta) {
		super();
		add(panel, BorderLayout.CENTER);

		JPanel p = new JPanel();
		button.addActionListener(s);
		// button.setText("Przycisk 2");
		p.add(button);
		quit.addActionListener(asquit);
		quit.setText("Quit");
		p.add(quit);
		//START
		marta.addActionListener(s);
		marta.setText("Marta");
		p.add(marta);
		//STOP
		add(p, BorderLayout.NORTH);
		pack();
		setVisible(true);
	}

	public static void main(String args[]) {
		Injector injector = Guice.createInjector(new TestFrameModule());
		TestFrame tf = injector.getInstance(TestFrame.class);
	}

}
