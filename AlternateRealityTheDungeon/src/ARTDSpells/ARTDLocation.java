package ARTDSpells;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDLocation extends ARTDSpells
{

	public ARTDLocation() {
		
		name = "Location";
		requiredint = 30;
		requiredwis = 30;
		intelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		wisdom = myChar.myCharSingleton().CharInfo.get(8).toString();
	}

	
	
}
