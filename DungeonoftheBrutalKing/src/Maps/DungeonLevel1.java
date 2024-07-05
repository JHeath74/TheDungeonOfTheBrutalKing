package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel1 extends Maps{
	

	
	
	public static int[][][] DungeonLevel1 = {{
		{1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,0,1},
		{1,0,1,0,0,1,0,1},
		{1,0,1,0,0,1,0,1},
		{1,0,1,1,1,1,0,1},
		{1,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1}

	}};

	public DungeonLevel1() {
		//128x128
		
		mapWidth = 64;
		mapHeight = 64;
		mapLevel = 1;
	}

}
