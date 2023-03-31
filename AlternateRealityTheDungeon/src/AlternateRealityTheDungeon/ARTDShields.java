package AlternateRealityTheDungeon;

public class ARTDShields {

	private static ARTDShields single_instance_shields;
	protected ARTDSingleton myChar = new ARTDSingleton();
	
	public String name;
	public int requiredStrength;
	public String charStrength;
	public int defenseProvided;
	
	public ARTDShields() {
		
	}
	
	public static ARTDShields Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_shields == null) {
			single_instance_shields = new ARTDShields();
		}
		return single_instance_shields;
	}

}
