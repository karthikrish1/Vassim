package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {
	
	@Test
	public void hd()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver ob = new ChromeDriver();
	ob.get("http://www.google.com");
	SoftAssert s= new SoftAssert();
	s.assertEquals(ob.getTitle(), "G,nknoogle");
	s.assertNotEquals(ob.getTitle(), "G,nknoogle");
	WebElement ele = ob.findElementByLinkText("Gmail");
	s.assertTrue(ele.isDisplayed());
	s.assertFalse(ele.isSelected());
	ob.quit();
	s.assertAll();
	}

}
