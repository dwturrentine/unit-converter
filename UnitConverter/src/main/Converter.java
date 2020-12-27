package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {

		int menuSelection = 0;
		double measurement;
		double teaspoons;
		double kilometers;
		double imperialG;
		
		
		Scanner in = new Scanner(System.in);
        
		
		while (menuSelection != 4) { /*last menu option */
			System.out.println("Please select an option: \n"+
				"1. Cups to Teaspoons. \n"+
				"2. Miles to Kilometers. \n"+
				"3. US Gallons to Imperial Gallons. \n"+
				"4. Quit.");
			menuSelection = in.nextInt();

		switch ( menuSelection ) {
		   case 1:
		       System.out.println("Enter the number of Cups: ");
		       measurement = in.nextDouble();
		       teaspoons = measurement * 48;
		       System.out.println("You have " +teaspoons +"teaspoons.");
		       break;          
		   case 2:
		       System.out.println("Enter the number of Miles: ");
		       measurement = in.nextDouble();
		       kilometers = measurement * 1.609;
		       System.out.println("Kilometers = " +kilometers);
		       break;          
		   case 3:
		       System.out.println("Enter the number of US Gallons: ");
		       measurement = in.nextDouble();
		       imperialG = measurement / 1.201;
		       System.out.println("Imperial Gallons = " +imperialG);
		       break; 
		   case 4:
		       System.out.println("Quit");
		       menuSelection = in.nextInt();
		       System.out.println("Goodbye.");
		       System.exit(1);
		       break; 
		 
		   default:
		       System.out.println("Error! Not an option.");
		       System.exit(1);          
		}
		
	}
	}
	}
