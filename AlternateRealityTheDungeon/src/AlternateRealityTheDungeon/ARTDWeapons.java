package AlternateRealityTheDungeon;


import java.util.HashMap;


public class ARTDWeapons {

	
	

	HashMap<String, Integer> Spells = new HashMap<String, Integer>();
	
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
