package one.learning.spring;

public class CricketCoach implements Coach 
{
	private FortuneService fortuneService;
	
	
	
	// create no-args construcor
	public CricketCoach()
	{
		System.out.println("we are in no-args constructor");
	}
	
	// create setter method
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("we are in setter method for CricketCoach - setFortuneSetter");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "Bating practise for 2h";
	}

	@Override
	public String getDailyForutne()
	{
		return fortuneService.getFortune();
	}


}
