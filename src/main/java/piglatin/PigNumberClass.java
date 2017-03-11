package piglatin;
import piglatin.PigLatin;

public class PigNumberClass {

	
    
    public static String pigiffyDigit(int number) {

    	String word;

        // @Shahbaz, here I call a method. From Rui
        // pigNum.oink();

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

    	String pigiffied_word = PigLatin.pigiffy(word);

    	return pigiffied_word;

    }

}
