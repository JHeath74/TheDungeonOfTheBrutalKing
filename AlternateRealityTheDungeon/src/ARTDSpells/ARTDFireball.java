package ARTDSpells;

import java.util.Random;

import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDFireball extends ARTDSpells{


	public ARTDFireball() {
		
		name = "FireBall";
		requiredint = 20;
		requiredwis = 20;
		intelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		wisdom = myChar.myCharSingleton().CharInfo.get(8).toString();
	}

	

}
