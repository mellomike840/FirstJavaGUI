package gui.controller;

import gui.view.FirstFrame;
import gui.model.Duck;

public class GUIController
{
	private Duck herold;
	private FirstFrame appFrame;
	
	public GUIController()
	{
		herold = new Duck();
		//VIew must be initialized after the model 
		appFrame = new FirstFrame();
	
	}
	
	
	public void start()
	{
		
	}
	
	
	
}
