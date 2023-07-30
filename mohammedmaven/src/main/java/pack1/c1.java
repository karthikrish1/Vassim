package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.facebook.com");
	    File f = ob.getScreenshotAs(OutputType.FILE);
	    //copy=paste=> fileUtils=> apache directory studio commn io
	    FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\mohammedmaven\\src\\main\\java\\pack1\\k.png"));
	}

}
