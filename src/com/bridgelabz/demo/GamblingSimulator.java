package com.bridgelabz.demo;

import java.util.Random;

public class GamblingSimulator {
	static final int STAKE_PER_DAY = 100;
	static final int BET_PER_DAY = 1;

	public static void winloss() {
		int stake = 1;
		final int WIN = 1;
		Random random = new Random();
		int bet = random.nextInt(2);
		if (bet == WIN) {
			stake++;
		} else {
			stake--;
		}
		System.out.println("stake  = " + stake);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation");
		winloss();

	}

}
