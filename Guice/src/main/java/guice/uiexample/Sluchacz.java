package guice.uiexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sluchacz implements ActionListener {

	private int licznik = 0;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		licznik++;
		System.out.println(licznik);
	}

}
