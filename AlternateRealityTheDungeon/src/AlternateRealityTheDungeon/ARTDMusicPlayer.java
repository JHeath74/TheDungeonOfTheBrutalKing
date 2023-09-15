package AlternateRealityTheDungeon;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.sound.sampled.SourceDataLine;

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
    
    public void mp3Player(String soundType) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
    	
    	System.out.println("SoundFilePath: " + SoundFilePath);
    	System.out.println("soundType: " + soundType);
    	
    	InputStream inputStream = getClass().getClassLoader().getResourceAsStream(SoundFilePath + soundType);
    	
    	System.out.println("Working: " + inputStream);
    	
    	AudioInputStream audioStream = AudioSystem.getAudioInputStream(inputStream);
    	AudioFormat audioFormat = audioStream.getFormat();
    	DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
    	
    	Clip audioClip = (Clip) AudioSystem.getLine(info);
    	audioClip.addLineListener((LineListener) this);
    	audioClip.open(audioStream);
    	audioClip.start();
    	
    	audioClip.close();
    	audioStream.close();
    }
    

    
	public static void stopMP3()
	{
		
	}

	
}
