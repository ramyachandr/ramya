package ms1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class s1 {
	@Test(groups="One")
	public void s3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOVE\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
	    ob.get("https://mycontactform.com");
	    
	    WebElement pow = ob.findElementByName("btnSubmit");
	    Actions a=new Actions(ob);
	    a.clickAndHold(pow).click().build().perform();
	    Thread.sleep(2000);
	    a.release().build().perform();
	    ob.quit();
	    
		
	}

}
