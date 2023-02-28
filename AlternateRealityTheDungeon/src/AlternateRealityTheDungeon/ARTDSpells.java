package AlternateRealityTheDungeon;



public class ARTDSpells {
	
	private static ARTDSpells single_instance_spells;



	public static ARTDSpells Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_spells == null) {
			single_instance_spells = new ARTDSpells();
		}
		return single_instance_spells;
	}
	
	
/* 	Heal; // Heal yourself
	Cold_Blast; // Cast a blast of cold to hurt a monster
	Conjure_Food; // provide 1-3 food to keep you feed.
	Fire_Ball; // Cast a fireball to hurt a monster
	Light; // Provide light for a short time
	Location; // Find your location in the game
	Shield; // Increases your protection for a short time
	RandomStat; //Increases a random Stat for a short time
    Port; // Port to the Dungeon Entrance
 */

	

}
