package com.advnet.springdemo;

public class KarateCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("setting an email address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("setting a team");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice kata " + getEmailAddress()+" "+getTeam();
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
