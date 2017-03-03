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

		String piggified_word = "oveglay";
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
        // Generalize implementation later...
		String piggified_word = "oveglay";

        return piggified_word;
    }

}
