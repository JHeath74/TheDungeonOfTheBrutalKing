package AlternateRealityTheDungeon;

import java.io.*;
import java.util.ArrayList;

public class ARTDSaveLoadGameData {

	ARTDSingleton myChar = null;
	ARTDSingleton mySpellList = null;
	ArrayList<ARTDSaveGameState> GameState = null;

	public ARTDSaveLoadGameData() 
	{
		myChar = new ARTDSingleton();
		mySpellList = new ARTDSingleton();
		GameState = new ArrayList<>();
	}

	// Add objects to the collection
	public void addToArray()
	{
		GameState.add(new ARTDSaveGameState("Object 1"));
		GameState.add(new ARTDSaveGameState("Object 2")); 
	}

	
    // Serialize the collection
    try (FileOutputStream fileOut = new FileOutputStream("objects.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

        out.writeObject(GameState);
        System.out.println("Objects serialized.");

    } catch (IOException e) {
        e.printStackTrace();
    }

    // Deserialize the collection
    try (FileInputStream fileIn = new FileInputStream("objects.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn)) {

        ArrayList<ARTDSaveGameState> loadedObjects = (ArrayList<ARTDSaveGameState>) in.readObject();
        System.out.println("Objects deserialized:");
        for (ARTDSaveGameState object : loadedObjects) {
            System.out.println(object.getName());
        }

    } catch (IOException | ClassNotFoundException e2) {
        e.printStackTrace();
    }
}

}
