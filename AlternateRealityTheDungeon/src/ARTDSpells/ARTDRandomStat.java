package ARTDSpells;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDRandomStat extends ARTDSpells {

	public ARTDRandomStat()
	{
		name = "Random Stat";
		requiredint = 30;
		requiredwis = 30;
		intelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		wisdom = myChar.myCharSingleton().CharInfo.get(8).toString();
	}
}
