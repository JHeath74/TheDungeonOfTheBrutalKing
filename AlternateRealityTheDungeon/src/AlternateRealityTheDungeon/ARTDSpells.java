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

	

}
