package com.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeBeanApp {

	public static void main(String[] args) {
		
		       //1- load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("application-Scope-Context.xml");
				
				
						
				//2- retrieve bean from spring container
				Coach theCoach = context.getBean("myCoash", TrackCoach.class);
				Coach theCoach2 = context.getBean("myCoash", TrackCoach.class);
				
				
				

				//3- let's call our new method for fortunes
				System.out.println("the object 1 -->>"+theCoach);
				System.out.println("the object 2 -->>"+theCoach2);
				
				
				//4- call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				
				//5- close the context
				context.close();
				
				

	}

}
