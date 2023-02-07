package ARTDEnemies;


import AlternateRealityTheDungeon.ARTDEnemies;


public class ARTDRats extends ARTDEnemies {
	
	public double sta;
	public double chr;
	public double str;
	public double inti;
	public double wis;
	public double agi;
	public double basedamage;
	private double basedefense;
	public double MonsterHP;

	

	
	
	
	public ARTDRats()
	{

		sta =1;
		chr =1;
		str = 1;
		inti =1;
		wis =1;
		agi =1;
		basedamage = 2;
		basedefense = 1;
		MonsterHP = 3;
		
		
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
