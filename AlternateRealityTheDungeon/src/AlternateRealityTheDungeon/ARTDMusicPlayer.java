package AlternateRealityTheDungeon;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ARTDMusicPlayer{
   
	//https://www.geeksforgeeks.org/play-audio-file-using-java/
	
	static String SoundFilePath;
	private static Clip clip;
	static String soundType;
	
    
    public ARTDMusicPlayer()
    {
    	this.SoundFilePath = "src\\AlternateRealityTheDungeon\\SoundEffects\\";
    	this.clip = null;
    	this.soundType = null;
    	
       
    }
    
    public void midiPlayer(String soundType) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
    	// create AudioInputStream object
        AudioInputStream audioInputStream = 
                AudioSystem.getAudioInputStream(new File(SoundFilePath + soundType).getAbsoluteFile());
          
        // create clip reference
        clip = AudioSystem.getClip();
          
        // open audioInputStream to the clip
        clip.open(audioInputStream);
          
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    	
    	
    }
    
    public static void stopMidi() {
	        if (clip != null && clip.isRunning()) {
                clip.stop();
	           // clip.stop();
	        	clip.close();
	        }
    }
    
    public void mp3Player()
    {
    	
    }

	
}
