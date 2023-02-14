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

	private static ARTDArmour single_instance_armour = new ARTDArmour();
	List<ARTDArmour> armourList = new ArrayList<ARTDArmour>();
	
	
	  protected ARTDArmour()
	  {
		 //		name = armourName;
		 //     defense = armourDefense;
		 //	    requiredStr = requiredStrength;
		  
		  
		  armourList.add(0, new ARTDSkin("Skin", 0, 0));
		  armourList.add(1, new ARTDCloth("Cloth", 0, 0));
		  armourList.add(2, new ARTDLeather("Leather", 0, 0));
		  armourList.add(3, new ARTDStuddedLeather("StuddedLeather", 0, 0));
		  armourList.add(4, new ARTDChain("Chain", 0, 0));
		  armourList.add(5, new ARTDBreastPlate("BreastPlate", 0, 0));
		  armourList.add(6, new ARTDPlate("Plate", 0, 0));

		  
	  }
    	
	  public static ARTDArmour Singleton()
	  {
		if(single_instance_armour == null)
		{
			single_instance_armour = new ARTDArmour();
		}
		return single_instance_armour;
		  
	  }
	  
	  public ARTDArmour ARTDSkin()
	  {
		if(this.single_instance_armour == null)
		{
			this.single_instance_armour = new ARTDArmour();
		}
		return this.single_instance_armour.armourList.get(0);
		  
	  }
    		
    
}
