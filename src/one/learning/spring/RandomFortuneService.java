package one.learning.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService
{
	List listOfFortunes = Arrays.asList("Today is your lucky day!", "Not a lucky day!", "Normal day!");
	
	private Random rand = new Random();
	
	@Override
	public String getFortune()
	{
		int index = rand.nextInt(listOfFortunes.size());
		
		String yourFortune = (String) listOfFortunes.get(index);
		
		return yourFortune;
	}
	
	
}
