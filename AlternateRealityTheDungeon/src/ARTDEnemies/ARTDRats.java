package ARTDEnemies;

import AlternateRealityTheDungeon.ARTDEnemies;

public class ARTDRats extends ARTDEnemies {
	

	
	
	public ARTDRats()
	{
		name = "Rat";
		sta = 1;
		chr = 1;
		str = 1;
		inti = 1;
		wis = 1;
		agi = 1;
		MonsterHP = 3;
		MonsterImage = "GiantRat.jpg";
		
		
	}
	
	public double attackdamage(double str)
	{
		
		double attackdamage = str * 1.1;
		
		return attackdamage;
	}
	
	public double defenseToDamage(double agi)
	{
		
		double defenseToDamage = agi * 1.4;
		
		return defenseToDamage;
	}
	
	
}
