package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 * before test:     run only once before all the test cases started its execution
	 * after test:      run only once after all the test cases finished its execution
	 * 
	 * before class:  run nly once after before test 
	 * after class:   run nly once before after test
	 * 
	 * before method:   run before each test case 
	 * after method:    run after each test case
	 * 
	 * 
	 * before test   : visiting website 
	 *    before class: maximising 
	 *     before methd: refresh   tc1: title   aftermethod  : cookies deletion
	 *     before method: refresh  tc2: click    aftermethod  : cookies deletion
	 *    afterclass: url
	 * after test  : closing 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	ChromeDriver ob;
	@BeforeMethod
	public void btm()
	{
		System.out.println("before method ");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method ");
		ob.manage().deleteAllCookies();
	}
	
	@BeforeClass
	public void btc()
	{
		ob.manage().window().maximize();
		System.out.println("before class " );
	}
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class " + ob.getCurrentUrl());
	}
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case 1  " + ob.getTitle());
	}
	
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 ob=new ChromeDriver();
		ob.get("http://www.google.com");
		
		System.out.println("before test ");
	}
	
	@AfterTest
	public void at() throws InterruptedException
	{
		System.out.println("after test ");
		Thread.sleep(3000);
		ob.quit();
	}
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("tEst case 2");
		ob.findElementByLinkText("Images").click();
	}

}
