package functions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift10 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    System.out.print("Input a year: ");
		    String yearInput = "";
		    String pattern = "^[12][0-9]{3}$";
		    Pattern r = Pattern.compile(pattern);
		    //checking is valid year
		    while(input.hasNext()){
		      yearInput = input.nextLine();
		      Matcher m = r.matcher(yearInput);
		      if(m.find()) {
		        break;
		      } else {
		        System.out.println("Error: Not a valid year");
		        System.out.print("Please enter a year between 1000 and 2999 inclusive: ");
		      }
		    }

		    Year theYear = new Year(Integer.valueOf(yearInput));

		    if(theYear.isLeapYear()) { 
		      System.out.println("That's a leap year!");
		    } else {
		      System.out.println("false");
		    }
		  }

		  public static class Year {
		    private int year;

		    private Year(int y) {
		      year = y;
		    }

		    private boolean isLeapYear() {
		      if (year % 4 != 0) {
		        return false;
		      } else if (year % 400 == 0) {
		        return true;
		      } else if (year % 100 == 0) {
		        return false;
		      } else {
		        return true;
		      }
		    }
		  }
		}

