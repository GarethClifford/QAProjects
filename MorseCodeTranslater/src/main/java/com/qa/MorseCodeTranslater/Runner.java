package com.qa.MorseCodeTranslater;

import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(morseToEnglish(".-"));
	}

	public static String morseToEnglish(String morsetext) {
		HashMap<String, Character> map = new HashMap<String, Character>();

		Character english[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };
		String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".--", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "/" };
		String morseToEnglish;
		for (int i = 0; i < english.length; i++) {
			map.put(morse[i], english[i]);
		}

		morsetext.split(morsetext);

		System.out.println(morsetext);

		return "";
	}

}
