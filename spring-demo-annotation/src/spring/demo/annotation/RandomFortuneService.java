package spring.demo.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
      private String [] data= {"randomeDailyFortune1","randomeDailyFortune2","randomeDailyFortune3"};
      private Random myRandom=new Random();
	@Override
	public String getDailyFortune() {
		
		return data[myRandom.nextInt(data.length)];
	}

}
