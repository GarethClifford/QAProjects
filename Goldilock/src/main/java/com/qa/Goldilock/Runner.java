package com.qa.Goldilock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class Runner {
	public static void main(String[] args) {

		int Number = 1;
		List<Chair> Table = new ArrayList<Chair>();

		Goldilocks goldy = new Goldilocks(100, 120);

		Table.add(new Chair(297, 90, 54));
		Table.add(new Chair(66, 110, 78));
		Table.add(new Chair(257, 113, 98));
		Table.add(new Chair(276, 191, 12));
		Table.add(new Chair(280, 129, 22));
		Table.add(new Chair(219, 163, 12));
		Table.add(new Chair(254, 193, 45));
		Table.add(new Chair(86, 153, 65));
		Table.add(new Chair(206, 107, 71));
		Table.add(new Chair(71, 137, 87));
		Table.add(new Chair(94, 40, 98));
		Table.add(new Chair(238, 127, 45));
		Table.add(new Chair(52, 146, 98));
		Table.add(new Chair(129, 197, 10));
		Table.add(new Chair(144, 59, 100));
		Table.add(new Chair(157, 124, 12));
		Table.add(new Chair(210, 59, 54));
		Table.add(new Chair(110, 54, 98));
		Table.add(new Chair(268, 119, 87));
		Table.add(new Chair(261, 121, 32));
		Table.add(new Chair(12, 189, 65));
		Table.add(new Chair(186, 108, 97));
		Table.add(new Chair(174, 21, 64));
		Table.add(new Chair(112, 18, 31));
		Table.add(new Chair(54, 90, 54));
		Table.add(new Chair(174, 52, 65));
		Table.add(new Chair(16, 129, 87));

		System.out.println(Table.stream().filter(s -> goldy.canSit(s)).collect(Collectors.toList()));

	}

}
