package spring.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class HelloFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "today is your lucky day";
	}

}
