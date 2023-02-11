package one.learning.spring;

public class BaseBallCoach implements Coach
{
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 min on batting practice";
	}



	@Override
	public String getDailyForutne() 
	{
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	
	
}
