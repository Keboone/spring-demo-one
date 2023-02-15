package one.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp 
{

	public static void main(String[] args)
	{
		// load the spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
			
		// retrieve beans from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same beans (the same space in memory)
		
		boolean result = theCoach == alphaCoach;
		
		// print out the result if they are the same object in memory
		System.out.println("\nCzy to są te same obiekty w pamięci: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// zadanie końcowe z sekcji 6
		
		Coach newCoach = context.getBean("myCoachFootBall", Coach.class);
		
		Coach newAlphaCoach = context.getBean("myCoachFootBall", Coach.class);
		
		boolean result2 = newCoach == newAlphaCoach;
		
		System.out.println("\nCzy to są te same obiekty w pamięci: " + result2);
		
		System.out.println("\nMemory location for newCoach: " + newCoach);
		
		System.out.println("\nMemory location for newAlphaCoach: " + newAlphaCoach);
		
		// close the context
		
		context.close();
		
	}

}
