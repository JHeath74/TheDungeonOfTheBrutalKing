package ARTDCharecterClass;

import AlternateRealityTheDungeon.ARTDClass;

public class ARTDBard extends ARTDClass{
	
	
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

		charClass = "Bard";
		
		BardClassDescription = "A "  + ARTDBard.charClass 	+ " is traditionally defined as a poet, especially one who writes \n"
				+ " impassioned, lyrical, or epic verse. " + ARTDBard.charClass + " are a playable \n"
				+ " class centered on the idea of accessing magic through some form of artistic expression.\n"
				+ "\n Charisma (CHA) is an important skill for a " + ARTDBard.charClass;

		
		//A multiplier for using weapons, encounters and charming someone
		sta = 1;
		chr = 5;
		str = 1;
		inti = 1;
		wis = 1;
		agi = 1;
		
	}
}


