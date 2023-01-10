package ARTDCharecterClass;

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDClass;

public class ARTDHunter extends ARTDClass
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
	
	public static String HunterClassDescription;
	
	public ARTDHunter()
	{
		Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));
		
		charClass = "Hunter";
		
		HunterClassDescription = ARTDHunter.charClass + "finds its place as a bulwark between civilization and the terrors of the wilderness.\n"
				+ "Despite its namesake, tracking mere game is only a minor task in the hunter's repertoire of expertise. \n"
				+ "Its specialized battle techniques can fell rampaging ogres to hordes of orcs."
				+ "\n\nStamina (STA) is an important skill for a " + ARTDHunter.charClass;

		
	}

	//Spells
	
	public double Heal()
	{
	
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
