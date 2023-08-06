package ecommercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  firsttestest {
  @Test
  public void f() throws InterruptedException 
  
  {
	  WebDriver d=new ChromeDriver();
	  d.get("https://www.meesho.com/");
	  System.out.println("All test case run successfully");
	  Thread.sleep( 2000);
	  d.close();
  }
}
