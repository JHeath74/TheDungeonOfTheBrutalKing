package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel3 extends Maps {
	
	//32x32
	

	

	public static int[][][] DungeonLevel3 = {{
		{1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,0,1},
		{1,0,1,0,0,1,0,1},
		{1,0,1,0,0,1,0,1},
		{1,0,1,1,1,1,0,1},
		{1,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1}

	}};

	public DungeonLevel3() {
		mapWidth = 16;
		mapHeight = 16;
		mapLevel = 3;
	}

}
