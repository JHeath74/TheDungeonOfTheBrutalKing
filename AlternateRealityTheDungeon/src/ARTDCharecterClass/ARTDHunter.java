package ARTDCharecterClass;

import AlternateRealityTheDungeon.ARTDClass;

public class ARTDHunter extends ARTDClass
{

	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility
	
	public static String charClass;
	
	public static String HunterClassDescription;
	
	public ARTDHunter()
	{
		
		charClass = "Hunter";
		
		HunterClassDescription = ARTDHunter.charClass + "finds its place as a bulwark between civilization and the terrors of the wilderness.\n"
				+ "Despite its namesake, tracking mere game is only a minor task in the hunter's repertoire of expertise. \n"
				+ "Its specialized battle techniques can fell rampaging ogres to hordes of orcs."
				+ "\n\nStamina (STA) is an important skill for a " + ARTDHunter.charClass;
		
		//A multiplier for using agility weapons in combat.
		sta = 5;
		chr = 1;
		str = 1;
		inti = 1;
		wis = 1;
		agi = 1;
		
	}
}
