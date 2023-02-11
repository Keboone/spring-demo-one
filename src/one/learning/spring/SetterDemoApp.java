package one.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp 
{
	public static void main(String[] args) 
	{
		
		// load the spring configuration file
		// retrieve (odzyskać, wyszukać informacje) bean from the spring container
		// call methods on the bean
		// close the context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyForutne());
		
		// call new methods	to get literal values (dosłowne wartości) 
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		
		context.close();
		
		
	}
}