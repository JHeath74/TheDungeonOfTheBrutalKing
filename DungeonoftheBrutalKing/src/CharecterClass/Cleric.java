package CharecterClass;

import DungeonoftheBrutalKing.Charecter;
import DungeonoftheBrutalKing.Class;

public class Cleric extends Class {

	Charecter myChar = new Charecter();

	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility


	int Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));

	public static String charclass = "Cleric";

	public static String ClassDescription;

	public Cleric()
	{

		charclass = "Cleric";

		ClassDescription = Cleric.charclass + " are versatile figures, both capable in combat and skilled in the use of "
				+ "divine magic. " + Cleric.charclass + " are powerful healers due to the large \n number of healing and "
				+ " curative magics available to them. \n\nWith divinely-granted abilities over life or death, they are \n"
				+ " also able to repel or control undead creatures."
				+ "	\n\nWisdom (WIS) is your most important stat,\n followed closely by INTELLIGENCE (INTI).";


	}

	public static String ClassDescription()
	{
		return ClassDescription = Cleric.charclass + " are versatile figures, both capable in combat and skilled in the use of "
				+ "divine magic. " + Cleric.charclass + " are powerful healers due to the large \n number of healing and "
				+ " curative magics available to them. \n\nWith divinely-granted abilities over life or death, they are \n"
				+ " also able to repel or control undead creatures."
				+ "	\n\nWisdom (WIS) is your most important stat,\n followed closely by INTELLIGENCE (INTI).";
	}


}
