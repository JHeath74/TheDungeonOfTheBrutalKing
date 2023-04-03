package ARTDCharecterClass;

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
	
	public static String charClass;
	
	public static String BardClassDescription;

	public ARTDBard()
	{

		int Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));
		
		charClass = "Bard";
		
		BardClassDescription = "A "  + ARTDBard.charClass 	+ " is traditionally defined as a poet, especially one who writes \n"
				+ " impassioned, lyrical, or epic verse. " + ARTDBard.charClass + " are a playable \n"
				+ " class centered on the idea of accessing magic through some form of artistic expression.\n"
				+ "\n Charisma (CHA) is an important skill for a " + ARTDBard.charClass;

		
	}

	}


