package AlternateRealityTheDungeon;

public class ARTDCleric extends ARTDClass {
	
	
	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility
	
	public static String charclass;
	
	public static String ClericClassDescription;

	public ARTDCleric()
	{
		
		charclass = "Cleric";
		
		ClericClassDescription = ARTDCleric.charclass + " are versatile figures, both capable in combat and skilled in the use of "
				+ "divine magic. " + ARTDCleric.charclass + " are powerful healers due to the large \n number of healing and "
				+ " curative magics available to them. \n\nWith divinely-granted abilities over life or death, they are \n"
				+ " also able to repel or control undead creatures."
				+ "	\n\nWisdom (WIS) is your most important stat,\n followed closely by INTELLIGENCE (INTI).";
		
		//A multiplier for using weapons, encounters and casting spells
		sta = 1;
		chr = 1;
		str = 1;
		inti = 3;
		wis = 3;
		agi = 1;
		
		
	}
	

}
