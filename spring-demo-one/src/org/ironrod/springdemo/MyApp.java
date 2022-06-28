package org.ironrod.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new SoccerCoach();
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
