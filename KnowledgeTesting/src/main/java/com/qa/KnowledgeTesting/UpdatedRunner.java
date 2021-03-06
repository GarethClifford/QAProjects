package com.qa.KnowledgeTesting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpdatedRunner {

	static List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

	public static void main(String[] args) {
		// firstTask();
		// secondTask();
		// thirdTask();
		// forthTask();
		// fifthTask();
		// sixthTask();
		// seventhTask();
		// eighthTask();

	}

	public static void firstTask() {
		numbers.stream().forEach(System.out::println);
	}

	public static void secondTask() {
		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}

	public static void thirdTask() {
		numbers.stream().map(i -> i * 10).forEach(System.out::println);
	}

	public static void forthTask() {
		System.out.println(numbers.stream().max(Integer::compare).get());
	}

	public static void fifthTask() {
		System.out.println(numbers.stream().min(Integer::compare).get());
	}

	public static void sixthTask() {
		numbers.stream().map(i -> i * i).collect(Collectors.toList()).forEach(System.out::println);
	}

	public static void seventhTask() {
		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
	}

	public static void eighthTask() {
		List<Integer> squares = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(squares.stream().distinct().collect(Collectors.toList()));
	}
}
