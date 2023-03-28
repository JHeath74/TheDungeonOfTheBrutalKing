package ARTDSpells;



import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDHeal extends ARTDSpells {


	public ARTDHeal() 
	{
		name = "Heal";
		requiredint = 35;
		requiredwis = 35;
		intelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		wisdom = myChar.myCharSingleton().CharInfo.get(8).toString();

		
		
	}

}
