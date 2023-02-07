package ARTDEnemies;

import AlternateRealityTheDungeon.ARTDEnemies;

public class ARTDSpiders extends ARTDEnemies 
{
	
	public double sta;
	public double chr;
	public double str;
	public double inti;
	public double wis;
	public double agi;
	public double basedamage;
	private double basedefense;
	public double MonsterHP;
	
	
	public ARTDSpiders()
	{
	
		sta =1;
		chr =1;
		str = 1;
		inti =1;
		wis =1;
		agi =1;
		basedamage = 3;
		basedefense = 3;
		MonsterHP = 5;
		
	}
	
	public double attackdamage(double str, double basedamage)
	{
		
		double attackdamage = str + basedamage;
		
		return attackdamage;
	}
	
	public double defenseToDamage(double basedefense, double agi)
	{
		
		double defenseToDamage = basedefense+agi;
		
		return defenseToDamage;
	}
	
}
