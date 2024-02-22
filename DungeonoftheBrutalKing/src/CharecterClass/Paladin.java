package CharecterClass;

import AlternateRealityTheDungeon.Charecter;
import AlternateRealityTheDungeon.Class;

public class Paladin extends Class 
{
	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility
	
	int Herolevel;

	Charecter myChar = new Charecter();
	
	public static String charClass = "Paladin";
	
	public static String ClassDescription;
	
	public Paladin()
	{
		Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));
		
		charClass = "Paladin";
		
		

	}
	public static String ClassDescription()
	{
		return ClassDescription = "Compared with other classes the " + Paladin.charClass + " class has one of the most/n restrictive codes"
				+ " of conduct and paladin characters are expected to/n demonstrate and embody goodness. \n\n"
				+ "Wisdom (WIS) followed by Strength is most important stats for a " + Paladin.charClass;
	}
	
}
