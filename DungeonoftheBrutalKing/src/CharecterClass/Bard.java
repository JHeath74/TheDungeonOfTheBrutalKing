package CharecterClass;

import DungeonoftheBrutalKing.Charecter;
import DungeonoftheBrutalKing.Class;

public class Bard extends Class{


	Charecter myChar = new Charecter();

	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility

	public static String charClass = "Bard";

	public static String ClassDescription;
	public static String BardImage;

	public Bard()
	{

		int Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));

		charClass = "Bard";

		BardImage = "Bard.webp";


	}

	public static String ClassDescription()
	{
		return ClassDescription = "A "  + Bard.charClass 	+ " is traditionally defined as a poet, especially one who writes \n"
				+ " impassioned, lyrical, or epic verse. " + Bard.charClass + " are a playable \n"
				+ " class centered on the idea of accessing magic through some form of artistic expression.\n"
				+ "\n Charisma (CHA) is an important skill for a " + Bard.charClass;
	}

	}


