package one.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp
{

	public static void main(String[] args) 
	{
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach theCoach2 = context.getBean("myCricketCoach", Coach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call new method for fortunes
		System.out.println(theCoach.getDailyForutne());
		
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyForutne());
		// close the context
		context.close();
		
		
	}

}
