package AlternateRealityTheDungeon;




public class ARTDWeapons {
	
	
	 private static ARTDWeapons single_instance_weapons;

public ARTDWeapons()
{
	
	
//	ARTDWeapons BattleAxe = new ARTDWeapons();
//	ARTDWeapons BattleHammer = new ARTDWeapons();
//	ARTDWeapons Club = new ARTDWeapons();
//	ARTDWeapons Crossbow = new ARTDWeapons();
//	ARTDWeapons Dagger = new ARTDWeapons();
//	ARTDWeapons Dart = new ARTDWeapons();
//	ARTDWeapons Flail = new ARTDWeapons();
//	ARTDWeapons Javelin = new ARTDWeapons();
//	ARTDWeapons Longbow = new ARTDWeapons();
//	ARTDWeapons LongSword = new ARTDWeapons();
//	ARTDWeapons Shortbow = new ARTDWeapons();
//	ARTDWeapons ShortSword = new ARTDWeapons();
//	ARTDWeapons Skin = new ARTDWeapons(); // 1
//	ARTDWeapons Sling = new ARTDWeapons();
//	ARTDWeapons Stilleto = new ARTDWeapons();
//	ARTDWeapons Sword = new ARTDWeapons();
//	ARTDWeapons WarNet = new ARTDWeapons();

	
	
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
