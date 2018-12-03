package com.sapient.coding.challenge.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sapient.coding.challenge.AshaKellyCodingChallenge;

public class AshaKellyCodingChallengeTest {

	@Test
	public void findMinSampleInput1() {
		AshaKellyCodingChallenge codingChallenge = new AshaKellyCodingChallenge();
		assertEquals(1, codingChallenge.minNum(3,5,1));
	}
	
	@Test
	public void findMinSampleInput2() {
		AshaKellyCodingChallenge codingChallenge = new AshaKellyCodingChallenge();
		assertEquals(2, codingChallenge.minNum(4,5,1));
	}
	
	@Test
	public void findMinSampleInput3() {
		AshaKellyCodingChallenge codingChallenge = new AshaKellyCodingChallenge();
		assertEquals(3, codingChallenge.minNum(3,6,6));
	}
	
	@Test
	public void findMinNegativeCase() {
		AshaKellyCodingChallenge codingChallenge = new AshaKellyCodingChallenge();
		assertEquals(-1, codingChallenge.minNum(6,6,6));
	}
}
