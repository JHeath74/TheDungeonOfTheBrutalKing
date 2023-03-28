package AlternateRealityTheDungeon;

public class ARTDWeapons {
	
protected ARTDSingleton myChar = new ARTDSingleton();
	
private static ARTDWeapons myWeapon = ARTDWeapons.Singleton();
private static ARTDWeapons single_instance_weapons;

public String name;
public int requiredStrength;
public String charStrength;

public ARTDWeapons()
{
	
}

public static ARTDWeapons Singleton()
{
	// To ensure only one instance is created
	if (single_instance_weapons == null) {
		single_instance_weapons = new ARTDWeapons();
	}
	return single_instance_weapons;
}
	

	
}
