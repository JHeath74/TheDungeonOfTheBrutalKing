package AlternateRealityTheDungeon;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ARDTMessages {
	
	
	public void WelcomeMessage() throws InterruptedException {
		
		JFrame f= new JFrame("Your Adventure Awaits");  
        JTextArea area=new JTextArea();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        area.setBounds(10,30, 400,400); 
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        
        f.add(area);  
        f.setSize(450,500);  
        f.setLayout(null);  
        f.setVisible(true);  
        
        area.setText("On your way home from your last adventure you are set upon on my an unknown group of people.\n\n");
        TimeUnit.SECONDS.sleep(5);
        area.append("You feel yourself being carried for a while and then dropped on something hard.\n\n");
        TimeUnit.SECONDS.sleep(5);
        area.append("You hear a sound like a door shutting then you start to move.  Slowly at first,  then very quickly.  Then you passout.\n\n");
        TimeUnit.SECONDS.sleep(5);
        area.append("You wake up an unknown time later, and see someone standing there.  They look at you for a moment, than ask you if you are ok?\n\n");
        TimeUnit.SECONDS.sleep(5);
        area.append("And they want to know a few things about you, to prepare you for adventure.\n\n");
        TimeUnit.SECONDS.sleep(5);
        area.append("Who I am is not important,  but I need your help.  What you see before you is the enterance to the dungeon.  Many of entered, but none of returned.\n\n");
        TimeUnit.SECONDS.sleep(5);
        area.append("At the center of the dungeon is a treasure greater than is possible to comprehend.  Please retrieve it for me and you'll be greatly rewarded.\n\n");
        TimeUnit.SECONDS.sleep(10);
        
        f.dispose();
		
	}

}
