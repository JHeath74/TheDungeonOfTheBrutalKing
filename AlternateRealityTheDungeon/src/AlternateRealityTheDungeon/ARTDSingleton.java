package AlternateRealityTheDungeon;

import java.util.ArrayList;
import java.util.List;

import ARTDArmour.ARTDBreastPlate;
import ARTDArmour.ARTDChain;
import ARTDArmour.ARTDCloth;
import ARTDArmour.ARTDLeather;
import ARTDArmour.ARTDPlate;
import ARTDArmour.ARTDSkin;
import ARTDArmour.ARTDStuddedLeather;
import ARTDEnemies.ARTDRats;
import ARTDEnemies.ARTDSkeletons;
import ARTDEnemies.ARTDSpiders;

public class ARTDSingleton 
{

	private static ARTDCharecter myChar = ARTDCharecter.Singleton();
	//private static ARTDArmour single_instance_armour = ARTDArmour.Singleton();
	
	
	private static List<ARTDArmour> armourList = addArmour();
	private static List<ARTDEnemies> monsterList = addEnemies();
	
	public static ARTDCharecter myCharSingleton()
	{
		return myChar;
	}
	
	public static List<ARTDArmour> armourList()
	{
		return armourList;
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
	
	private static List<ARTDArmour> addArmour()
	{
		armourList = new ArrayList<ARTDArmour>();	
		
		  armourList.add(new ARTDSkin());
		  armourList.add(new ARTDCloth());
		  armourList.add(new ARTDLeather());
		  armourList.add(new ARTDStuddedLeather());
		  armourList.add(new ARTDChain());
		  armourList.add(new ARTDBreastPlate());
		  armourList.add(new ARTDPlate());
		
		return armourList;
		
	}
	
	
}
