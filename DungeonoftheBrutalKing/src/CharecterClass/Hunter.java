package CharecterClass;

import AlternateRealityTheDungeon.Charecter;
import AlternateRealityTheDungeon.Class;

public class Hunter extends Class
{

	Charecter myChar = new Charecter();
	
	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility
	
	int Herolevel;
	
	public static String charClass = "Hunter";
	
	public static String ClassDescription;
	
	public Hunter()
	{
		Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));
		
		charClass = "Hunter";
		
		

		
	}
	
	public static String ClassDescription()
	{
		return ClassDescription = Hunter.charClass + "finds its place as a bulwark between civilization and the terrors of the wilderness.\n"
				+ "Despite its namesake, tracking mere game is only a minor task in the hunter's repertoire of expertise. \n"
				+ "Its specialized battle techniques can fell rampaging ogres to hordes of orcs."
				+ "\n\nStamina (STA) is an important skill for a " + Hunter.charClass;
	}

	//Spells
	
	
}
