package one.learning.spring;

public class FootballCoach implements Coach 
{
	// define a private field for the dependency
	private FortuneService fortuneService;
		
	public FootballCoach(){}
	
	
	public FootballCoach(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "Run 5 laps around the pitch";
	}

	@Override
	public String getDailyForutne() 
	{
		return "Just do it: " + fortuneService.getFortune();
	}

}
