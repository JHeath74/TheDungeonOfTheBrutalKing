package AlternateRealityTheDungeon;

import java.io.File;

import javax.sound.sampled.*;


public class ARTDMusicPlayer implements Runnable{
    private static Clip clip = null;
    File file = null;
    private String musicType = null;
    static String SoundEffectsFilePath = "src\\AlternateRealityTheDungeon\\SoundEffects\\";
    
    public ARTDMusicPlayer(String musicType) {
        this.musicType = musicType;
    }

	@Override
	public void run() {
		 try {
	        	
	        	AudioInputStream musicInputStream = AudioSystem.getAudioInputStream(
	        			  new File(SoundEffectsFilePath + musicType));
	            
	            clip = AudioSystem.getClip();
	            clip.open(musicInputStream);
	            clip.loop(Clip.LOOP_CONTINUOUSLY);
	        } catch (Exception e) {
	            System.err.println("Error Message: " + e.getMessage());
	        }
	    }

	    public static void stopMusic() {
	        if (clip != null && clip.isRunning()) {
	            clip.stop();
	        }
		
	}
}
