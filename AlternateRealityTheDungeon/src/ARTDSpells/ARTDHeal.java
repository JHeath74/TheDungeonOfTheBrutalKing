package ARTDSpells;

import java.util.Random;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDHeal extends ARTDSpells {

	
	int requiredint;
	int healamount;
	
	
	public ARTDHeal() 
	{
		
		Random rn = new Random();
		healamount = rn.nextInt(10) + 1;
		
		int requiredint = 20;
		
		
	}

}
