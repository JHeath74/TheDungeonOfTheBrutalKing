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
		  armourList.add(0, new ARTDSkin());
		  armourList.add(1, new ARTDCloth());
		  armourList.add(2, new ARTDLeater());
		  armourList.add(3, new ARTDStuddedLeather());
		  armourList.add(4, new ARTDChain());
		  armourList.add(5, new ARTDBreastPlate());
		  armourList.add(6, new ARTDPlate());
		  armourList.add(7, new ARTDSkin());
		  armourList.add(8, new ARTDSkin());
		  armourList.add(9, new ARTDSkin());
		  
		  
	  }
    		  
    		
    
}
