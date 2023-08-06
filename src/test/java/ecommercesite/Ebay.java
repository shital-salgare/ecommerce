package ecommercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  Ebay {
  @Test
  public void ebay() throws InterruptedException 
  {
	  WebDriver d=new ChromeDriver();
	  d.get( "https://www.ebayglobalshipping.com/");
	  System.out.println("ebay is successfully run");
	 
	  Thread.sleep(2000);
	  d.close();
  }
}
