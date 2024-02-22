package Enemies;

import DungeonoftheBrutalKing.Enemies;

public class Spiders extends Enemies
{


	public Spiders()
	{

		name = "Spider";
		sta = 1;
		chr = 1;
		str = 1;
		inti = 1;
		wis = 1;
		agi = 1;
		//basedamage = 3;
		//basedefense = 3;
		MonsterHP = 5;
		MonsterImage = "Spider.jpg";

	}

	public double attackdamage(double str, double basedamage)
	{

		double attackdamage = str + basedamage;

		return attackdamage;
	}

	public double defenseToDamage(double basedefense, double agi)
	{

		double defenseToDamage = basedefense+agi;

		return defenseToDamage;
	}

}
