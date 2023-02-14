package AlternateRealityTheDungeon;

import java.util.ArrayList;
import java.util.List;

import ARTDEnemies.ARTDRats;
import ARTDEnemies.ARTDSkeletons;
import ARTDEnemies.ARTDSpiders;

public class ARTDSingleton 
{

	private static ARTDCharecter myChar = ARTDCharecter.Singleton();
	private static ARTDArmour single_instance_armour = ARTDArmour.Singleton();
	
	private static List<ARTDEnemies> monsterList = addEnemies();
	
	public static ARTDCharecter myCharSingleton()
	{
		return myChar;
	}
	
	public static ARTDArmour single_instance_armour()
	{
		return single_instance_armour;
	}
	
	public static List<ARTDEnemies> monsterList()
	{
		
		return monsterList;
		
	}
	
	private static List<ARTDEnemies> addEnemies()
	{
		monsterList = new ArrayList<ARTDEnemies>();
		
		monsterList.add(new ARTDRats());
		monsterList.add(new ARTDSkeletons());
		monsterList.add(new ARTDSpiders());
		return monsterList;
	}
	
	
}
