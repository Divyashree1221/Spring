package spring.demo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		// 1- configure spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2- get beans
		//Coach theCoash = context.getBean("cricketCoach", Coach.class);
		CricketCoach theCoash = context.getBean("cricketCoach", CricketCoach.class);
		// 3- call the method
		System.out.println("getDailyWorkout----->>> " + theCoash.getDailyWorkout());
		
		System.out.println("getDailyFortune----->>> " + theCoash.getDailyFortune());
		
		System.out.println("email----->>> " + theCoash.getEmail());
		System.out.println("team----->>> " + theCoash.getTeam());
		// 4- close the context
		context.close();

	}

}
