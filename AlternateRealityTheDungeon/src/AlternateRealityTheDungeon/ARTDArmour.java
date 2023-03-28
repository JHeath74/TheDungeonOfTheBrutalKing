package AlternateRealityTheDungeon;

import java.util.ArrayList;

public class ARTDArmour {
	
	public ArrayList<String> myArmour = new ArrayList<String>();
	private static ARTDArmour single_instance_armour;
	
	protected ARTDSingleton myChar = new ARTDSingleton();
	
	public String name;
	public int armourDefense;
	public int requiredStrength;
	public String charStrength;
	



	public static ARTDArmour Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_armour == null) {
			single_instance_armour = new ARTDArmour();
		}
		return single_instance_armour;
	}

	
	


    	
	  
    		
    
}
