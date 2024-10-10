package DungeonoftheBrutalKing;

import java.io.IOException;

public class Events {


	int mapLevel;
	int map[][];
	
	MainGameScreen2 myMainGameScreen2 = new MainGameScreen2();
	Combat myCombat = new Combat();
	
	public Events() throws IOException {
		
	}
	
	public void checkEvent(int newXPos, int newYPos, int[][] map) {
	    int mapValue = map[newYPos][newXPos];

	    switch (mapValue) {
	        case 2:
	            System.out.println("Random combat event triggered!");
	            // Call your method for handling combat here
	            break;
	        case 3:
	            System.out.println("NPC encounter event triggered!");
	            // Call your method for handling NPC encounters here
	            break;
	        case 4:
	            System.out.println("Stair event triggered!");
	            // Call your method for handling stair events here
	            break;
	        default:
	            System.out.println("No event triggered.");
	            break;
	    }
	}

}
