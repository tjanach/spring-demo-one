package com.advnet.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	/* (non-Javadoc)
	 * @see com.advnet.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//	init method
	public void doStartUpStuff() {
		System.out.println("StartUp method in BaseballCoach");
	}
	
	//	destroy method
	public void doCleanUpStuff() {
		System.out.println("CleanUp method in BaseballCoach");
	}

}
