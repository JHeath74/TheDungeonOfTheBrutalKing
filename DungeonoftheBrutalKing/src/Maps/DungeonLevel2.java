package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel2 extends Maps {

	//32x32
	

	
	private int[][] DungeonLevel2;



	int mapWidth = 32;
	int mapHeight = 32;
	int mapLevel = 2; 
	
	
	public DungeonLevel2(int mapWidth, int mapHeight, int mapLevel, int[][] DungeonLevel2) {
		//64x64
		
		this.mapWidth = mapWidth;
		this.mapHeight = mapHeight;
		this.mapLevel = mapLevel;
		
		this.DungeonLevel2 = new int[][] {
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,0,1,0,1},
			{1,0,1,0,0,1,0,1,0,1},
			{1,0,1,0,0,1,0,1,0,1},
			{1,0,1,1,1,1,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}

		};
	}
	
	public int[][] getDungeonLevel2() {
		return DungeonLevel2;
	}


	public int getMapWidth() {
		return mapWidth;
	}


	public int getMapHeight() {
		return mapHeight;
	}


	public int getMapLevel() {
		return mapLevel;
	}

}
