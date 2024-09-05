package Maps;

import DungeonoftheBrutalKing.Maps;

public class DungeonLevel1 {
	

	int mapWidth;
	int mapHeight;
	int mapLevel;
	private int[][] DungeonLevel1;
			




	public DungeonLevel1(int mapWidth, int mapHeight, int mapLevel, int[][] DungeonLevel1) {
		//64x64
		
		this.mapWidth = mapWidth;
		this.mapHeight = mapHeight;
		this.mapLevel = mapLevel;
		
		this.DungeonLevel1 = new int[][] {
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
	
	public int getMapWidth() {
		return mapWidth;
	}




	public int getMapHeight() {
		return mapHeight;
	}




	public int getMapLevel() {
		return mapLevel;
	}

	public int[][] getDungeonLevel1() {
		return DungeonLevel1;
	}

}
