package ARTDMaps;





import AlternateRealityTheDungeon.ARTDCombat;
import AlternateRealityTheDungeon.ARTDMaps;

//1 for a wall, 2 for the floor, 3 for doors, 4 for stairs

public class ARTDFloor4Map extends ARTDMaps{

	public ARTDFloor4Map()
	{

	   
	   
	    MapFloor4 = new int[][]{{1,1,1,1,1,1,1,1},
		     				 {1,4,0,0,0,0,0,1},
		     				 {1,0,1,1,1,1,0,1},
		     				 {1,0,1,0,0,1,0,1},
		     				 {1,0,1,0,0,1,0,1},
		     				 {1,0,1,1,3,1,0,1},
		     				 {1,0,0,0,0,0,0,1},
		     				 {1,1,1,1,1,1,1,1}};
	}
	

}
