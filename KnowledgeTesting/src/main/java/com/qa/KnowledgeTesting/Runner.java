package com.qa.KnowledgeTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	static List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

	public static void main(String[] args) {

		System.out.println(taskSix());
	}

	public static String taskOne() {
		int i;
		String solutionOne = "";
		for (i = 0; i < numbers.size(); i++) {
			solutionOne = solutionOne + numbers.get(i) + System.lineSeparator();
		}
		return solutionOne;
	}

	public static String taskTwo() {
		int i;
		String solutionTwo = "";
		for (i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				solutionTwo = solutionTwo + numbers.get(i) + System.lineSeparator();
			}
		}
		return solutionTwo;
	}

	public static String taskThree() {
		int i;
		String solutionThree = "";
		for (i = 0; i < numbers.size(); i++) {
			solutionThree = solutionThree + numbers.get(i) * 10 + System.lineSeparator();
		}
		return solutionThree;
	}
	// TASK FOUR DOESN'T WORK!!!!!

	public static String taskFour() {
		int i;
		for (i = 0; i < numbers.size() - 1; i++) {
			if (numbers.get(i + 1) <= numbers.get(i)) {

				numbers.remove(i + 1);
			}
		}
		String solutionFour = "";
		solutionFour = solutionFour + "numbers";
		/* System.out.println(numbers); */
		return solutionFour;
	}

	// TASK SIX DOESN'T WORK!!!!!
	public static String taskSix() {
		String solutionSix = "";
		List<Integer> square = new ArrayList<Integer>();

		int i;
		for (i = 0; i < numbers.size(); i++) {
			square.add(numbers.get(i) * numbers.get(i));
		}
		for (i = 0; i < square.size(); i++) {
			numbers.add(square.get(i));
		}
		for (i = 0; i < numbers.size(); i++) {
			solutionSix = solutionSix + numbers.get(i) + System.lineSeparator();
		}
		return solutionSix;

	}
	// THIS IS THE SOLUTION THAT IS BEST TO USE, GIVEN BY MATT
	// numbers.stream().forEach(System.out::println);
	// sysout(numbers.stream().max((i,j) -> i.compareTo(j).toString())
	// numbers.stream().filter(i->i%2 == 0).forEach(system.out::println);
	// numbers.stream().map(i-> i*10).forEach(system.out::println);
	// lilsst<integers> squared list = num,bers.stream(). maps(i-> i*i).
	// collect(Collection)
	// squaredlist.stream().forEach(system.out::println)
	// List<integer> squareslist = numbesr.strream().map(i->
	// i*i).distinct().collect(Collection)
	// THIS IS ALL ON MATTS GITHUB, TAKE A LOOK AT THE WORKED EXAMPLES

}
