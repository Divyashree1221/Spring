package com.springdemo.one;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(HappyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

           //Constructor injection 
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}

	public void doStartup() {

		System.out.println("the start method after bean initialized");
	}

	public void doCleanup() {

		System.out.println("the final method after bean destroied");
	}

}
