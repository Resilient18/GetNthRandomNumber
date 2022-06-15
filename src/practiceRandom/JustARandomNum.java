package practiceRandom;

import java.util.Random;

public class JustARandomNum {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		//int upperbound = 100;
		for(int i =0; i<=5; i++) {
		int randomNum =rand.nextInt(20);
		
		System.out.println(randomNum);
		
		

	}
	}
}
