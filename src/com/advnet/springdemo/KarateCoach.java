package com.advnet.springdemo;

public class KarateCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice kata";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
