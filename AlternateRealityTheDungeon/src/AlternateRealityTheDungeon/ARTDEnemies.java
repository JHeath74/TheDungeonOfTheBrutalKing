package AlternateRealityTheDungeon;

//https://gamedev.stackexchange.com/questions/81884/making-a-monster-encounter-method

//https://www.geeksforgeeks.org/inheritance-in-java/

public class ARTDEnemies 
{

	double sta;
	double chr;
	double str;
	double inti;
	double wis;
	double agi;
	double basedamage;

	
	public ARTDEnemies()
	{
		double sta;
		double chr;
		double str;
		double inti;
		double wis;
		double agi;
		double basedamage;
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
