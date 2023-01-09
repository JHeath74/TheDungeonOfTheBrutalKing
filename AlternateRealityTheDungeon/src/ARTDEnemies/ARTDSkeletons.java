package ARTDEnemies;

import AlternateRealityTheDungeon.ARTDEnemies;

public class ARTDSkeletons extends ARTDEnemies {
	
	
	public double sta;
	public double chr;
	public double str;
	public double inti;
	public double wis;
	public double agi;
	public double basedamage;
	public double HP;
	
	
	public ARTDSkeletons()
	{
		
		double sta;
		double chr;
		double str;
		double inti;
		double wis;
		double agi;
		double basedamage;
		double HP = 7;
		
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
