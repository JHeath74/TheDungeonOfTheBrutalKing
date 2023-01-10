package ARTDCharecterClass;

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDClass;

public class ARTDRogue extends ARTDClass
{
	ARTDCharecter myChar = new ARTDCharecter();

	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility
	
	int Herolevel;
	
	public static String charClass;
	public static String RogueClassDescription;
	
	public ARTDRogue()
	{
		
		Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));
		
		charClass = "Rogue";
		
		RogueClassDescription = "As adventurers, " + ARTDRogue.charClass + " fall on both sides of the law. Some are hardened criminals "
				+ "who decide to seek their fortune in treasure hoards, while others enter a life of adventure to escape "
				+ "from the law. Others have learned and perfected their skills with the explicit purpose of infiltrating "
				+ "ancient ruins and hidden crypts in search of treasure. \n\n"
				+ "AGILITY (AGI) followed by Intelligence are important stats for a " + ARTDRogue.charClass;

	}

	@Override
	public double Heal() {
		
		double Heal = inti;
		return Heal;
	}

	@Override
	public double Cold_Blast() {
		double ColdBlast = inti;
		return ColdBlast;
	}

	@Override
	public double Conjure_Food() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Fire_Ball() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Light() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Location() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Shield() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double RandomStat() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Port() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
