package one.learning.spring;

public class TrackCoach implements Coach 
{
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "Run a hard 5km";
	}

	@Override
	public String getDailyForutne() 
	{
		return fortuneService.getFortune();
	}

}
