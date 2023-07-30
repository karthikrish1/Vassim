package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	@Test(priority=0,groups="R")
	public void e1u()
	{
		System.out.println("username");
	}
	
	@Test(priority=1,groups="R")
	public void e1p()
	{
		System.out.println("password");
	}
	
	@Test(priority=2,groups="R")
	public void e1lg()
	{
		System.out.println("login");
	}
	
	@Test(priority=3,dependsOnGroups="R")
	public void e1home()
	{
		System.out.println("home");
	}
	
	
	//Group: R : all pass     ;   home: run
	// even 1 ingroupp fail   ;   home; skip

}
