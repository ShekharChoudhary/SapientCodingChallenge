package com.sapient.coding.challenge;

/**
 * Password for the doc is sgmcoding2018
 * @author choudshe
 *
 */
public class AshaKellyCodingChallenge {
	
	public int minNum(int ashaProbCount, int kellyProbCount, int ashaExcessProbCount ) {
		
		int ashaProblemCounter = ashaExcessProbCount;
		int kellyProblemCounter = 0;
		int numberOfDays = 0;
		
		if(ashaProbCount >= kellyProbCount) {
			return -1;
		}
		
		while(kellyProblemCounter <= ashaExcessProbCount) {
			numberOfDays ++;
			ashaExcessProbCount = ashaExcessProbCount + ashaProbCount ;
			kellyProblemCounter = kellyProblemCounter + kellyProbCount;
		}
		
		return numberOfDays;
	}
}
