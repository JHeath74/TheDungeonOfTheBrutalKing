package ARTDCharecterClass;

import javax.swing.ImageIcon;

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDClass;

public class ARTDBard extends ARTDClass{
	
	
	ARTDCharecter myChar = new ARTDCharecter();
	
	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility
	
	public static String charClass = "Bard";
	
	public static String ClassDescription;
	public static String BardImage;

	public ARTDBard()
	{

		int Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));
		
		charClass = "Bard";
		
		BardImage = "Bard.webp";

		
	}
	
	public static String ClassDescription()
	{
		return ClassDescription = "A "  + ARTDBard.charClass 	+ " is traditionally defined as a poet, especially one who writes \n"
				+ " impassioned, lyrical, or epic verse. " + ARTDBard.charClass + " are a playable \n"
				+ " class centered on the idea of accessing magic through some form of artistic expression.\n"
				+ "\n Charisma (CHA) is an important skill for a " + ARTDBard.charClass;
	}

	}


