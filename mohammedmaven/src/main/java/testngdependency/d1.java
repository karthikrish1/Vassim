package testngdependency;

import org.testng.annotations.Test;

public class d1 {
	
	//dependsOnMethods: create connection between test cases
	
	@Test(priority=0)
	public void vis()
	{
		System.out.println("visiting");
	}
	
	@Test(priority=1,dependsOnMethods="vis")
	public void lg()
	{
		System.out.println("login");
	}
	
	// vis: pass     lg: run
	//vis: fail      lg: skipped

}
