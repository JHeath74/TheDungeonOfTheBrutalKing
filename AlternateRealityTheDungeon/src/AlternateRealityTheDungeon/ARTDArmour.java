package AlternateRealityTheDungeon;

import java.util.ArrayList;
import java.util.List;

import ARTDArmour.ARTDBreastPlate;
import ARTDArmour.ARTDChain;
import ARTDArmour.ARTDCloth;
import ARTDArmour.ARTDLeather;
import ARTDArmour.ARTDPlate;
import ARTDArmour.ARTDSkin;
import ARTDArmour.ARTDStuddedLeather;

public class ARTDArmour {
	
//	static ARTDArmour[] armourArray = {new ARTDSkin(), new ARTDCloth(), new ARTDLeather(), new ARTDStuddedLeather(),
//	new ARTDChain(), new ARTDBreastPlate(), new ARTDPlate()};

	List<ARTDArmour> armourList = new ArrayList<ARTDArmour>();
    //static boolean[] hasArmour = {false, true};
	static boolean hasArmour = false;  
	
	
	  public ARTDArmour()
	  {
		 //		name = armourName;
		 //defense = armourDefense;
		 //	requiredStr = requiredStrength;
		  
		  
		  armourList.add(0, new ARTDSkin("Skin", 0, 0));
		  armourList.add(1, new ARTDCloth("Cloth", 0, 0));
		  armourList.add(2, new ARTDLeather("Leather", 0, 0));
		  armourList.add(3, new ARTDStuddedLeather("StuddedLeather", 0, 0));
		  armourList.add(4, new ARTDChain("Chain", 0, 0));
		  armourList.add(5, new ARTDBreastPlate("BreastPlate", 0, 0));
		  armourList.add(6, new ARTDPlate("Plate", 0, 0));

		  
		  
	  }
    		  
    		
    
}
