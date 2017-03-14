package piglatin;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileReader;


public class PigLatin {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


	public static void main(String[] args) {    	

        for (int i=0;i<args.length;i++) {
            
            if ( args[i].equals("-authors") ){

                // If there is the flag authors, show info about them.
                printAuthorsInfo();
                return;

            }

        }

        if ( args.length > 0 ){

            // The user called the function with weird arguments. Show the help.
            printUsageWarning();
            printHelpInfo();
            return;

        }

    	
        System.out.println("Type the sentence to be piggified:");
       
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String newSentence = PigNumberClass.replacePosIntInSentenceWithWords(sentence);
        String piggified_sentence = PigLatinConversions.pigiffySentence(newSentence);
        
        System.out.println("The piggified version of your input is:\n" + piggified_sentence);

    }

    private static void printUsageWarning(){

        System.out.println(ANSI_RED + "WARNING: Bad program usage." + ANSI_RESET);

    }

    private static void printHelpInfo(){

        System.out.println("This is program that converts English sentences into Pig Latin.");
        System.out.println("Pig Lartin is a secret language formed from English by transferring the initial consonant or consonant cluster of each word to the end of the word and adding a vocalic syllable.");
        System.out.println("Usage:");
        System.out.println("Just running the program will start a terminal interface where the user can introduce his sentence, and check the piggified result.");
        System.out.println("Running the program with the flag <-authors> will show information about the development team behind this project.");

    }

    private static void printAuthorsInfo(){

        System.out.println(ANSI_PURPLE + "The bright minds behind this project:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Amir Roozbeh" + ANSI_RESET);
        System.out.println(ANSI_RED + "Shahbaz Khader" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Rui Oliveira" + ANSI_RESET);

    }




    	
}
