package com.advnet.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private static final String[] fortunes = {"Just Do It!", "Make things done", "Go Go Go"};

	@Override
	public String getFortune() {
		Random r = new Random();
		return fortunes[r.nextInt(3)];
	}

}
