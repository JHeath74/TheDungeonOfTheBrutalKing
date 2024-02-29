package DungeonoftheBrutalKing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SaveLoadGameData {

	Singleton myChar = null;
	Singleton mySpellList = null;
	GameSettings myGameSettings = new GameSettings();
	int width, height = 0;

	ArrayList<ArrayList<?>> GameState = new ArrayList<>();

	public SaveLoadGameData()
	{
	//	myChar = new ARTDSingleton();
	//	mySpellList = new ARTDSingleton();


	}

	// Add objects to the collection
	public void addToArray()
	{
		// GameState.add(myChar.myCharSingleton().CharInfo);
		//GameState.add(mySpellList.spellList());
	}

	public void StartGameLoadCharecter() throws IOException {

		ArrayList<String> SaveLoadChar = new ArrayList<>();
		File chosenFile = getLastModified(GameSettings.SavedGameDirectory);  //Why is it getting the file twice

		BufferedReader bufReader = new BufferedReader(new FileReader(chosenFile));

		String line = bufReader.readLine();
		while (line != null) {

			SaveLoadChar.add(line);

			line = bufReader.readLine();

		}

		Singleton.myCharSingleton().CharInfo.addAll(SaveLoadChar);

		bufReader.close();

	}

	public void SaveGame() throws IOException, ParseException {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd-hh:mm:ss");

		String datetime = dateFormat.format(date);

		datetime = datetime.replaceAll(":", ".");

		String SavedGameName = "SavedGame" + datetime + ".ser";

		if (SavedGameName != "IntialCharecterSave.txt") {

			// an OutputStream file "SavedGameName" is created
		    FileOutputStream fos = new FileOutputStream(SavedGameName);

		    // an ObjectOutputStream object is created on the FileOutputStream object
		    ObjectOutputStream oos = new ObjectOutputStream(fos);

		    // calling the writeObject() method of the ObjectOutputStream on the OutputStream file "namesList"
            oos.writeObject(GameState);

            // close the ObjectOutputStream
            oos.close();

            // close the OutputStream file
            fos.close();

			JOptionPane.showMessageDialog(null, "Game Saved: " + SavedGameName);
		} else {
			JOptionPane.showMessageDialog(null,
					"Unable to Save Current Game Over Saved Game called  'InitialCharecterSave.txt'\n");
		}

	}

	public void LoadGame() {

		ArrayList<String> LoadChar = new ArrayList<>();

		//***************************************************
				//******** Getting Screen Width and Height **********
				//***************************************************

				// getScreenSize() returns the size of the screen in pixels
		        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

		        // width will store the width of the screen
		        width = (int)size.getWidth();

		        // height will store the height of the screen
		        height = (int)size.getHeight();

		JFrame loadGame = new JFrame("Load Game");
		loadGame.setSize(width, height);

		JPanel lg = new JPanel(new BorderLayout());
		JButton load = new JButton("Load Game");
		JComboBox<String> loadGameSelection = new JComboBox<>();

		File loadgamefiles = new File(GameSettings.SavedGameDirectory);

		File[] listOfFiles = loadgamefiles.listFiles();

		for (File listOfFile : listOfFiles) {
			loadGameSelection.addItem(listOfFile.getName());
		}

		loadGameSelection.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				load.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						String gameInfo = loadGameSelection.getSelectedItem().toString();

						if (gameInfo.equals("InitialCharecterSave.txt")) {

							int response = JOptionPane.showConfirmDialog(null,
									"This will reload the original saved game and restart your character",
									"Reload Save Game", JOptionPane.YES_NO_OPTION);
							if (response == JOptionPane.YES_OPTION) {
								try {
									BufferedReader bufReader = new BufferedReader(
											new FileReader(GameSettings.SavedGameDirectory + gameInfo));
									String line = bufReader.readLine();
									while (line != null) {
										LoadChar.add(line);

										line = bufReader.readLine();
									}

									Singleton.myCharSingleton().CharInfo.addAll(LoadChar);
									bufReader.close();

								} catch (Exception e1) {

								}
							} else {

								JOptionPane.showMessageDialog(null, "Please Choose a Different Saved Game File");

							}
						} else {

							//I need to copy the data from the serialized file and copy the data to the correct Arraylist


						}

						JOptionPane.showMessageDialog(null, "Game Loaded: " + gameInfo);

						loadGame.dispose();

					}
				});
			}
		});

		lg.add(loadGameSelection);
		loadGame.add(lg, BorderLayout.CENTER);
		loadGame.add(load, BorderLayout.SOUTH);

		loadGame.setLocationRelativeTo(null);
		loadGame.setSize(640, 480);

		loadGame.setVisible(true);

	}



	public static File getLastModified(String SavedGameDirectory) {
		File directory = new File(SavedGameDirectory);
		File[] files = directory.listFiles(File::isFile);
		long lastModifiedTime = Long.MIN_VALUE;
		File chosenFile = null;

		if (files != null) {
			for (File file : files) {
				if (file.lastModified() > lastModifiedTime) {
					chosenFile = file;
					lastModifiedTime = file.lastModified();
				}
			}
		}

		return chosenFile;
	}


}