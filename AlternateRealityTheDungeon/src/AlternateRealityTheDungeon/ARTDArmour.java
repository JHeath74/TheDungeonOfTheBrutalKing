package AlternateRealityTheDungeon;



public class ARTDArmour {
	

	private static ARTDArmour single_instance_armour;
	



	public static ARTDArmour Singleton()
	{
		// To ensure only one instance is created
		if (single_instance_armour == null) {
			single_instance_armour = new ARTDArmour();
		}
		return single_instance_armour;
	}

	
	
	  protected ARTDArmour()
	  {

		  
	  }

    	
	  
    		
    
}
