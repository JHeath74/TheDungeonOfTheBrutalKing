package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ARTDMessages {

	public static void WelcomeMessage() throws InterruptedException, IOException {

		// String audioFilePath =
		// "src//AlternateRealityTheDungeon//Sounds//Welcome//Windy.wav";

		JButton button = new JButton("Press Click to Continue");

		JFrame f = new JFrame("Your Adventure Awaits");
		JPanel p = new JPanel(new BorderLayout());
		JTextArea welcomemessagearea = new JTextArea();

		f.add(p, BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p.add(welcomemessagearea, BorderLayout.CENTER);
		p.add(button, BorderLayout.SOUTH);

		

			button.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {

				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseReleased(MouseEvent e) {
				}

				@Override
				public void mouseEntered(MouseEvent e) {
				}

				@Override
				public void mouseExited(MouseEvent e) {
				}

			});

			welcomemessagearea.setBounds(10, 30, 400, 400);
			button.setSize(25, 75);
			welcomemessagearea.setLineWrap(true);
			welcomemessagearea.setWrapStyleWord(true);

			p.setVisible(true);
			button.setVisible(true);
			welcomemessagearea.setEditable(false);
			welcomemessagearea.setVisible(true);

			f.setSize(450, 500);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
			f.toFront();
			f.requestFocus();

			welcomemessagearea.setText("");

			// ARTDSounds.Sound(audioFilePath);
			welcomemessagearea.setText("On your way home from your last adventure you are set upon on my an unknown group of people.\n\n");
			wait(2);
			welcomemessagearea.append("You feel yourself being carried for a while and then dropped on something hard.\n\n");
			wait(2);
			welcomemessagearea.append("You hear a sound like a door shutting then you start to move.  Slowly at first,  then very quickly.  Then you passout.\n\n");
			wait(2);
			welcomemessagearea.append("You wake up an unknown time later, with minimal weapons and armor with someone standing over.  They look at you for a moment, than ask you if you are ok?\n\n");
			wait(2);
			welcomemessagearea.append("And they want to know a few things about you, to prepare you for adventure.\n\n");
			wait(2);
			welcomemessagearea.append("Who I am is not important,  but I need your help.  What you see before you is the enterance to the dungeon.  Many of entered, but none of returned.\n\n");
			wait(2);
			welcomemessagearea.append("At the center of the dungeon is a treasure that is important to me.  Please retrieve it and you'll be greatly rewarded.\n\n");
			wait(4);
			f.dispose();



	}

	private static void wait(int seconds) {
		long start = System.nanoTime();
		while ((long) (System.nanoTime() - start) / (long) (1_000_000_000) < seconds) {

		}
	}

}
