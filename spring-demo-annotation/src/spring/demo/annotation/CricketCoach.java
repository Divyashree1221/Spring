package spring.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("cricketCoach")

@Component
public class CricketCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CricketCoach::Inside constructor of CricketCoach");
	}

	/*
	 * // 1/ Independence injection using constructor
	 * 
	 * @Autowired public CricketCoach(FortuneService fortuneService) {
	 * this.fortuneService=fortuneService; }
	 */
	/*
	 * // 2/ Independence injection using setter method
	 * 
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("CricketCoach:: inside setter method ");
	 * this.fortuneService = fortuneService; }
	 */
	/*
	 * // 3/ Independence injection using any method
	 * 
	 * @Autowired public void myCutomMethod(FortuneService fortuneService) {
	 * System.out.println("CricketCoach:: inside myCutomMethod method ");
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {

		return "your daily workout 8 hours per day";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getDailyFortune();
	}

}
