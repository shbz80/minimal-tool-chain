package piglatin;

import java.io.Console;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println("Input a word to be piggified:");

        Scanner sc = new Scanner(System.in);

		String text_input = sc.next();

		String piggified_word = pigiffy(text_input);
		System.out.println("The piggified word is: "+piggified_word);
		//System.out.println(piggified_word);


    	/*Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }
		String login = c.readLine("Enter your login: ");*/

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

}
