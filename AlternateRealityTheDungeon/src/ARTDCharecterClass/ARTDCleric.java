package ARTDCharecterClass;

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDClass;

public class ARTDCleric extends ARTDClass {
	
	ARTDCharecter myChar = new ARTDCharecter();
	
	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility
	
	
	int Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));
	
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
		
		
	}
	
	public double Heal()
	{
	
		double Heal = inti + 10 + Herolevel;  
		return Heal;
	}

	@Override
	public double Cold_Blast() {
		
		double ColdBlast = inti + 10 + Herolevel;
		return ColdBlast;
	}

	@Override
	public double Conjure_Food() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Fire_Ball() {
		double Fireball = inti + 10 + Herolevel;
		return Fireball;
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
