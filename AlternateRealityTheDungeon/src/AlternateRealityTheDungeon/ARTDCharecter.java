package AlternateRealityTheDungeon;

import java.util.ArrayList;

public class ARTDCharecter {
	
	private static ARTDCharecter single_instance = null;
	ArrayList<String> CharInfo = new ArrayList<String>();
	
	// CharInfo[0] = Charecter Name
	// CharInfo[1] = Class
	// CharInfo[2] = Level
	// CharInfo[3] = Experience
	// CharInfo[4] = Hit Points
	// CharInfo[5] = Stat: Stamina
	// CharInfo[6] = Stat: Charisma
	// CharInfo[7] = Stat: Strength
	// CharInfo[8] = Stat: Intelligence
	// CharInfo[9] = Stat: Wisdom
	// CharInfo[10] = Stat: Agility
	// CharInfo[11] = Gold
	// CharInfo[12] = Food
	// CharInfo[13] = Water
	// CharInfo[14] = Torches
	// CharInfo[15] = Gems
	
	private ARTDCharecter()
	{

	}

	// Method
	// Static method to create instance of Singleton class
	public static ARTDCharecter Singleton()
	{
		// To ensure only one instance is created
		if (single_instance == null) {
			single_instance = new ARTDCharecter();
		}
		return single_instance;
	}
		



	

	 
}
