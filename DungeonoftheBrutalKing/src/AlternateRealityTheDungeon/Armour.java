package AlternateRealityTheDungeon;

import java.util.ArrayList;

public class Armour {
	
	public ArrayList<String> myArmour = new ArrayList<String>();
	private static Armour single_instance_armour;
	
	protected Singleton myChar = new Singleton();
	
	public String name;
	public int armourDefense;
	public int requiredStrength;
	public String charStrength;
	



	public static Armour Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_armour == null) {
			single_instance_armour = new Armour();
		}
		return single_instance_armour;
	}

	
	


    	
	  
    		
    
}
