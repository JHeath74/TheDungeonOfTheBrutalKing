package AlternateRealityTheDungeon;

import java.io.File;

import javax.sound.sampled.*;


public class ARTDMusicPlayer implements Runnable{
   
	//https://www.geeksforgeeks.org/play-audio-file-using-java/
	
	private static Clip clip = null;
    File file = null;
    private String soundType = null;
    static String SoundFilePath = "src\\AlternateRealityTheDungeon\\SoundEffects\\";
    
    public ARTDMusicPlayer(String soundType) {
        this.soundType = soundType;
    }

	@Override
	public void run() {
		 try {
	        	
	        	AudioInputStream musicInputStream = AudioSystem.getAudioInputStream(
	        			  new File(SoundFilePath + soundType));
	            
	            clip = AudioSystem.getClip();
	            clip.open(musicInputStream);
	            clip.loop(Clip.LOOP_CONTINUOUSLY);
	        } catch (Exception e) {
	            System.err.println("Error Message: " + e.getMessage());
	        }
	    }

	    public static void stopMusic() {
	        if (clip != null && clip.isRunning()) {
	           // clip.stop();
	        	clip.close();
	        }
		
	}
}
