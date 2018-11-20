package gui.view;

import javax.swing.JFrame;

//extends - this class can do everything JFrame can view
public class FirstFrame extends JFrame
{
	
	public FirstFrame()
	{
		//super because the class inherits from another class 
		//rule for extends: super has to be the first line in the constructor
		super();
		
		
		setupFrame();
		
		
		
	}
	
	private void setupFrame()
	{
		this.setSize(4200, 4200);
		this.setTitle("MY FIRST GUI");
		this.setResizable(true);
		//line has to be setVisible(true), if not the app will shut down
		this.setVisible(true);
	}

}
