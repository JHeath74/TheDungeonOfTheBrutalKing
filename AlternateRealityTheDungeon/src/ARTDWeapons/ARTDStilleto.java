package ARTDWeapons;

import AlternateRealityTheDungeon.ARTDWeapons;

public class ARTDStilleto extends ARTDWeapons{

	public ARTDStilleto()
	{
		name = "Stilleto";
		requiredStrength = 35;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
