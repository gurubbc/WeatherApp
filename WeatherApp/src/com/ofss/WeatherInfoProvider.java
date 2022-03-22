package com.ofss;

// Model is here
public class WeatherInfoProvider {

	public static String findTemperature(String cityname)
	{
		System.out.println("findTemperature method is called"); // debug code
		if (cityname.equals("Bangalore"))
			return "The weather is 25"; // response  for Bangalore
		else if (cityname.equals("Mumbai"))
			return "The weather is 30"; // response for Mumbai
		else 
			return "I don't have the value for the entered city - INVALID CITY NAME";
	}
}
