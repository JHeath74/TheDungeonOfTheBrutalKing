package AlternateRealityTheDungeon;

public class Shields {

	private static Shields single_instance_shields;
	protected Singleton myChar = new Singleton();
	
	public String name;
	public int requiredStrength;
	public String charStrength;
	public int defenseProvided;
	
	public Shields() {
		
	}
	
	public static Shields Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_shields == null) {
			single_instance_shields = new Shields();
		}
		return single_instance_shields;
	}

}
