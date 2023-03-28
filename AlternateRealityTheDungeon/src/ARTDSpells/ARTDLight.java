package ARTDSpells;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDLight extends ARTDSpells{
	
	public ARTDLight()
	{
		name = "Light";
		requiredint = 30;
		requiredwis = 30;
		intelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		wisdom = myChar.myCharSingleton().CharInfo.get(8).toString();
	}

}
