package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class r1 {
	/*
	 * 
	 * implciit wait: once it s declared all the code which is present after it will take the time limit
	 * 
	 * cod is correct: if it exeuctes withi time limt, then it proceeds further
	 * code is wring: it will wait for the completion of time limit, then it willthrow up error
	 * 
	 * 
	 * */

	
	
	
	@Test
	public void hd()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver ob = new ChromeDriver();
	ob.get("http://www.google.com");
	ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println(ob.getTitle());//5
	System.out.println(ob.getCurrentUrl());//5
	ob.navigate().refresh();//5
	ob.findElementByLinkText("Imagmbmes"); //5
	ob.quit();//5
	

}}
