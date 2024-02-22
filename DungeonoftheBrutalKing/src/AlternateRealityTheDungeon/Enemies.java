package AlternateRealityTheDungeon;

import java.util.ArrayList;

//https://gamedev.stackexchange.com/questions/81884/making-a-monster-encounter-method

//https://www.geeksforgeeks.org/inheritance-in-java/



public class Enemies 
{
	public ArrayList<String> myMonsters = new ArrayList<String>();
	private static Enemies single_instance_myEnemies;
	
	
	public double sta;
	public double chr;
	public double str;
	public double inti;
	public double wis;
	public double agi;
	public double MonsterHP;
	public String name;
	public String MonsterImage;
	public double basedamage;
	public double basedefense;
	public double gold;


	public static Enemies Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_myEnemies == null) {
			single_instance_myEnemies = new Enemies();
		}
		return single_instance_myEnemies;
	}
	

			
	
}
