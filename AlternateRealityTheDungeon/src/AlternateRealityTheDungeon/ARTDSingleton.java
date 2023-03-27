package AlternateRealityTheDungeon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ARTDArmour.ARTDBreastPlate;
import ARTDArmour.ARTDChain;
import ARTDArmour.ARTDCloth;
import ARTDArmour.ARTDLeather;
import ARTDArmour.ARTDPlate;
import ARTDArmour.ARTDSkin;
import ARTDArmour.ARTDStuddedLeather;
import ARTDEnemies.ARDTGhouls;
import ARTDEnemies.ARDTLiches;
import ARTDEnemies.ARDTSalamander;
import ARTDEnemies.ARDTVampires;
import ARTDEnemies.ARTDAssassins;
import ARTDEnemies.ARTDBrigands;
import ARTDEnemies.ARTDCutthroats;
import ARTDEnemies.ARTDDevourer;
import ARTDEnemies.ARTDDragon;
import ARTDEnemies.ARTDDwarves;
import ARTDEnemies.ARTDFlame_Demons;
import ARTDEnemies.ARTDGhosts;
import ARTDEnemies.ARTDGiant_Bats;
import ARTDEnemies.ARTDGladiators;
import ARTDEnemies.ARTDGnolls;
import ARTDEnemies.ARTDGnomes;
import ARTDEnemies.ARTDGoblins;
import ARTDEnemies.ARTDGremlins;
import ARTDEnemies.ARTDGuards;
import ARTDEnemies.ARTDHomunculi;
import ARTDEnemies.ARTDHorned_Devils;
import ARTDEnemies.ARTDIce_Demons;
import ARTDEnemies.ARTDImps;
import ARTDEnemies.ARTDKnights;
import ARTDEnemies.ARTDMages;
import ARTDEnemies.ARTDMaster_Thieves;
import ARTDEnemies.ARTDMold;
import ARTDEnemies.ARTDNight_Stalker;
import ARTDEnemies.ARTDNoblemen;
import ARTDEnemies.ARTDOrcs;
import ARTDEnemies.ARTDPhoenix;
import ARTDEnemies.ARTDRats;
import ARTDEnemies.ARTDSkeletons;
import ARTDEnemies.ARTDSlime;
import ARTDEnemies.ARTDSpectres;
import ARTDEnemies.ARTDSpiders;
import ARTDEnemies.ARTDStorm_Devils;
import ARTDEnemies.ARTDThieves;
import ARTDEnemies.ARTDTrolls;
import ARTDEnemies.ARTDValkyries;
import ARTDEnemies.ARTDWhirlwind;
import ARTDEnemies.ARTDWizard;
import ARTDEnemies.ARTDWolves;
import ARTDEnemies.ARTDWraiths;
import ARTDSpells.ARTDLight;
import ARTDSpells.ARTDLocation;
import ARTDSpells.ARTDPort;
import ARTDSpells.ARTDRandomStat;
import ARTDSpells.ARTDShield;
import ARTDSpells.ARTDCold_Blast;
import ARTDSpells.ARTDConjure_Food;
import ARTDSpells.ARTDFireball;
import ARTDSpells.ARTDHeal;
import ARTDWeapons.ARTDBattleAxe;
import ARTDWeapons.ARTDBattleHammer;
import ARTDWeapons.ARTDClub;
import ARTDWeapons.ARTDCrossbow;
import ARTDWeapons.ARTDDaggger;
import ARTDWeapons.ARTDDart;
import ARTDWeapons.ARTDFlail;
import ARTDWeapons.ARTDHand;
import ARTDWeapons.ARTDJavelin;
import ARTDWeapons.ARTDLongSword;
import ARTDWeapons.ARTDLongbow;
import ARTDWeapons.ARTDShortSword;
import ARTDWeapons.ARTDShortbow;
import ARTDWeapons.ARTDSling;
import ARTDWeapons.ARTDStilleto;
import ARTDWeapons.ARTDSword;
import ARTDWeapons.ARTDWarNet;
import ARTDWeapons.ARTDWhip;

public class ARTDSingleton 
{

	private static ARTDCharecter myChar = ARTDCharecter.Singleton();
	
	private static ARTDWeapons myWeapon = ARTDWeapons.Singleton();
	private static ARTDArmour myArmour = ARTDArmour.Singleton();
	private static ARTDSpells mySpells = ARTDSpells.Singleton();
	
	
	private static List<ARTDArmour> armourList = addArmour();
	private static List<ARTDEnemies> myMonsters = addEnemies();
	private static List<ARTDWeapons> weaponList = addWeapon();
	private static List<ARTDSpells> spellList = addSpells();
	
	//Singletons
	
	private static List<ARTDArmour> addArmour()
	{
		armourList = new ArrayList<ARTDArmour>();	
		
		  armourList.add(new ARTDSkin());
		  armourList.add(new ARTDCloth());
		  armourList.add(new ARTDLeather());
		  armourList.add(new ARTDStuddedLeather());
		  armourList.add(new ARTDChain());
		  armourList.add(new ARTDBreastPlate());
		  armourList.add(new ARTDPlate());
		
		return armourList;
		
	}
	
