package ms1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class s2 {
	
	@Test(groups="One")
	public void s1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOVE\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
	    ob.get("http://www.google.com");
	    Thread.sleep(2000);
	    ob.findElementByLinkText("Images").click();
	    File f = ob.getScreenshotAs(OutputType.FILE);
	    //file utils = apche directory studio commn io
	    FileUtils.copyFile(f,new File("C:\\Users\\LOVE\\Desktop\\mavensuite\\src\\main\\java\\ms1\\a.png"));
	    Thread.sleep(2000);
	    ob.navigate().back();
	    Thread.sleep(2000);
	    ob.navigate().forward();
	    Thread.sleep(2000);
	    ob.quit();
		
	}

}
