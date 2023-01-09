package ARTDEnemies;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import AlternateRealityTheDungeon.ARTDCharecter;
import AlternateRealityTheDungeon.ARTDEnemies;

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
	
	ARTDCharecter myChar = new ARTDCharecter();
	
	
	
	public ARTDRats()
	{

		double sta = 1;
		double chr;
		double str;
		double inti;
		double wis;
		double agi;
		double basedamage = 1;
		double HP = 3;
		double HeroHP = myChar.CharInfo.indexOf(myChar.CharInfo.get(4));
		
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
	
	public void RatsCombatEncouter()
	{
		
		BufferedImage GiantRatImage = null;
		try {
			GiantRatImage = ImageIO.read(new File("src\\AlternateRealityTheDungeon\\Images\\GiantRat.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		
		JFrame RatsFrame = new JFrame("You've encountered a Rat");
		JPanel RatsPanel = new JPanel(new BorderLayout());
		JPanel RatsPanelImage = new JPanel();
		JPanel RatsPanelButtons = new JPanel();
		JPanel RatsPanelCombatArea = new JPanel();
		
		JTextArea RatsCombatTextArea = new JTextArea();
		
		JButton RatsAttack = new JButton("Attack");
		JButton RatsPotion = new JButton("Use Healing Potion");
		JButton RatsRun = new JButton("Run Away!");
		
		RatsFrame.add(RatsPanel);
		RatsPanel.add(RatsPanelImage, BorderLayout.NORTH);
		RatsPanel.add(RatsPanelButtons, BorderLayout.SOUTH);
		RatsPanel.add(RatsCombatTextArea, BorderLayout.CENTER);
		
		RatsPanelImage.add(RatsPanelImage, new ImageIcon(GiantRatImage));
		RatsPanelButtons.add(RatsAttack);
		RatsPanelButtons.add(RatsPotion);
		RatsPanelButtons.add(RatsRun);
		
		RatsPanelCombatArea.add(RatsCombatTextArea);
		
		
		RatsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RatsFrame.setVisible(true);
		
		RatsAttack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(HP > 0 || HeroHP > 0)
				{
					
				}
				
			}});
		
		RatsPotion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				
			}});
		
		RatsRun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
	}
	

}
