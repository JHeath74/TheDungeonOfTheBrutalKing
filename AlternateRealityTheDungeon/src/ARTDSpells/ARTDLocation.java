package ARTDSpells;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDLocation extends ARTDSpells
{

	public ARTDLocation() {
		
		name = "Location";
		requiredint = 30;
		requiredwis = 30;
		charintelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = myChar.myCharSingleton().CharInfo.get(9).toString();
		
		isCombatSpell = false;
	}

	
	
}
