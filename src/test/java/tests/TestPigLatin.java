package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import piglatin.*;

public class TestPigLatin {

	@Test
	public void pigiffyReturnsNonEmptyString() {
		//  This test simply checks if the PigLatin is returning
		// a non empty string when we ask it to piggify something.
		PigLatin pigLatin = new PigLatin();

		String word = "string";
		String pigWord = pigLatin.pigiffy( word );

		if ( pigWord.length() < 1 ){

			fail("The returned String is empty.");

		}

	}

	@Test
	public void checkWordsBeginWithVowel() {
		//  This test checks if words that begins with vowel are translated correctly.
		PigLatin pigLatin = new PigLatin();

		String[] inputWords = {"a", "iphone", "."};
		String[] pigWords = {"away", "iphoneway", "."};

		for (int i=0;i<inputWords.length;i++) {
			if(!(pigWords[i].equals(pigLatin.pigiffy(inputWords[i])))) {
				System.out.println(pigWords[i]);
				System.out.println(pigLatin.pigiffy(inputWords[i]));
				fail("Test with words beginning with vowels failed.");
			}
		}
	}

	@Test
	public void checkWordsBeginConsonant() {
		//  This test checks if words that begins with consonants are translated correctly.
		PigLatin pigLatin = new PigLatin();

		String[] inputWords = {"cat", "phone", "."};
		String[] pigWords = {"atcay", "onephay", "."};

		for (int i=0;i<inputWords.length;i++) {
			if(!(pigWords[i].equals(pigLatin.pigiffy(inputWords[i])))) {
				System.out.println(pigWords[i]);
				System.out.println(pigLatin.pigiffy(inputWords[i]));
				fail("Test with words beginning with consonants failed.");
			}
		}
	}

	@Test
	public void checkNumberTranslation() {
		//  This test checks if some numbers are correctly translated
		PigLatin pigLatin = new PigLatin();

		int[] inputNumbers = {0, 1, 7, 8, 9};
		String[] pigWords = {"erozay", "oneway", "evensay", "eightway", "inenay"};

		for (int i=0;i<inputNumbers.length;i++) {
			if(!(pigWords[i].equals(pigLatin.pigiffyDigit(inputNumbers[i])))) {
				System.out.println(pigWords[i]);
				System.out.println(pigLatin.pigiffyDigit(inputNumbers[i]));
				fail("Test of number translation failed.");
			}
		}
	}

	@Test
	public void checkHolyWords() {
		// This test checks if some holy words are detected, and if some non-holy
		// words are marked as such
		PigLatin pigLatin = new PigLatin();

		int[] inputNumbers = {0, 1, 7, 8, 9};
		String[] HolyWords = pigLatin.HolyWords;
		String[] unholyWords = {"pokemon", "chair", "brexit"};

		for (int i=0;i<HolyWords.length;i++) {
			if(!(pigLatin.isHolyWord(HolyWords[i]))) {
				System.out.println(HolyWords[i]);
				System.out.println("Was classified as being a non holy word.");
				fail("Test of Holy Words check failed.");
			}
		}

		for (int i=0;i<unholyWords.length;i++) {
			if(pigLatin.isHolyWord(unholyWords[i])) {
				System.out.println(unholyWords[i]);
				System.out.println("Was classified as being a holy word.");
				fail("Test of Holy Words check failed.");
			}
		}
	}
	
	@Test
	public void checkSentence() {
		// This test checks if the sentance parsed correctly
		
		String sentance = "This is a test"
		String pigiffySentence = pigiffySentence(sentance);
		
		if (WordCount(sentance) != WordCount(pigiffySentence)){
			fail("Messed up on parsing");
		}
		
		// counting a word in sentance
		public int WordCount (String sc) {
		     String[] wordArray = sc.trim().split("\\s+");
		     int wordCount = wordArray.length;
		     return wordCount;

		}
	}	
}
