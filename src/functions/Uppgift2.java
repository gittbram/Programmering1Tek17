package functions;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        int x = scanner.nextInt();
	        System.out.print("Input the second number: ");
	        int y = scanner.nextInt();
	        System.out.print("Input the third number: ");
	        int z = scanner.nextInt();
	        System.out.print("The average value is " + average(x, y, z)+"\n" );
	    }

	  public static int average(int x, int y, int z)
	    {
	        return (x + y + z) / 3;
	    }
	}

