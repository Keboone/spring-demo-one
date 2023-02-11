package one.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp 
{
	public static void main(String[] args) 
	{
		
		// load the spring configuration file
		// retrieve bean from the spring container
		// call methods on the bean
		// close the context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyForutne());
		
		context.close();
		
		
	}
}