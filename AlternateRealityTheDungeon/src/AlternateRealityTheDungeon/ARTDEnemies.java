package AlternateRealityTheDungeon;

import java.util.ArrayList;
import java.util.List;

import ARTDEnemies.ARTDRats;
import ARTDEnemies.ARTDSkeletons;
import ARTDEnemies.ARTDSpiders;

//https://gamedev.stackexchange.com/questions/81884/making-a-monster-encounter-method

//https://www.geeksforgeeks.org/inheritance-in-java/



public class ARTDEnemies 
{

	List<ARTDEnemies> monsterList = new ArrayList<ARTDEnemies>();
	
	
	public ARTDEnemies()
	{

		monsterList.add(new ARTDRats());
		monsterList.add(new ARTDSkeletons());
		monsterList.add(new ARTDSpiders());

		
		
	}
	
	
	
			
	
}
