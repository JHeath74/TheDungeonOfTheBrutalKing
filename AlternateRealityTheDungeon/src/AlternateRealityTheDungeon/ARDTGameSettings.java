package AlternateRealityTheDungeon;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ARDTGameSettings
{
	Color colorBrown, colorLightBrown, colorLightYellow, colorBlack, colorWhite,
				 colorLightGreen, colorVeryLightRed, colorVeryDarkBlue, colorVeryLightBlue, colorMagenta,
				 colorAqua, colorOlive, colorTeal, colorLightSalmon, colorFireBrick, colorMaroon,
				 colorCoral, colorIndianRed, colorDarkGoldenRod, colorGoldenRod, colorPaleGoldenRod,
				 colorDarkKhaki, colorMediumBlue, colorBlue, colorPurple, colorGreen, colorPlum = null;
	
	
	Font fontTimesNewRoman, fontAvatar, fontLomoCopyLTStdMidi = null;
	
	BufferedImage myJMenuBarPicture = null;
	
	String ProgramImagePath, MonsterImagePath, FontPath;
	
	
	public ARDTGameSettings()
	{
		ProgramImagePath = "src\\AlternateRealityTheDungeon\\Images\\Program\\";
		MonsterImagePath = "src\\AlternateRealityTheDungeon\\Images\\Monsters\\";
		FontPath = "src\\AlternateRealityTheDungeon\\Fonts\\";
		
		//https://www.rapidtables.com/web/color/RGB_Color.html
		
		//*********************************************************************************
		//--------------------------- Colors ----------------------------------------------
		//*********************************************************************************
		
		colorBrown = new Color(165, 42, 42);
		colorLightBrown = new Color(196, 164, 132);
		colorLightYellow = new Color( 255, 255, 224);
		colorBlack = new Color(25, 50, 75);
		colorWhite = new Color(255,255,255);
		colorLightGreen = new Color(102,255,102);
		colorVeryLightRed = new Color(153,0,0);
		colorVeryDarkBlue = new Color(0,0,153);
		colorVeryLightBlue = new Color(51,204,255);
		colorAqua = new Color(0,255,255);
		colorMagenta = new Color(255,0,255);
		colorOlive = new Color(128,128,0);
		colorTeal = new Color(0,128,128);
		colorLightSalmon = new Color(255,160,122);
		colorFireBrick = new Color(178,34,34);
		colorMaroon = new Color(128,0,0);
		colorCoral = new Color(255,127,80);
		colorIndianRed = new Color(205,92,92);
		colorDarkGoldenRod = new Color(184,134,11);
		colorGoldenRod = new Color(218,165,32);
		colorPaleGoldenRod = new Color(238,232,170);
		colorDarkKhaki = new Color(189,183,107);
		colorMediumBlue = new Color(0,0,205);
		colorBlue = new Color(0,128,255);
		colorPurple = new Color(153,51,255);
		colorGreen = new Color(0,204,102);
		colorPlum = new Color(221,160,221);
		
		
		//*********************************************************************************
		//--------------------------- Fonts ----------------------------------------------
		//*********************************************************************************
		
		fontTimesNewRoman = new Font("Times New Roman", Font.PLAIN, 20);
		fontAvatar = new Font(FontPath + "avatar.ttf", Font.PLAIN, 20);
		fontLomoCopyLTStdMidi = new Font(FontPath+"LomoCopyLTSdMidi.ttf", Font.PLAIN, 20);
		
		
		
		//*********************************************************************************
		//--------------------------- Pictures ----------------------------------------------
		//*********************************************************************************
		try {
			myJMenuBarPicture = ImageIO.read(new File(ProgramImagePath + "AlternateReality - MenuBar.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}


}
