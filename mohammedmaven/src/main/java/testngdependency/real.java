package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {
	ChromeDriver ob;
	@Test(priority=0,description="Visiting site ",groups="mv")
	public void v2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 ob=new ChromeDriver();
		ob.get("http://www.facebook.com");
	}
	
	@Test(priority=1,description="maximising site ",groups="mv")
	public void mxc()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2,invocationCount=3,description="refreshing site ",groups="mv")
	public void ref()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description="getting title  ",groups="mv")
	public void gettitle()
	{System.out.println("Title is "+ ob.getTitle());}
	
	@Test(priority=4,description="clicking on linktext  ",dependsOnGroups="mv")
	public void clicking()
	{
		ob.findElementByLinkText("Forgotten password?").click();
	}
	
	@Test(priority=5,timeOut=4000,description="closing site ",dependsOnGroups="mv")
	public void closing() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}

}
