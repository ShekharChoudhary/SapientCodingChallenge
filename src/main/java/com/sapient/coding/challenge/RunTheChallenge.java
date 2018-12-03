package com.sapient.coding.challenge;

public class RunTheChallenge {

	public static void main(String[] args) {
		AshaKellyCodingChallenge challenge = new AshaKellyCodingChallenge();
		
		int output = challenge.minNum(6, 6, 0);
		System.out.println("Num of Problems by Asha : 6");
		System.out.println("Num of Problems by Kelly : 6");
		System.out.println("Num of Problems Asha is ahead of Kelly : 0");
		
		System.out.println("Num of days Kelly will take to surpass Asha : "+output);
	}
}
