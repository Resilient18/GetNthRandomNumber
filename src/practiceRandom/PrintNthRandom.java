package practiceRandom;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class PrintNthRandom {

	public static void main(String[] args) {
		
		System.out.println("Which number do you want to print?");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		
		Set <Integer> mySet = new TreeSet <Integer>();
		while (mySet.size()!=500) { 
			
			mySet.add(ThreadLocalRandom.current().nextInt(1, 1000));
			
		}
		System.out.println(mySet);
		
		Object [] myArray = mySet.toArray();
		System.out.println(myArray[n]);
	}

}
