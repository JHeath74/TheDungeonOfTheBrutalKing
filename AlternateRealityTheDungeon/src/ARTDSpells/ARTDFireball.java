package ARTDSpells;

import AlternateRealityTheDungeon.ARTDSingleton;
import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDFireball extends ARTDSpells{


	public ARTDFireball() {
		
		name = "FireBall";
		requiredint = 20;
		requiredwis = 20;
		charintelligence = ARTDSingleton.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = ARTDSingleton.myCharSingleton().CharInfo.get(9).toString();
		
		isCombatSpell = true;
	}

	

}
