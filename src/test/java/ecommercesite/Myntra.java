package ecommercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  Myntra {
  @Test
  public void secondTest() throws InterruptedException  
  
  {
	  WebDriver d=new ChromeDriver();
	  d.get( "https://www.myntra.com/");
	  System.out.println("Myntra test successfully run");
	  Thread.sleep( 2000);
	  d.close();
	  
  }
}
