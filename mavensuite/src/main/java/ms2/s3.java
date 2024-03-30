package ms2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class s3 {
	
	@Test(groups="Two")
	public void s1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOVE\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
	    ob.get("http://www.google.com");
	    
	    System.out.println(ob.executeScript("return document.title"));
		
	    System.out.println(ob.executeScript("return document.URL"));
	    
	    Thread.sleep(2000);
	    
	    ob.quit();	
		
	}

}
