package com.qa.main;

public class BlackJack 
{
	public void playBlackJack(int blackJackNumberOne, int blackJackNumberTwo)
	{
		int numberOneCountNumber = 0;
		int numberTwoCountNumber = 0;
		
		if (blackJackNumberOne > 21 || blackJackNumberTwo > 21)
		{
			System.out.println("Bad Numbers :(");
		}
		else
		{
		
			do
			{
				blackJackNumberOne++;
				numberOneCountNumber++;
				
				while (blackJackNumberTwo != 22)
				{
					blackJackNumberTwo++;
					numberTwoCountNumber++;
				}
			} while (blackJackNumberOne != 22);
				
			if (numberOneCountNumber < numberTwoCountNumber)
			{
				System.out.println("Number one is closest to going over 21");
			}
			else
			{
				System.out.println("Number Two is closest to going over 21");
			}
		}
	}

}
