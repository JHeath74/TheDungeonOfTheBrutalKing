package AlternateRealityTheDungeon;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import ARTDEnemies.*;


public class ARTDCombat
{
		
	//https://stackoverflow.com/questions/38288522/how-to-get-a-random-item-from-a-class-in-java
	//https://stackoverflow.com/questions/18435992/java-call-object-methods-through-arraylist
	
	ARTDCharecter myChar = ARTDCharecter.Singleton();
	ARTDMenu myMenu = new ARTDMenu();
	


	
	
	
	int upperbound;
	double HeroHP;
	double HP;
	
	
	
	
	public ARTDCombat()
	{
		
		int upperbound = 4;
		

	}

	
	public void combatEncounter(int HP, int HeroHP, int upperbound) 
	{
		
		Random myRandom = new Random();
		
		int randomEncounter = myRandom.nextInt(upperbound);
		
		switch(randomEncounter) {
		  case 0:
			  ARTDRats myRats = new ARTDRats();
			  myRats.RatsCombatEncouter();
		    break;
		  case 1:
		    // code block
		    break;
		  default:
		    // code block
		}

		
		
		
	}
	

}
