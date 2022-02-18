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

public class Ass5ActionsDraggable {

public static void main(String[] args) {
	

WebDriverManager.chromedriver().setup(); 
ChromeDriver driver = new ChromeDriver(); 
driver.manage().window().maximize();  
driver.get("https://jqueryui.com/draggable/"); 
WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(frame);
Actions builder=new Actions(driver);
WebElement element = driver.findElement(By.id("draggable"));
builder.dragAndDropBy(element, 100,100).perform();
driver.close();


}
}

