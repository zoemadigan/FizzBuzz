
public class FizzBuzzCreator {

	/**
	 * @author zoemadigan
	 * @version 0.1
	 * @since 2012-04-10
	 * "FizzBuzz" Code for Etsy Hacker School App.
	 */	

	/**
	 * Print "FizzBuzz" list from 1-100 (integers, inclusive)
	 * 
	 * When number is divisible by 3 and 5, print "FizzBuzz"
	 * When number is divisible by 3 (and not 5), print "Fizz"
	 * When number is divisible by 5 (and not 3), print "Buzz"
	 * For all other numbers, print the number itself
	 * 
	 */	
	public static void main(String[] args)
	{

		for (int fbi = 1; fbi <= 100; fbi ++) {
			String fizzBuzzNumbers = "";

			if (fbi % 3 == 0) {
				fizzBuzzNumbers += "Fizz";
			}

			if (fbi % 5 == 0){
				fizzBuzzNumbers+="Buzz";
			}
			if (fizzBuzzNumbers.length()==0) {
				fizzBuzzNumbers=Integer.toString(fbi);
			}
			System.out.println(fizzBuzzNumbers);
		}
	}
}

