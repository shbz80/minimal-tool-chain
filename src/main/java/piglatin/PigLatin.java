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


	public static void main(String[] args) {    	
    	
        System.out.println("Type the sentence to be piggified:");
       
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String newSentence = PigNumberClass.replacePosIntInSentenceWithWords(sentence);
        String piggified_sentence = PigLatinConversions.pigiffySentence(newSentence);
        
        System.out.println("The piggified version of your input is:\n" + piggified_sentence);

    }


    	
}
