package one.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp 
{
	
	
	public static void main(String[] args)
	{
		// create a spring container
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive (odbierz) bean from spring container
//		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// create the object
//		Coach theCoach = new BaseBallCoach();
		
//		Coach trackCoach = new TrackCoach();
		
		Coach theCoach = new CricketCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(trackCoach.getDailyWorkout());
	}

	
	
	
}
