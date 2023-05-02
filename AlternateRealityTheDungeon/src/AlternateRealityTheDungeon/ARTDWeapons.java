package AlternateRealityTheDungeon;

public class ARTDWeapons {
	
protected ARTDSingleton myChar = new ARTDSingleton();
	
private static ARTDWeapons myWeapon = ARTDWeapons.Singleton();
private static ARTDWeapons single_instance_weapons;

public String name;
public int requiredStrength;
public static String charStrength;
private static int damage;
private static double criticalHitChance;
private static StatusEffect statusEffect;

public ARTDWeapons(String name, int damage, double criticalHitChance, StatusEffect statusEffect)
{
	this.name = name;
    this.damage = damage;
    this.criticalHitChance = criticalHitChance;
    this.statusEffect = statusEffect;
}

	public enum StatusEffect {
	    NONE,
	    POISON,
	    STUN,
	    BLEED
	}
	
	public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public double getCriticalHitChance() {
        return criticalHitChance;
    }

    public StatusEffect getStatusEffect() {
        return statusEffect;
    }

public static ARTDWeapons Singleton()
{
	// To ensure only one instance is created
	if (single_instance_weapons == null) {
		single_instance_weapons = new ARTDWeapons(charStrength, damage, criticalHitChance, statusEffect);
	}
	return single_instance_weapons;
}
	

	
}
