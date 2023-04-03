package AlternateRealityTheDungeon;

import java.util.Hashtable;

import ARTDSpells.ARTDCold_Blast;
import ARTDSpells.ARTDConjure_Food;
import ARTDSpells.ARTDFireball;
import ARTDSpells.ARTDHeal;
import ARTDSpells.ARTDLight;
import ARTDSpells.ARTDLocation;
import ARTDSpells.ARTDPort;
import ARTDSpells.ARTDRandomStat;
import ARTDSpells.ARTDShield;

public class ARTDSpellList {

	static Hashtable<String, ARTDSpells> SpellList = new Hashtable<>();
		 
		public ARTDSpellList()
		{
			SpellList.put("Cold_Blast", new ARTDCold_Blast());
			SpellList.put("Conjure_Food", new ARTDConjure_Food());
			SpellList.put("Fireball", new ARTDFireball());
			SpellList.put("Heal", new ARTDHeal());
			SpellList.put("Light", new ARTDLight());
			SpellList.put("Location", new ARTDLocation());
			SpellList.put("Port", new ARTDPort());
			SpellList.put("RandomStat", new ARTDRandomStat());
			SpellList.put("Shield", new ARTDShield());
	
		}
		
		public static ARTDSpells getSpells(String Spellname)
		{
			
			return SpellList.get(Spellname);	
		}
}
