package com.qa.Goldilock;

public class Chair {
	private int capacity;
	private int temp;
	private int N;
	private static int M = 1;
	private int lum;

	public Chair(int capacity, int temp, int lum) {
		this.setCapacity(capacity);
		this.setTemp(temp);
		this.N = M;
		this.setLum(lum);
		M += 1;
	}

	@Override
	public String toString() {
		return Integer.toString(N);
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getLum() {
		return lum;
	}

	public void setLum(int lum) {
		this.lum = lum;
	}

}
