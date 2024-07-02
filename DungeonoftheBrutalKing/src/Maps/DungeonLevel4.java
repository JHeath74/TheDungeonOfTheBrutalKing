package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel4 extends Maps {

	//16x16
	

	
	private static final long serialVersionUID = 1L;
	public static int[][][] DungeonLevel4 = {{
		{1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,0,1},
		{1,0,1,0,0,1,0,1},
		{1,0,1,0,0,1,0,1},
		{1,0,1,1,1,1,0,1},
		{1,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1}

	}};
	
	public DungeonLevel4() {
		mapWidth = 8;
		mapHeight= 8;
		mapLevel = 4;
	}

}
