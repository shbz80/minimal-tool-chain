package piglatin;

import java.io.Console;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;

public class PigLatin {

	// Strings which are Holy Words, these will never be translated
	// due to their magnificence
	public static String[] HolyWords = {"Amir", "Shahbaz", "Rui", "Patric", "Celine Dion", "WASP", "semla"};


    public static void main(String[] args) {
        System.out.println("Input a word to be piggified:");

        Scanner sc = new Scanner(System.in);

		String text_input = sc.next();

		String piggified_word = pigiffy(text_input);
		System.out.println("The piggified word is: "+piggified_word);

    }

    public static String pigiffy(String word) {
        String vowels = "aeiouAEIOU";
		String piggified = word;

		if (vowels.contains(""+word.charAt(0))) {
			piggified = word+"way";
			return piggified;
		}
		else {
			for (int i = 1; i < word.length(); i++) {
		    	if (vowels.contains(""+word.charAt(i))) {
		        	String prefix = word.substring(0, i);
		        	String suffix = word.substring(i);
		        	piggified = suffix + prefix + "ay";
		        	break;
		    	}
			}
		}
    	return piggified;
    }

    public static boolean isHolyWord(String word){

    	for (int i=0;i<HolyWords.length;i++) {
    		boolean isHolyWord = HolyWords[i].equalsIgnoreCase( word );
			if(isHolyWord) {
				return true;
			}
		}

    	return false;

    }


    public static String pigiffyDigit(int number) {

    	String word;

    	switch (number) {

    		case 0:  word = "zero";
                     break;
            case 1:  word = "one";
                     break;
            case 2:  word = "two";
                     break;
            case 3:  word = "three";
                     break;
            case 4:  word = "four";
                     break;
            case 5:  word = "five";
                     break;
            case 6:  word = "six";
                     break;
            case 7:  word = "seven";
                     break;
            case 8:  word = "eight";
                     break;
            case 9:  word = "nine";
                     break;
            default: word = "";
                     break;
        }

    	String pigiffied_word = pigiffy(word);

    	return pigiffied_word;

    }

}
