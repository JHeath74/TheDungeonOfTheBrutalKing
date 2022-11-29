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
		
	
	enum labels {
		sta, chr, str, inti, wis, agi
	}

	public static final String[] toonclass = { "Paladin", "Cleric", "Rogue", "Hunter", "Warrior", "Bard" };

	public static final String[] toonclassDescription = {
			"Compared with other classes the " + toonclass[0] + " class has one of the most restrictive codes"
					+ " of conduct and paladin characters are expected to demonstrate and embody goodness. \n\n"
					+ "Wisdom (WIS) followed by Strength is most important stats for a " + toonclass[0],

			toonclass[1] + " are versatile figures, both capable in combat and skilled in the use of "
					+ "divine magic (thaumaturgy)." + toonclass[1]
					+ " are powerful healers due to the large number of healing and"
					+ " curative magics available to them. With divinely-granted abilities over life or death, they are"
					+ " also able to repel or control undead creatures. \n\n"
					+ "Wisdom (WIS) is your most important stat, followed closely by INTELLIGENCE (INT).",

			"As adventurers, " + toonclass[2] + " fall on both sides of the law. Some are hardened criminals "
					+ "who decide to seek their fortune in treasure hoards, while others enter a life of adventure to escape "
					+ "from the law. Others have learned and perfected their skills with the explicit purpose of infiltrating "
					+ "ancient ruins and hidden crypts in search of treasure. \n\n"
					+ "AGILITY (AGI) followed by Intelligence (INT) are important stats for a " + toonclass[2],

			"A " + toonclass[3]
					+ "finds its place as a bulwark between civilization and the terrors of the wilderness. "
					+ "Despite its namesake, tracking mere game is only a minor task in the hunter's repertoire of expertise. "
					+ "Its specialized battle techniques can fell rampaging ogres to hordes of orcs.\n\n"
					+ "Stamina (STA) is an important skill for a " + toonclass[3],

			toonclass[4] + " share an unparalleled mastery with weapons and armor, and a thorough knowledge "
					+ "of the skills of combat. They are well acquainted with death, both meting it out and staring it defiantly "
					+ "in the face. " + toonclass[4]
					+ " share an unparalleled mastery with weapons and armor, and a thorough knowledge of the "
					+ "skills of combat. They are well acquainted with death, both meting it out and staring it defiantly in the face.\n\n"
					+ "Strength (STR) is an important skill for a " + toonclass[4],

			"A " + toonclass[5]
					+ " is traditionally defined as \"a poet, especially one who writes impassioned, lyrical,"
					+ " or epic verse.\"  " + toonclass[5] + " are a playable "
					+ "class centered on the idea of accessing magic through some form of artistic expression \n\n"
					+ "Charisma (CHA) is an important skill for a " + toonclass[5]

	};
	

	 
}
