package AlternateRealityTheDungeon;



//https://gamedev.stackexchange.com/questions/81884/making-a-monster-encounter-method

//https://www.geeksforgeeks.org/inheritance-in-java/



public class ARTDEnemies 
{

	private static ARTDEnemies single_instance_enemies;



	public static ARTDEnemies Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_enemies == null) {
			single_instance_enemies = new ARTDEnemies();
		}
		return single_instance_enemies;
	}
	
	
	public ARTDEnemies()
	{



		
		
	}
	
	
	
			
	
}
