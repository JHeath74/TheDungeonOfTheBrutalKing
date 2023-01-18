package ARTDEnemies;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDEnemies;
import AlternateRealityTheDungeon.ARTDSpells;

public class ARTDRats extends ARTDEnemies {
	
	public double sta;
	public double chr;
	public double str;
	public double inti;
	public double wis;
	public double agi;
	public double basedamage;
	public double HP;
	public double HeroHP;
	
	ARTDCharecter myChar = ARTDCharecter.Singleton();
	
	
	
	public ARTDRats()
	{

		double sta;
		double chr;
		double str;
		double inti;
		double wis;
		double agi;
		double basedamage;
		double HP =3;
	   // double HeroHP = myChar.CharInfo.indexOf(myChar.CharInfo.get(4));
		
		
	}
	
	public double attackdamage(double str, double basedamage)
	{
		
		double attackdamage = str + basedamage;
		
		return attackdamage;
	}
	
	public double defenseToDamage(double str, double agi)
	{
		
		double defenseToDamage = str+agi;
		
		return defenseToDamage;
	}
	
	
}
