package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel2 extends Maps {

	//32x32
	

	

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
		MapX = 32;
		MapY = 32;
		MapZ = 2;
	}

}
