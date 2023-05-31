package AlternateRealityTheDungeon;

import java.io.Serializable;
import java.util.ArrayList;

class ARTDSaveGameState implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8850304030791166709L;
	String name;
	
	public ARTDSaveGameState(ArrayList<String> charInfo) {
		this.name = name;
	}

    public String getName() {
        return name;
    }
	
}
