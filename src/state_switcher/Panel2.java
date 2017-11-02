package state_switcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Ron Brash (ron.brash@gmail.com)
 * 
 *         The concept of this class is to create a panel which
 *         contains a JButton which has an inline actionListener.
 *         
 *         The action listener will change the state using a static
 *         function from the class Main.
 */
@SuppressWarnings("serial")
public class Panel2 extends JPanel {
	
	public Panel2() {
		JPanel  panel2 = new JPanel();
		JButton button = new JButton("sweet");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.changeState(ViewState.START_STATE);

			}

		});

		panel2.add(button);

		this.add(panel2);
	}

}
