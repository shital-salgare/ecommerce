package ecommercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  Ajio {
  @Test
  public void ajio() throws InterruptedException 
  {
	   WebDriver d=new ChromeDriver();
	   d.get( "https://www.ajio.com/");
	   System.out.println("Ajio test successfully run");
	   Thread.sleep(2000);
	   d.close();
  }
}
