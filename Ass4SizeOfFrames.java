package week4.day2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass4SizeOfFrames {

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup(); 
	ChromeDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 
	driver.get("http://leafground.com/pages/frame.html"); 
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println("total no of Frames are : " + size);
}
}
