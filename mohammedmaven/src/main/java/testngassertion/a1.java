package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testnglis.lo.class)
public class a1 {
/*
 * assertion: technique where we will be comparing actual result with obtained result
 * 
 * hard
 *    provided by Assert builtin class
 *    static in nature
 *    assertion fail=> it will fail the test case 
 *    
 * soft 
 *    provided by softassert builtin class
 *    nonstatic in nature
 *    even if assertion fail=> it will prcd further 
 * 
 * asssertEquals(actual, expected)
 * assertNotEquals(actual. expected)
 * assertTrue(condition)
 * assertFalse(condition)
 * 
 * */
	
	@Test
	public void hd()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver ob = new ChromeDriver();
	ob.get("http://www.google.com");
	//Assert.assertEquals(ob.getTitle(), "G,nknoogle");
	Assert.assertNotEquals(ob.getTitle(), "G,nknoogle");
	WebElement ele = ob.findElementByLinkText("Gmail");
	Assert.assertTrue(ele.isDisplayed());
	Assert.assertFalse(ele.isSelected());
	ob.quit();
	}
}
