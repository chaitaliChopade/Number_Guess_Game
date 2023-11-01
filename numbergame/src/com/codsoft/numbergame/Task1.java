package com.codsoft.numbergame;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
	public static int generatenum(int start,int end) {
		Random random=new Random();
		return random.nextInt(end-start+1)+start;
		
	}
	public static void main(String[] args) {
		int start =1;
		int end =100;
		int maxAtt=3;
		
		Scanner scanner =new Scanner(System.in);
		int totalround=0;
		int roundshow=0;
		
		boolean playagain=true;
		while(playagain) {
			int randomnum=generatenum(start, end);
			System.out.println("Generate number from "+ start +"and " +end);
			
			int guess;
			int attempts=0;
			
			while(attempts<maxAtt) {
				System.out.println("Enter the number guess");
				guess=scanner.nextInt();
				attempts++;
				
				if(guess==randomnum) {
					System.out.println("Congratulations !  you guessed the correct number !!");
					randomnum++;
					break;
				}
				else if(guess>randomnum) {
					System.out.println("too high!! please try again");
					
				}
				else {
					System.out.println("too low !! Please try again");
				}
			}
			if(attempts>=maxAtt) {
				System.out.println("sorry you have run out of attempts "+ randomnum);
			}
			totalround++;
			
			System.out.println("Do you want to play again ?(yes/No)");
			String playAgainInput=scanner.next();
			playagain=playAgainInput.equalsIgnoreCase("yes");
		}
		System.out.println("thank you so much for plyaing");
		System.out.println("your score "+ roundshow +" out of "+ totalround +"round won.");
		scanner.close();
	}

}
