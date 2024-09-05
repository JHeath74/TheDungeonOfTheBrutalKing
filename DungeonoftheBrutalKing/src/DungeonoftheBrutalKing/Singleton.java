package DungeonoftheBrutalKing;

import java.util.ArrayList;
import java.util.List;

import Armour.BreastPlate;
import Armour.Chainmail;
import Armour.Cloth;
import Armour.Leather;
import Armour.Plate;
import Armour.Skin;
import Armour.StuddedLeather;
import Enemies.Rats;
import Enemies.Skeletons;
import Enemies.Spiders;
import Shields.Magical_Shield;
import Shields.Magical_Small_Shield;
import Shields.Magical_Spiked_Shield;
import Shields.Small_Shield;
import Shields.Spiked_Shield;
import Shields.Wooden_Shield;
import Weapons.BattleAxe;
import Weapons.BattleHammer;
import Weapons.Crossbow;
import Weapons.Daggger;
import Weapons.Dart;
import Weapons.Flail;
import Weapons.Hand;
import Weapons.Javelin;
import Weapons.LongSword;
import Weapons.Longbow;
import Weapons.ShortSword;
import Weapons.Shortbow;
import Weapons.Sling;
import Weapons.Stilleto;
import Weapons.Sword;
import Weapons.WarNet;
import Weapons.Whip;

public class Singleton
{

	private static Charecter myChar = Charecter.Singleton();

	private static Weapons myWeapon = Weapons.Singleton();
	private static Armour myArmour = Armour.Singleton();
	private static Shields myShields = Shields.Singleton();
	private static Spells mySpells = Spells.Singleton();
	private static Enemies myMonsters = Enemies.Singleton();


	private static List<Armour> armourList = addArmour();
	private static List<Enemies> monsterList = addEnemies();
	private static List<Weapons> weaponList = addWeapon();
	private static List<Spells> spellList = addSpells();
	private static List<Shields> shieldList = addShields();

	//Singletons

	private static List<Armour> addArmour()
	{
		armourList = new ArrayList<>();

	//	  armourList.add(new Skin());
		//  armourList.add(new Cloth());
	//	  armourList.add(new Leather());
	//	  armourList.add(new StuddedLeather());
	//	  armourList.add(new Chainmail());
	//	  armourList.add(new BreastPlate());
	//	  armourList.add(new Plate());

		return armourList;

	}

	private static List<Shields> addShields() {

		shieldList = new ArrayList<>();

	//	shieldList.add(new Wooden_Shield());
	//	shieldList.add(new Small_Shield());
	//    shieldList.add(new Spiked_Shield());
	//	shieldList.add(new Magical_Shield());
	//	shieldList.add(new Magical_Small_Shield());
	//	shieldList.add(new Magical_Spiked_Shield());


		return shieldList;
	}

	private static List<Enemies> addEnemies()
	{
		monsterList = new ArrayList<>();

	//	monsterList.add(new ARTDAssassins());
	//	monsterList.add(new ARTDBrigands());
	//	monsterList.add(new ARTDCutthroats());
	//	monsterList.add(new ARTDDevourer());
	//	monsterList.add(new ARTDDragon());
	//	monsterList.add(new ARTDDwarves());
	//	monsterList.add(new ARTDFlame_Demons());
	//	monsterList.add(new ARTDGhosts());
	//	monsterList.add(new ARDTGhouls());
	//	monsterList.add(new ARTDGiant_Bats());
	//	monsterList.add(new ARTDGladiators());
	//	monsterList.add(new ARTDGnolls());
	//	monsterList.add(new ARTDGnomes());
	//	monsterList.add(new ARTDGoblins());
	//	monsterList.add(new ARTDGremlins());
	//	monsterList.add(new ARTDGuards());
	//	monsterList.add(new ARTDHomunculi());
	//	monsterList.add(new ARTDHorned_Devils());
	//	monsterList.add(new ARTDIce_Demons());
	//	monsterList.add(new ARTDImps());
	//	monsterList.add(new ARTDKnights());
	//	monsterList.add(new ARDTLiches());
	//	monsterList.add(new ARTDMages());
	//	monsterList.add(new ARTDMaster_Thieves());
	//	monsterList.add(new ARTDMold());
	//	monsterList.add(new ARTDNight_Stalker());
	//	monsterList.add(new ARTDNoblemen());
	//	monsterList.add(new ARTDOrcs());
	//	monsterList.add(new ARTDPhoenix());
		monsterList.add(new Rats());
	//	monsterList.add(new ARDTSalamander());
		monsterList.add(new Skeletons());
	//	monsterList.add(new ARTDSlime());
	//	monsterList.add(new ARTDSpectres());
		monsterList.add(new Spiders());
	//	monsterList.add(new ARTDStorm_Devils());
	//	monsterList.add(new ARTDThieves());
	//	monsterList.add(new ARTDTrolls());
	//	monsterList.add(new ARTDValkyries());
	//	monsterList.add(new ARDTVampires());
	//	monsterList.add(new ARTDWhirlwind());
	//	monsterList.add(new ARTDWizard());
	//	monsterList.add(new ARTDWolves());
	//	monsterList.add(new ARTDWraiths());


		return monsterList;
	}


	  private static List<Spells> addSpells()
	  {
		  spellList = new ArrayList<>();
	 /*
	 * spellList.add(new ARTDCold_Blast()); spellList.add(new ARTDConjure_Food());
	 * spellList.add(new ARTDFireball()); spellList.add(new ARTDHeal());
	 * spellList.add(new ARTDLight()); spellList.add(new ARTDLocation());
	 * spellList.add(new ARTDShield()); spellList.add(new ARTDRandomStat());
	 * spellList.add(new ARTDPort());
	 *
	 *
	 */
	  return spellList;

	  }


	private static List<Weapons> addWeapon()
	{
		weaponList = new ArrayList<>();

	//	weaponList.add(new ARTDHand());
	//	weaponList.add(new ARTDDaggger());
	//	weaponList.add(new ARTDStilleto());
//		weaponList.add(new ARTDDart());
//		weaponList.add(new ARTDSling());
//		weaponList.add(new ARTDShortSword());
//		weaponList.add(new ARTDShortbow());
//		weaponList.add(new ARTDWarNet());
	//	weaponList.add(new ARTDFlail());
	//	weaponList.add(new ARTDSword());
	//	weaponList.add(new ARTDWhip());
	//	weaponList.add(new ARTDCrossbow());
	//	weaponList.add(new ARTDLongSword());
	//	weaponList.add(new ARTDLongbow());
	//	weaponList.add(new ARTDJavelin());
	//	weaponList.add(new ARTDBattleAxe());
	//	weaponList.add(new ARTDBattleHammer());


		return weaponList;

	}

	public static List<Armour> armourList()
	{
		return armourList;
	}

	public static Armour myArmourSingleton()
	{
		return myArmour;
	}


	public static Charecter myCharSingleton()
	{
		return myChar;
	}

	public static List<Enemies> myMonsters()
	{
		if(monsterList.size() == 0)
		{
			addEnemies();
		}
		return monsterList;
	}



	public static Spells spellListSingleton()
	{
		return mySpells;
	}

	public static Weapons myWeaponSingleton()
	{
		return myWeapon;
	}


	  public static List<Spells> spellList() { return spellList; }


	public static List<Weapons> weaponsList()
	{
		return weaponList;
	}

}
