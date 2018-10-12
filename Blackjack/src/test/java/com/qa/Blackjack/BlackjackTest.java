package com.qa.Blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackjackTest {

	@Test
	public void testBlackjack() {

		Runner players = new Runner();

		assertEquals(10, players.playTime(10, 22));

	}

	@Test
	public void testBlackjack2() {

		Runner players = new Runner();

		assertEquals(9, players.playTime(22, 9));

	}

	@Test
	public void testBlackjack3() {

		Runner players = new Runner();

		assertEquals(0, players.playTime(22, 22));

	}

	@Test
	public void testBlackjack4() {

		Runner players = new Runner();

		assertEquals(10, players.playTime(10, 7));

	}

	@Test
	public void testBlackjack5() {

		Runner players = new Runner();

		assertEquals(19, players.playTime(1, 19));

	}
}