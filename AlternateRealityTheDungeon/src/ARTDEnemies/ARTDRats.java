package ARTDEnemies;

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDEnemies;


public class ARTDRats extends ARTDEnemies {
	
	public double sta;
	public double chr;
	public double str;
	public double inti;
	public double wis;
	public double agi;
	public double basedamage;
	public double HP;
	public double HeroHP;
	
	ARTDCharecter myChar = ARTDCharecter.Singleton();
	
	
	
	public ARTDRats()
	{

		double sta;
		double chr;
		double str;
		double inti;
		double wis;
		double agi;
		double basedamage;
		double HP =3;
		
		
	}
	
	public double attackdamage(double str, double basedamage)
	{
		
		double attackdamage = str + basedamage;
		
		return attackdamage;
	}
	
	public double defenseToDamage(double str, double agi)
	{
		
		double defenseToDamage = str+agi;
		
		return defenseToDamage;
	}
	
	
}
