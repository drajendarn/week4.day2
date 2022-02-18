package week4.day2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass5ActionsSelectable {

public static void main(String[] args) {
	

WebDriverManager.chromedriver().setup(); 
ChromeDriver driver = new ChromeDriver(); 
driver.manage().window().maximize();  
driver.get("https://jqueryui.com/selectable/"); 
WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(frame);
Actions builder=new Actions(driver);
WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item5).keyUp(Keys.CONTROL).perform();
System.out.println("Selection done");
}
}

