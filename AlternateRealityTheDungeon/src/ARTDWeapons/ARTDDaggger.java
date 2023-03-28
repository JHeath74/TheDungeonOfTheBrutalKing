package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDDaggger extends ARTDWeapons 
{

	public ARTDDaggger()
	{
		name = "Dagger";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}
	
	
	
}
