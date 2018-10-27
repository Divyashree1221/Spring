package com.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		
		// Coach theCoach = new BaseballCoach();
		/*Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());	*/

		//configure  spring container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get beans 
		  Coach theCoash=context.getBean("myCoash",Coach.class);
		// Coach theCoash=(Coach) context.getBean("myCoash");
		// Test  theCoash=(Test) context.getBean("myCoash");
		 // Test theCoash=context.getBean("myCoash",Coach.class);
		//call the method
		System.out.println("getDailyFortune----->>>"+theCoash.getDailyFortune());
		System.out.println("getDailyWorkout----->>>"+theCoash.getDailyWorkout());
		
		//close the context 
		context.close();
		
	}

}
