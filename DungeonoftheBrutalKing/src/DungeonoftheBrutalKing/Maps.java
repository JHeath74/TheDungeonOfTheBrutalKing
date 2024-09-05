package DungeonoftheBrutalKing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Maps{

	public static int mapWidth;
	public static int mapHeight;
	public static int mapLevel;

	
	public static int[][][] DungeonLevel1;
	public static int[][][] DungeonLevel2;
	public static int[][][] DungeonLevel3;
	public static int[][][] DungeonLevel4;
}

//0 = Floor
//1 = Wall
//2 = Door
//3 = Arch
//4 = Stairs
