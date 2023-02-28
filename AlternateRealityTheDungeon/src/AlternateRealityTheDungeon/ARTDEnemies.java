package AlternateRealityTheDungeon;



//https://gamedev.stackexchange.com/questions/81884/making-a-monster-encounter-method

//https://www.geeksforgeeks.org/inheritance-in-java/



public class ARTDEnemies 
{

	private static ARTDSpells single_instance_enemies;



	public static ARTDSpells Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_enemies == null) {
			single_instance_enemies = new ARTDSpells();
		}
		return single_instance_enemies;
	}
	
	
	public ARTDEnemies()
	{



		
		
	}
	
	
	
			
	
}
