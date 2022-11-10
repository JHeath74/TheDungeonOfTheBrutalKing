package AlternateRealityTheDungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ARDTWeapons {

	
	
	HashMap<String, Integer> AgilityWeapons = new HashMap<String, Integer>();
	HashMap<String, Integer> StrengthWeapons = new HashMap<String, Integer>();  
	HashMap<String, Integer> Spells = new HashMap<String, Integer>();
	
    
	
	//WeaponName, Agility Required
	public void AgilityWeaponsAvalible()
    {
    	  
    	StrengthWeapons.put("Dagger", 5);
    	StrengthWeapons.put("Stilleto", 5);
    	StrengthWeapons.put("Club", 5);
    	StrengthWeapons.put("Short Sword", 5);
    	StrengthWeapons.put("Flail", 5);
    	StrengthWeapons.put("War Net", 5);
    	StrengthWeapons.put("Whip", 5);
    	StrengthWeapons.put("Sword", 5);
    	StrengthWeapons.put("Long Sword", 5);
    	StrengthWeapons.put("Battle Hammer ", 5);
    	StrengthWeapons.put("Battle Axe ", 5);
    	
    }
	
	//WeaponName, Agility Required
    public void StengthWeaponsAvailable()
    {
    	AgilityWeapons.put("Dart", 5);
    	AgilityWeapons.put("Sling", 7);
    	AgilityWeapons.put("Javelin", 12);
    	AgilityWeapons.put("Shortbow", 15);
    	AgilityWeapons.put("Crossbow", 20);
    	AgilityWeapons.put("Longbow", 25);
    }

    //Spellname, Wisdom Required, Damage or Healing
	public void Spells()
	{
		
	}
	
}
