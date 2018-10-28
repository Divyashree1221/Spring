package spring.demo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		// 1- configure spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2- get beans
		Coach theCoash = context.getBean("cricketCoach", Coach.class);
		// 3- call the method
		System.out.println("getDailyWorkout----->>> " + theCoash.getDailyWorkout());
		
		System.out.println("getDailyFortune----->>> " + theCoash.getDailyFortune());
		// 4- close the context
		context.close();

	}

}
