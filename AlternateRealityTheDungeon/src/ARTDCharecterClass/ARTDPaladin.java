package ARTDCharecterClass;

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDClass;

public class ARTDPaladin extends ARTDClass 
{
	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility
	
	int Herolevel;

	ARTDCharecter myChar = new ARTDCharecter();
	
	public static String charClass = "Paladin";
	
	public static String PaladinClassDescription;
	public ARTDPaladin()
	{
		Herolevel = myChar.CharInfo.indexOf(myChar.CharInfo.get(2));
		
		charClass = "Paladin";
		
		PaladinClassDescription = "Compared with other classes the " + ARTDPaladin.charClass + " class has one of the most/n restrictive codes"
				+ " of conduct and paladin characters are expected to/n demonstrate and embody goodness. \n\n"
				+ "Wisdom (WIS) followed by Strength is most important stats for a " + ARTDPaladin.charClass;

	}
	@Override
	public double Heal() {
		double Heal = inti + Herolevel;
		
		return Heal;
	}
	@Override
	public double Cold_Blast() {
		double ColdBlast = inti + Herolevel;
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
