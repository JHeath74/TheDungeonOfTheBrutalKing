package AlternateRealityTheDungeon;

public class ARTDPaladin extends ARTDClass 
{
	int sta; //Stamina
	int chr; //Charisma
	int str; //Strength
	int inti; //Intelligence
	int wis; //Wisdom
	int agi; //Agility

	public static String charClass = "Paladin";
	
	public static String PaladinClassDescription;
	public ARTDPaladin()
	{
		charClass = "Paladin";
		
		PaladinClassDescription = "Compared with other classes the " + ARTDPaladin.charClass + " class has one of the most/n restrictive codes"
				+ " of conduct and paladin characters are expected to/n demonstrate and embody goodness. \n\n"
				+ "Wisdom (WIS) followed by Strength is most important stats for a " + ARTDPaladin.charClass;
		
		//A multiplier for using strength weapons in combat.
		sta = 3;
		chr = 1;
		str = 1;
		inti = 1;
		wis = 3;
		agi = 1;
	}
}
