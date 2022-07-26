package main;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		String[] alphabet = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X", "Y", "Z" };
		int[] numericValues = { 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 34,35, 36, 37, 38 };

		String lettersContainer = "";
        String concatLettersContainer = "";
		int letterContainerLength = 4;
		int numericContainerLength = 6;
		int valuePositionAlphabet = 0;
		int valuePositionNumeric = 0;
		int calcNumericValue = 0;
		int sumCalcNumericValues = 0;
		int numberContainer = 0;
		int pow = 0;
		int divSumCalcNumericValues= 0;
		int multDivSumCalcNumericValues = 0;
		int verifyingDigit = 0;
		
		Random generator = new Random();
		for (int i = 1; i <= letterContainerLength; i++) {
			valuePositionAlphabet = generator.nextInt(alphabet.length);

			lettersContainer = alphabet[valuePositionAlphabet];
			concatLettersContainer += lettersContainer; 
			
			valuePositionNumeric = numericValues[valuePositionAlphabet];

			pow = i - 1;

			calcNumericValue = (int) (valuePositionNumeric * (Math.pow(2, pow)));
			System.out.println("The letter at position "+pow+" (Alphabet position : "+valuePositionAlphabet+") is " + lettersContainer +" , the value is " + valuePositionNumeric +            " and " + valuePositionNumeric +" x (2 ^ "+pow+") = "+calcNumericValue);

			sumCalcNumericValues += calcNumericValue;
			System.out.println("------------------------------------------------------------------------------------------------");
		}		
		
		for(int i = 0; i < numericContainerLength; i++) {
			numberContainer = generator.nextInt(9); 
			pow ++ ;
			
			concatLettersContainer += numberContainer;
			
			calcNumericValue = (int) (numberContainer * (Math.pow(2, pow)));
			System.out.println("The number at position "+pow+" is " + numberContainer +" and "+numberContainer+" x (2 ^ "+pow+") = " +calcNumericValue);
			System.out.println("------------------------------------------------------------------------------------------------");
			sumCalcNumericValues += calcNumericValue;
		}
		
		divSumCalcNumericValues =  sumCalcNumericValues / 11;
		multDivSumCalcNumericValues = divSumCalcNumericValues * 11;
		verifyingDigit = sumCalcNumericValues - multDivSumCalcNumericValues;
		concatLettersContainer += verifyingDigit;
		
		System.out.println("First lets sum all values from those positions : "+sumCalcNumericValues);
		System.out.println("Second we need divide the total value we got few seconds ago : " + divSumCalcNumericValues);
		System.out.println("Then we multiple the value : " + multDivSumCalcNumericValues);
		System.out.println("Finally we got the verifying digit : "+ verifyingDigit);
		System.out.println();
		System.out.println("Voilà monsieur");
		System.out.println(concatLettersContainer);
	}
}