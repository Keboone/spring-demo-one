package one.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp
{

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyForutne());
//		theCoach.doMyStartUpStuff();
//		theCoach.doMyCleanUpStuff(); // te dwie metody wykonują się automatycznie
		
		
		context.close();
		
		
	}

}
