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

public class Ass5ActionsSortable {

public static void main(String[] args) {
	

WebDriverManager.chromedriver().setup(); 
ChromeDriver driver = new ChromeDriver(); 
driver.manage().window().maximize();  
driver.get("https://jqueryui.com/sortable/"); 
WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(frame);
Actions builder=new Actions(driver);
WebElement item1 = driver.findElement(By.xpath("(//span[(@class='ui-icon ui-icon-arrowthick-2-n-s')])[1]"));
WebElement item2 = driver.findElement(By.xpath("(//span[(@class='ui-icon ui-icon-arrowthick-2-n-s')])[2]"));
WebElement item3 = driver.findElement(By.xpath("(//span[(@class='ui-icon ui-icon-arrowthick-2-n-s')])[3]"));
WebElement item4 = driver.findElement(By.xpath("(//span[(@class='ui-icon ui-icon-arrowthick-2-n-s')])[4]"));
WebElement item5 = driver.findElement(By.xpath("(//span[(@class='ui-icon ui-icon-arrowthick-2-n-s')])[5]"));
WebElement item6 = driver.findElement(By.xpath("(//span[(@class='ui-icon ui-icon-arrowthick-2-n-s')])[6]"));
builder.dragAndDrop(item2,item1).dragAndDrop(item6,item4).dragAndDrop(item5,item3).perform();
System.out.println("Sorting is  done");
}
}

