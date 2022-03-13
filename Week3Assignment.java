package week3CodingAssignment;

public class Week3Assignment {
	
	//This is my own problem-solving method that tells you how much a trip will cost in gas money.
	//If you input the distance, gas prices, and the miles per gallon on your vehicle, it tells you 
	//how much the trip will cost.
	static double milesPerGallon(double miles, double gasPrice, int vehicleMileage) {
		double cost = ((miles / vehicleMileage) * gasPrice);
		return cost;
	}
	
	/*
	 * Write a method called willBuyDrink that takes a boolean isHotOutside, and a
	 * double moneyInPocket, and returns true if it is hot outside and if
	 * moneyInPocket is greater than 10.50.
	 */
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && (moneyInPocket > 10.50)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * Write a method that takes two arrays of double and returns true if the
	 * average of the elements in the first array is greater than the average of the
	 * elements in the second array.
	 */
	static boolean arraySize(double[] firstArray, double[] secondArray) {
		double firstAvg = returnAverage(firstArray);
		double secondAvg = returnAverage(secondArray);
		if (firstAvg > secondAvg) {
			return true;
		} else
			return false;

	}

	/*
	 * Write a method that takes an array of double and returns the average of all
	 * the elements in the array.
	 */
	static double returnAverage(double[] nums) {
		double sum = 0;
		for (int d = 0; d < nums.length; d++) {
			sum += nums[d];
		}
		double avg = sum / nums.length;
		return avg;
	}

	/*
	 * Write a method that takes an array of int and returns true if the sum of all
	 * the ints in the array is greater than 100.
	 */
	static boolean isOverHundred(int[] array) {
		int sum = 0;
		for (int c = 0; c < array.length; c++) {
			sum += array[c];
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Write a method that takes two Strings, firstName and lastName, and returns a
	 * full name (the full name should be the first and the last name as a String
	 * separated by a space).
	 */
	static String returnFullName(String firstName, String lastName) {
		String fullName = (firstName + " " + lastName);
		return fullName;
	}

	/*
	 * Write a method that takes a String, word, and an int, n, as arguments and
	 * returns the word concatenated to itself n number of times. (i.e. if I pass in
	 * “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	 */
	static String concatinate(String word, int n) {
		String b = "";
		for (int a = 0; a < n; a++) {
			b += word;
		}
		return b;
	}

	public static void main(String[] args) {
		/*
		 * - Create an array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93. - Programmatically subtract the value of the first
		 * element in the array from the value in the last element of the array (i.e. do
		 * not use ages[7] in your code). Print the result to the console. - Add a new
		 * age to your array and repeat the step above to ensure it is dynamic (works
		 * for arrays of different lengths). - Use a loop to iterate through the array
		 * and calculate the average age. Print the result to the console.
		 */
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		int difference = ages[ages.length - 1] - ages[0];
		System.out.println("Last age minus first age: " + difference);
		int sum = 0;
		for (int counter = 0; counter < ages.length; counter++) {
			sum += ages[counter];
		}
		int avg = sum / ages.length;
		System.out.println("Average age: " + avg);

		/*
		 * - Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. - Use a loop to iterate
		 * through the array and calculate the average number of letters per name. Print
		 * the result to the console. - Use a loop to iterate through the array again
		 * and concatenate all the names together, separated by spaces, and print the
		 * result to the console.
		 */
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int nameSum = 0;
		for (int x = 0; x < names.length; x++) {
			nameSum += names[x].length();
		}
		int nameAvg = nameSum / names.length;
		System.out.println("Average name length: " + nameAvg);
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println("");
		/*
		 * - Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array. - Write a loop to iterate over the nameLengths array and
		 * calculate the sum of all the elements in the array. Print the result to the
		 * console.
		 */
		int nameLengths[] = new int[names.length];
		int nameLengthSum = 0;
		for (int j = 0; j < nameLengths.length; j++) {
			nameLengths[j] = names[j].length();
		}
		for (int k = 0; k < nameLengths.length; k++) {
			nameLengthSum += nameLengths[k];
		}
		System.out.println("Sum of name lengths: " + nameLengthSum);

		String words = concatinate("Testing", 3);
		System.out.print(words);
		System.out.println("");

		String fullName = returnFullName("Austin", "Whitley");
		System.out.println(fullName);

		int[] testArray = { 25, 25, 25, 26 };
		boolean arrayCheck = isOverHundred(testArray);
		System.out.println("Array > 100: " + arrayCheck);

		double[] numbers = { 10.2, 5.8, 3.9 };
		double numAvg = returnAverage(numbers);
		System.out.println("Average = " + String.format("%.2f", numAvg));

		double[] prices = { 9.99, 9.50, 14.99, 9.99 };
		double[] weight = { 1.2, 2.3, 1.9, 1.8 };
		boolean priceTooHigh = arraySize(prices, weight);
		System.out.println("Too expensive: " + priceTooHigh);
		
		boolean drink = willBuyDrink(true, 15.25);
		System.out.println("I should buy a drink: " + drink);
		
		double driveCost = milesPerGallon(20.32, 3.75, 19);
		System.out.println("The trip will cost $" + String.format("%.2f",driveCost));

	}

}
