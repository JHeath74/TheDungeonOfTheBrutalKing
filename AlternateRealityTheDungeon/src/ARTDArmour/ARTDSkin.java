package ARTDArmour;

import AlternateRealityTheDungeon.ARTDArmour;

public class ARTDSkin extends ARTDArmour {

	
	public ARTDSkin()
	{

		name = "Skin";
		armourDefense = 1;
		requiredStrength = 0;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
		
	}



	
}
