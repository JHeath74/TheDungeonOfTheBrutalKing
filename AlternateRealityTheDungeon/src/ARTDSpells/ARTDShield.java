package ARTDSpells;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDShield extends ARTDSpells {

	public ARTDShield()
	{
		name = "Shield";
		requiredint = 30;
		requiredwis = 30;
		intelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		wisdom = myChar.myCharSingleton().CharInfo.get(8).toString();
	}
}
