package AlternateRealityTheDungeon;

import java.awt.image.BufferedImage;


import javax.swing.JLabel;

public class ARTDMaps {
	
	
	protected int[][] MapFloor1;
	protected int[][] MapFloor2;
	protected int[][] MapFloor3;
	protected int[][] MapFloor4; 
	
	public int TILE_SIZE = 0;
	
	protected BufferedImage wallTexture = null;
	protected BufferedImage floorTexture = null;
	protected BufferedImage doorTexture = null;
	protected BufferedImage stairTexture = null;
	
	protected String wallImage = null;
	protected String floorImage = null;
	protected String doorImage = null;
	protected String stairImage = null;
	
	public BufferedImage myPicture = null;
	public JLabel wallLabel, floorLabel, doorLabel, stairLabel  = null;
	protected String wallImagePath = "";
	protected String doorImagePath= "";
	protected String stairImagePath = "";
	protected String floorImagePath = "";
	
	protected ARTDMenu myMenu = null;
}
