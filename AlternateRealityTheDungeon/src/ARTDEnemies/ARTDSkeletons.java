package ARTDEnemies;

import AlternateRealityTheDungeon.ARTDEnemies;

public class ARTDSkeletons extends ARTDEnemies {

	public ARTDSkeletons()
	{
		name = "Skeleton";
		sta =1;
		chr =1;
		str = 2;
		inti =1;
		wis =1;
		agi =2;
		MonsterHP = 7;
		
		MonsterImage = "Skeleton.jpg";
		
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
