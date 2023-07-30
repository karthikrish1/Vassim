package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class sw {
/* explicit wait: particular conditions
	 * 
	 *  create an object for webdriver wait class
	 *  padss driver instance and time limit as input
	 *  call untill method
	 *  call expected conditions 
	 ** cod is correct: if it exeuctes withi time limt, then it proceeds further
	 * code is wring: it will wait for the completion of time limit, then it willthrow up error
	 * */
	@Test
	public void hd()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver ob = new ChromeDriver();
	ob.get("http://www.google.com");
	WebDriverWait w= new WebDriverWait(ob,4);
	//title
	//w.until(ExpectedConditions.titleIs("tzbce"));//4
	//w.until(ExpectedConditions.titleContains("oo"));//4
	
	//w.until(ExpectedConditions.alertIsPresent());//4
	
	//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
	
	//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
	
	w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
	
	
	ob.quit();
}
}