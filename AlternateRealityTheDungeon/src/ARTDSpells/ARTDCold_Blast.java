package ARTDSpells;

import java.util.Random;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDCold_Blast extends ARTDSpells
{

	int requiredint;
	int damagecaused;
	
	public ARTDCold_Blast() 
	{
		requiredint = 30;
		
		
		Random rn = new Random();
		damagecaused = rn.nextInt(30) + 1;
		
		
	}

}
