package mytest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testexample {

	public static void main(String[] args) {
		WebDriver driver;

	      driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
	      driver.findElement(By.name("search")).sendKeys("mac");
	      driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	      List<WebElement> products= driver.findElements(By.xpath("//h4//a")); 
	       for(WebElement product:products)
	        {
	    	if(product.getText().equalsIgnoreCase("MacBook Air"))
	    	{
	    	product.click();
	    	break;
	    	}
	    	WebElement quantity= driver.findElement(By.name("quantity"));
	    	quantity.clear();
	    	quantity.sendKeys("2");
	    	driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	    	driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed();
	    	////div[@class='table-responsive']/table/tbody/tr/td[2]
       
	 	 
	}   

	}
}
