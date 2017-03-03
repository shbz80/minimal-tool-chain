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

		String word = "a-string";
		String pigWord = pigLatin.pigiffy( word );

		if ( pigWord.length() < 1 ){

			fail("The returned String is empty.");

		}

	}

}
