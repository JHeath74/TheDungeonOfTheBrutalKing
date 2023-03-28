package ARTDArmour;

import AlternateRealityTheDungeon.ARTDArmour;

public class ARTDChain extends ARTDArmour {


	
	public ARTDChain() 
	{
		name = "Chain";
		armourDefense = 12;	
		requiredStrength = 30;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}

}
