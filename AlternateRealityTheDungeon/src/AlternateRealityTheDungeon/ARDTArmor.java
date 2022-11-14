package AlternateRealityTheDungeon;

import java.util.HashMap;

public class ARDTArmor {
	
	HashMap<String, Integer> Armour = new HashMap<String, Integer>();
	
	//Armour and Strength Required
	
	public void ArmourAvalible()
    {
		Armour.put("Cloth", 3);
		Armour.put("Leather", 6);
		Armour.put("Studded Leather", 9);
		Armour.put("Chain", 12);
		Armour.put("Plate", 15);
		Armour.put("Breast Plate", 18);
    }

}
