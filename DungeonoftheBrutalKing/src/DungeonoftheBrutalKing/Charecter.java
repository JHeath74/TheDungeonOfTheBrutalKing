package DungeonoftheBrutalKing;

import java.util.ArrayList;

public class Charecter {


	private static Charecter single_instance_myChar;
	public ArrayList<String> CharInfo = new ArrayList<>();

	public ArrayList<String> SpellsLearned = new ArrayList<>();

	//int combatSpells = 21;

	//Add Magic Points

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
	// CharInfo[16] = Weapon
	// CharInfo[17] = Armour
	// CharInfo[18] = Shield
	// CharInfo[19] = Map Location
	// CharInfo[20] = Morality

	//Acquired Spells

	// CharInfo[21]
	// CharInfo[22]
	// CharInfo[23]
	// CharInfo[24]
	// CharInfo[25]
	// CharInfo[26]
	// CharInfo[27]
	// CharInfo[28]
	// CharInfo[29]
	// CharInfo[30]
	// CharInfo[31]


	public Charecter()
	{

	}

	// Method
	// Static method to create instance of Singleton class
	public static Charecter Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_myChar == null) {
			single_instance_myChar = new Charecter();
		}
		return single_instance_myChar;
	}








}
