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

}
