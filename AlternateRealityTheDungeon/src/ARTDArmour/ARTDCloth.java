package ARTDArmour;

import AlternateRealityTheDungeon.ARTDArmour;

public class ARTDCloth extends ARTDArmour {

	

	
	public ARTDCloth()
	{
		name = "Cloth";
		armourDefense = 5;	
		requiredStrength = 10;
		charStrength = myChar.myCharSingleton().CharInfo.get(7).toString();
	}



}
