package gui.model;

public class Duck
{
	private String name;

	public Duck()
	{
		//default constructor
	}
	
	public Duck(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		String description = "I am a duck";
		return description;
	}
	
	
}
