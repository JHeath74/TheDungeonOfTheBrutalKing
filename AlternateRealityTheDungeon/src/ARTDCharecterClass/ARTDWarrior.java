package ARTDCharecterClass;

public class ARTDWarrior {

	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility
	
	public static String charClass;
	
	public static String WarriorClassDescription;
	
	public ARTDWarrior()
	{
		
		charClass = "Warrior";
		
		WarriorClassDescription = ARTDWarrior.charClass + " share an unparalleled mastery with weapons and armor, and a thorough knowledge \"\r\n"
				+ "					 of the skills of combat. They are well acquainted with death, both meting it out and staring it defiantly \"\r\n"
				+ "					 in the face. " + ARTDWarrior.charClass
				+ "					  share an unparalleled mastery with weapons and armor, and a thorough knowledge of the \"\r\n"
				+ "					 skills of combat. They are well acquainted with death, both meting it out and staring it defiantly in the face.\\n\\n\"\r\n"
				+ "					 Strength (STR) is an important skill for a " + ARTDWarrior.charClass;
		
		//A multiplier for using strength weapons in combat.
		sta = 5;
		chr = 1;
		str = 1;
		inti = 1;
		wis = 1;
		agi = 1;
		
	}
	
}
