package ARTDSpells;

import java.util.Random;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDFireball extends ARTDSpells{


	public ARTDFireball() {
		
		name = "FireBall";
		requiredint = 20;
		requiredwis = 20;
		charintelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = myChar.myCharSingleton().CharInfo.get(9).toString();
		
		isCombatSpell = true;
	}

	

}
