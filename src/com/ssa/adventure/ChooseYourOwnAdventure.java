package com.ssa.adventure;

import java.util.Scanner;

public class ChooseYourOwnAdventure {

	public static Scanner sc = new Scanner(System.in);
	public static boolean stillPlaying = true;

	public static void main(String[] args) {

		while (stillPlaying) {

			System.out.println("You have just landed at L A X \nWelcome to California!");
			System.out.println("You have picked up your bags, caught a cab to your Hotel, and have showered and changed"
					+ "\nWhat would you like to do?\n" + "\t C: go to the Club\n" + "\t B: go to the Beach\n"
					+ "\t S: go to Sleep");

			String whereToGo = sc.nextLine();

			whereAmIGoing(whereToGo);
		}
	}

	public static void whereAmIGoing(String whereToGo) {
		switch (whereToGo.toLowerCase()) {
		case "c":
			youreGoingToTheClub();

			break;
		case "b":
			youreGoingToTheBeach();

			break;
		case "s":
			youreGoingToSleep();

			break;

		}
	}

	private static void youreGoingToSleep() 
	{
		System.out.println("You've decided to go to sleep");
		System.out.println("Why would you do that? You're boring\nGAME OVER");
		System.out.println("Do you want to play again?" + "\n\tY" + "\n\tN");

		String stayOrGo = sc.nextLine();
		
	}
	
	private static void youreGoingToTheBeach() {
		System.out.println("You've decided to go to the beach");
		System.out.println(
				"What to do now?" + "\n\tS: I'm going surfing" + "\n\tR: I'm going to go running on the beach");

		String beachDecision = sc.nextLine();

		onTheBeach(beachDecision);
	}

	private static boolean onTheBeach(String beachDecision) {
		switch (beachDecision.toLowerCase())
		{
		case "s":
			System.out.println(
					"You caught a big wave, but a Great White got ahold of you. You became his lunch. You Lose!");
			System.out.println("Do you want to play again?" + "\n\tY" + "\n\tN");

			String stayOrGo = sc.nextLine();

			break;

		case "r":
			System.out.println("You're smart...fit and safe. You Win!");

		}
		
		return stillPlaying;
	}

	public static void youreGoingToTheClub() {
		System.out.println("You've decided to go to the Club");
		System.out.println("You just got got past the bouncers at Club Aura" + "\nWhat to do now?"
				+ "\n\tD: I'm going to get a drink" + "\n\tP: I'm going to go get some phone numbers");

		String inClubDecision = sc.nextLine();

		inTheClub(inClubDecision);

	}

	private static boolean inTheClub(String inClubDecision) {
		switch (inClubDecision.toLowerCase()) {
		case "d":
			System.out.println("1 drink turned into 20 drinks. You're an alcoholic!\nYou lose!");
			System.out.println("Do you want to play again?" + "\n\tY" + "\n\tN");

			String stayOrGo = sc.nextLine();

			break;
		case "p":
			System.out.println("Rico, Rico Suave, you got like 10 numbers!! You da man! You Win!!!");

			break;
		}
		return stillPlaying;
	}

	public static boolean stayOrGo(String stayOrGo) 
	{
		switch (stayOrGo) 
		{

		case "y":
			break;
			

		case "n":
			stillPlaying = false;
			
			break;
		}
		return stillPlaying;
	}
}
