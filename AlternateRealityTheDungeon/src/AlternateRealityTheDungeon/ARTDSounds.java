package AlternateRealityTheDungeon;



import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ARTDSounds extends JFrame
{

	static boolean playCompleted;
	
	public static void Sound(String audioFilePath) {
		
		File audioFile = new File(audioFilePath);
		 
		 try {
	            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
	 
	            AudioFormat format = audioStream.getFormat();
	 
	            DataLine.Info info = new DataLine.Info(Clip.class, format);
	 
	            Clip audioClip = (Clip) AudioSystem.getLine(info);
	 
	 
	            audioClip.open(audioStream);
	             
	            audioClip.start();
	             
				/*
				 * while (!playCompleted) { // wait for the playback completes try {
				 * Thread.sleep(10); } catch (InterruptedException ex) { ex.printStackTrace(); }
				 * }
				 */
	             
	            audioClip.close();
	             
	        } catch (UnsupportedAudioFileException ex) {
	            System.out.println("The specified audio file is not supported.");
	            ex.printStackTrace();
	        } catch (LineUnavailableException ex) {
	            System.out.println("Audio line for playing back is unavailable.");
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            System.out.println("Error playing the audio file.");
	            ex.printStackTrace();
	        }
	}

	



	
}
