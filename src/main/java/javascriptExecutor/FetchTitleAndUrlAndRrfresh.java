package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleAndUrlAndRrfresh  {
   
	@SuppressWarnings("unused")
	public static vpid main(string[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return null; 
    
	JavascriptExecutor js1 =(JavascriptExecutor)driver;
	js1.executeScript("window,location=arguments[0]","httos;//www.amazon.com/");
	
	Thread.sleep(3000);
	
	}
}

	
