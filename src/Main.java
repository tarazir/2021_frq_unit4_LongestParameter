/*
Program by: Mr. Tarazi, ASK HS Technology Teacher
Date: May 7th, 2021

2021 - Unit 4 - Progress Check - FRQ

Objective: The method longestParamter is intended to determine the longest substring of consecutive identical
characters in the parameter str and print the result.

For example, the call longestParamter("CCAAAAATTT!") should print the result "A 5" because
the longest substring of consecutive identical characters is "AAAAA".
Complete the method below. Your implementation should conform to the example above.


public static void longestParamter(String str)
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
       longestParamter("CCAAAAATTT!");
    }

    public static void longestParamter(String str) {

        // These variables are what I am trying to get data for
        String maxChar = "";
        int maxLen = 0;

        // Where I am standing right now and the current character
        int current = 0;
        String currentChar = "";

        for (int i=0; i<str.length(); i++)
        {

            currentChar = str.substring(i,i+1);
            current = i+1;

            while (current < str.length() && str.substring(current, current+1).equals(currentChar))
            {
                current++;
            }
            // Assigns number to maxLens, and assign char to maxChar
            if(current - i > maxLen) {
                maxLen = current - i;
                maxChar = currentChar;
            }
        }
        System.out.println("Character " + maxChar + " appears ->  " + maxLen + " times");
    }
}
