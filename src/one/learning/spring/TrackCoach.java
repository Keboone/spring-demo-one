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

	// add init method
	
	public void doMyStartUpStuff()
	{
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	// add destroy method
	
	public void doMyCleanUpStuff()
	{
		System.out.println("TrackCoach: instide method doMyCleanUpStuff");
	}
	
}
