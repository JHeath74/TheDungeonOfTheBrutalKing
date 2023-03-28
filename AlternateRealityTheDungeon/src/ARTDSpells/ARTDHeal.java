package ARTDSpells;



import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDHeal extends ARTDSpells {


	public ARTDHeal() 
	{
		name = "Heal";
		requiredint = 35;
		requiredwis = 35;
		charintelligence = myChar.myCharSingleton().CharInfo.get(8).toString();
		charwisdom = myChar.myCharSingleton().CharInfo.get(9).toString();

		
		
	}

}
