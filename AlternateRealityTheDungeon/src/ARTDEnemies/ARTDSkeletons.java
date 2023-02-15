package ARTDEnemies;

import AlternateRealityTheDungeon.ARTDEnemies;

public class ARTDSkeletons extends ARTDEnemies {
	
	
	public double sta;
	public double chr;
	public double str;
	public double inti;
	public double wis;
	public double agi;
	public double MonsterHP;
	
	
	public ARTDSkeletons()
	{
		
		sta =1;
		chr =1;
		str = 2;
		inti =1;
		wis =1;
		agi =2;

		MonsterHP = 7;
		
	}
	
	public double attackdamage(double str)
	{
		
		double attackdamage = str * 1.7;
		
		return attackdamage;
	}
	
	public double defenseToDamage(double agi)
	{
		
		double defenseToDamage = agi * 1.7;
		
		return defenseToDamage;
	}

}
