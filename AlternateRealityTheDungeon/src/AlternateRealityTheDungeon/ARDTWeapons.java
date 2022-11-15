package AlternateRealityTheDungeon;


import java.util.HashMap;


public class ARDTWeapons {

	
	
	HashMap<String, Integer> AgilityWeapons = new HashMap<String, Integer>();
	HashMap<String, Integer> StrengthWeapons = new HashMap<String, Integer>();  
	HashMap<String, Integer> Spells = new HashMap<String, Integer>();
	
    
	
	//WeaponName, Strength Required
	public void StrengthWeaponsAvalible()
    {
    	  
    	StrengthWeapons.put("Dagger", 3);
    	StrengthWeapons.put("Stilleto", 5);
    	StrengthWeapons.put("Club", 7);
    	StrengthWeapons.put("Short Sword", 9);
    	StrengthWeapons.put("Flail", 11);
    	StrengthWeapons.put("War Net", 15);
    	StrengthWeapons.put("Whip", 18);
    	StrengthWeapons.put("Sword", 21);
    	StrengthWeapons.put("Long Sword", 25);
    	StrengthWeapons.put("Battle Hammer ", 27);
    	StrengthWeapons.put("Battle Axe ", 30);
    	
    }
	
	//WeaponName, Agility Required
    public void AgilityWeaponsAvalible()
    {
    	AgilityWeapons.put("Dart", 5);
    	AgilityWeapons.put("Sling", 7);
    	AgilityWeapons.put("Javelin", 12);
    	AgilityWeapons.put("Shortbow", 15);
    	AgilityWeapons.put("Crossbow", 20);
    	AgilityWeapons.put("Longbow", 25);
    }

    //Spellname, Wisdom Required, Damage or Healing	
    public void SpellsAvalible()
	{
    	Spells.put("Healing", 3);
    	Spells.put("Fireball", 6);
    	Spells.put("Lightining", 9);
    	Spells.put("Shield", 15);
    	Spells.put("Return", 18);
		
	}
	
}
