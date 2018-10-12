package com.qa.Blackjack;

public class Runner {

	public static void main(String[] args) {

	}

	public int playTime(int a, int b) {
		int winner;
		if (a < 22 && b < 22) {
			if (a < b) {
				winner = b;
			} else {
				winner = a;
			}
		} else if (a < 22 && b >= 22) {
			winner = a;
		} else if (a >= 22 && b < 22) {
			winner = b;
		} else {
			winner = 0;
		}
		return winner;
	}

}
