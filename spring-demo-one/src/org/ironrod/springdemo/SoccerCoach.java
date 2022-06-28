package org.ironrod.springdemo;

public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Juggle for 5 min every day";
	}

	@Override
	public String getDailyFortune() {
		return "Clowns are people too";
	}

}
