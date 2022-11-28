package AlternateRealityTheDungeon;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ARTDLoadSaveGame {

	

	ARTDCharecter myChar = ARTDCharecter.Singleton();
	String SavedGameDirectory = ("src\\AlternateRealityTheDungeon\\TextFiles\\SaveGame\\");

	


	public void StartGameLoadCharecter() throws IOException
	{

		ArrayList<String> SaveLoadChar = new ArrayList<String>();
		File chosenFile = getLastModified(SavedGameDirectory);

		BufferedReader bufReader = new BufferedReader(new FileReader(chosenFile));

		String line = bufReader.readLine();
		while (line != null) 
		{	

			SaveLoadChar.add(line);

			line = bufReader.readLine(); 

		}


		//ARTDCharecter.CharInfo().addAll(SaveLoadChar);
		myChar.CharInfo.addAll(SaveLoadChar);
		//System.out.println("ARTDLoadSaveGame: " + myChar.CharInfo().toString());
		System.out.println("ARTDLoadSaveGame: " + myChar.CharInfo.toString());

		bufReader.close();


	}

	public void SaveGame() throws IOException, ParseException {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd-hh:mm:ss");

		String datetime = dateFormat.format(date);

		datetime = datetime.replaceAll(":", ".");

		String GameLocation = "src/AlternateRealityTheDungeon/TextFiles/SaveGame/SavedGame";

		String SavedGameName = "SavedGame" + datetime;

		if (SavedGameName != "IntialCharecterSave.txt") {
			String GameSaveDateTime = GameLocation + datetime + ".txt";

			FileWriter writer = new FileWriter(GameSaveDateTime);

			for (String Charinfo : myChar.CharInfo) {
				//for (String Charinfo : ARTDCharecter.CharInfo()) {
				writer.write(Charinfo + System.lineSeparator());
			}
			writer.close();

			JOptionPane.showMessageDialog(null, "Game Saved: " + SavedGameName);
		} else {
			JOptionPane.showMessageDialog(null,
					"Unable to Save Current Game Over Saved Game called  'InitialCharecterSave.txt'\n");
		}

	}

	public void LoadGame() {
		JFrame loadGame = new JFrame("Load Game");
		JPanel lg = new JPanel(new BorderLayout());
		JButton load = new JButton("Load Game");
		JComboBox<String> loadGameSelection = new JComboBox<String>();

		File loadgamefiles = new File(SavedGameDirectory);

		File[] listOfFiles = loadgamefiles.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			loadGameSelection.addItem(listOfFiles[i].getName());
		}

		loadGameSelection.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String gameInfo = loadGameSelection.getSelectedItem().toString();

				try {
					BufferedReader bufReader = new BufferedReader(
							new FileReader("src\\AlternateRealityTheDungeon\\TextFiles\\SaveGame\\" + gameInfo));
					String line = bufReader.readLine();
					while (line != null) {
						myChar.CharInfo.add(line);
						//ARTDCharecter.CharInfo();
						line = bufReader.readLine();
					}
					bufReader.close();

				} catch (Exception e1) {

				}

				load.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						if (gameInfo == "InitialCharecterSave.txt") {
							JOptionPane.showConfirmDialog(null,
									"This will reload the original saved game and restart your character",
									"Reload Save Game", JOptionPane.YES_NO_OPTION);
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

	public static File getLastModified(String SavedGameDirectory)
	{
		File directory = new File(SavedGameDirectory);
		File[] files = directory.listFiles(File::isFile);
		long lastModifiedTime = Long.MIN_VALUE;
		File chosenFile = null;

		if (files != null)
		{
			for (File file : files)
			{
				if (file.lastModified() > lastModifiedTime)
				{
					chosenFile = file;
					lastModifiedTime = file.lastModified();
				}
			}
		}

		return chosenFile;
	}

}
