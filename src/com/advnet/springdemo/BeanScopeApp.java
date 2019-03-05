package com.advnet.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean theSame = theCoach == alphaCoach;
		
		System.out.println("The beans are the same: "+theSame);
		
		System.out.println("theCoach memory address: "+theCoach);
		System.out.println("alphaCoach memory address: "+alphaCoach);
		
		context.close();
	}

}