	private static List<ARTDEnemies> addEnemies()
	{
		myMonsters = new ArrayList<ARTDEnemies>();
		
		myMonsters.add(new ARTDAssassins());
		myMonsters.add(new ARTDBrigands());
		myMonsters.add(new ARTDCutthroats());
		myMonsters.add(new ARTDDevourer());
		myMonsters.add(new ARTDDragon());
		myMonsters.add(new ARTDDwarves());
		myMonsters.add(new ARTDFlame_Demons());
		myMonsters.add(new ARTDGhosts());
		myMonsters.add(new ARDTGhouls());
		myMonsters.add(new ARTDGiant_Bats());
		myMonsters.add(new ARTDGladiators());
		myMonsters.add(new ARTDGnolls());
		myMonsters.add(new ARTDGnomes());
		myMonsters.add(new ARTDGoblins());
		myMonsters.add(new ARTDGremlins());
		myMonsters.add(new ARTDGuards());
		myMonsters.add(new ARTDHomunculi());
		myMonsters.add(new ARTDHorned_Devils());
		myMonsters.add(new ARTDIce_Demons());
		myMonsters.add(new ARTDImps());
		myMonsters.add(new ARTDKnights());
		myMonsters.add(new ARDTLiches());
		myMonsters.add(new ARTDMages());
		myMonsters.add(new ARTDMaster_Thieves());
		myMonsters.add(new ARTDMold());
		myMonsters.add(new ARTDNight_Stalker());
		myMonsters.add(new ARTDNoblemen());
		myMonsters.add(new ARTDOrcs());
		myMonsters.add(new ARTDPhoenix());
		myMonsters.add(new ARTDRats());
		myMonsters.add(new ARDTSalamander());
		myMonsters.add(new ARTDSkeletons());
		myMonsters.add(new ARTDSlime());
		myMonsters.add(new ARTDSpectres());
		myMonsters.add(new ARTDSpiders());
		myMonsters.add(new ARTDStorm_Devils());
		myMonsters.add(new ARTDThieves());	
		myMonsters.add(new ARTDTrolls());
		myMonsters.add(new ARTDValkyries());
		myMonsters.add(new ARDTVampires());
		myMonsters.add(new ARTDWhirlwind());
		myMonsters.add(new ARTDWizard());
		myMonsters.add(new ARTDWolves());
		myMonsters.add(new ARTDWraiths());
		
		
		return myMonsters;
	}
	
	private static List<ARTDSpells> addSpells()
	{
		spellList = new ArrayList<ARTDSpells>();
		
		spellList.add(new ARTDCold_Blast());
		spellList.add(new ARTDConjure_Food());
		spellList.add(new ARTDFireball());
		spellList.add(new ARTDHeal());
		spellList.add(new ARTDLight());
		spellList.add(new ARTDLocation());
		spellList.add(new ARTDShield());
		spellList.add(new ARTDRandomStat());
		spellList.add(new ARTDPort());
		
		
		
		return spellList;
		
	}
	
	private static List<ARTDWeapons> addWeapon()
	{
		weaponList = new ArrayList<ARTDWeapons>();
		
		weaponList.add(new ARTDHand());
		weaponList.add(new ARTDDaggger());
		weaponList.add(new ARTDStilleto());
		weaponList.add(new ARTDDart());
		weaponList.add(new ARTDSling());
		weaponList.add(new ARTDShortSword());
		weaponList.add(new ARTDShortbow());
		weaponList.add(new ARTDWarNet());
		weaponList.add(new ARTDFlail());
		weaponList.add(new ARTDSword());
		weaponList.add(new ARTDWhip());
		weaponList.add(new ARTDCrossbow());
		weaponList.add(new ARTDLongSword());
		weaponList.add(new ARTDLongbow());
		weaponList.add(new ARTDJavelin());
		weaponList.add(new ARTDBattleAxe());
		weaponList.add(new ARTDBattleHammer());
		
		
		return weaponList;
		
	}	
	
	public static List<ARTDArmour> armourList()
	{
		return armourList;
	}
	
	public static ARTDArmour myArmourSingleton()
	{
		return myArmour;
	}
	 
	
	public static ARTDCharecter myCharSingleton()
	{
		return myChar;
	}
	
	public static List<ARTDEnemies> myMonsters()
	{
		if(myMonsters.size() == 0)
		{
			addEnemies();
		}
		return myMonsters;
	}
	
	//Adding Spells, Enemies, Weapons and Armour to Arrays
	
	public static ARTDSpells mySpellsSingleton()
	{
		return mySpells;
	}
	
	public static ARTDWeapons myWeaponSingleton()
	{
		return myWeapon;
	}
	
	public static List<ARTDSpells> spellList()
	{
		return spellList;
	}
	
	public static List<ARTDWeapons> weaponsList()
	{
		return weaponList;
	}
	
}
