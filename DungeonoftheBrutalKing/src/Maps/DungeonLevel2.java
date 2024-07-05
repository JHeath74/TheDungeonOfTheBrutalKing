package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel2 extends Maps {

	//64x64
	

	

	public static int[][][] DungeonLevel2 = {{
		{1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,0,1},
		{1,0,1,0,0,1,0,1},
		{1,0,1,0,0,1,0,1},
		{1,0,1,1,1,1,0,1},
		{1,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1}

	}};
	
	public DungeonLevel2() {
		mapWidth = 32;
		mapHeight = 32;
		mapLevel = 2;
	}

}
