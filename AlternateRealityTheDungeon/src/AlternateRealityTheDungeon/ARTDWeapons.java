package AlternateRealityTheDungeon;




public class ARTDWeapons {
	
private static ARTDWeapons myWeapon = ARTDWeapons.Singleton();
private static ARTDWeapons single_instance_weapons;

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
