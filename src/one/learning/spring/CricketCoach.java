package one.learning.spring;

public class CricketCoach implements Coach 
{
	private FortuneService fortuneService;
	
	
	private String emailAddress;
	private String team;
	
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
	
	
	public void setEmailAddress(String emailAddress)
	{
		System.out.println("we are in setter method for CricketCoach - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) 
	{
		System.out.println("we are in setter method for CricketCoach - setTeam");
		this.team = team;
	}
	
	public String getEmailAddress() 
	{
		return emailAddress;
	}

	public String getTeam() 
	{
		return team;
	}
	
	
	
	@Override
	public String getDailyWorkout() 
	{
		return "Cricket practise for 2h";
	}

	@Override
	public String getDailyForutne()
	{
		return fortuneService.getFortune();
	}


}
