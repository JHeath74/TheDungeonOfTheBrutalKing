package CharecterClass;

import DungeonoftheBrutalKing.Charecter;
import DungeonoftheBrutalKing.Class;

public class Warrior extends Class {

	Charecter myChar = new Charecter();

	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility

	int Herolevel;

	public static String charClass = "Warrior";

	public static String ClassDescription;

	public Warrior()
	{
		Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));

		charClass = "Warrior";



	}

	public static String ClassDescription()
	{
		return ClassDescription = Warrior.charClass + " share an unparalleled mastery with weapons and armor, and a thorough knowledge \n"
				+ "	of the skills of combat. They are well acquainted with death, both meting it out and staring it defiantly \n"
				+ "	in the face. " + Warrior.charClass + " share an unparalleled mastery with weapons and armor,"
				+ " and a thorough knowledge of the \n"
				+ "	skills of combat. They are well acquainted with death, both meting it out and staring"
				+ " it defiantly in the face. \n"
				+ "\n"
				+ "	Strength (STR) is an important skill for a " + Warrior.charClass;

	}

}
