package ecommercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  Flipkart {
  @Test
  public void flipkart() throws InterruptedException 
  {
	  WebDriver d=new ChromeDriver();
	  d.get( "https://www.flipkart.com/");
	  System.out.println("flipkart successfully run");
	  Thread.sleep(2000);
	  d.close();
  }
}
