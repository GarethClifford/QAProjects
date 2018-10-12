package com.qa.InfiniteTerrainSystem;

import java.util.Random;

public class Participant {
	Random position = new Random();
	private double Xdirection = 0;
	private double Ydirection = 0;

	public double getXdirection() {
		return Xdirection;
	}

	public void setXdirection(double xdirection) {
		Xdirection = xdirection;
	}

	public double getYdirection() {
		return Ydirection;
	}

	public void setYdirection(double ydirection) {
		Ydirection = ydirection;
	}

}
