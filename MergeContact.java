package week4.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

public static void main(String[] args) throws InterruptedException {
	

WebDriverManager.chromedriver().setup(); 
ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
driver.manage().window().maximize(); // Maximize the opened chrome browser window 
driver.get("http://leaftaps.com/opentaps/control/login"); // Loads the URL in the opened browser 
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.partialLinkText("Contacts")).click();		
driver.findElement(By.partialLinkText("Merge Contacts")).click();
driver.findElement(By.xpath("//a[@href=\"javascript:call_fieldlookup2autocomplete(document.getElementById('ComboBox_partyIdFrom'),document.getElementById('partyIdFrom'),'LookupContacts');\"]")).click();
Set<String> windowHandles = driver.getWindowHandles();
List<String> list=new ArrayList<>(windowHandles);
String firWin=list.get(0);
String secWin=list.get(1);
driver.switchTo().window(secWin);
Thread.sleep(2000);
//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']']")).click();
driver.findElement(By.xpath("//table[contains(@class,'x-grid3-row-table')]/tbody/tr[1]/td/div/a")).click();
//driver.close();
driver.switchTo().window(firWin);
driver.findElement(By.xpath("//a[@href=\"javascript:call_fieldlookup2autocomplete(document.getElementById('ComboBox_partyIdTo'),document.getElementById('partyIdTo'),'LookupContacts');\"]")).click();
Set<String> windowHandles1 = driver.getWindowHandles();
List<String> list1=new ArrayList<>(windowHandles1);
String firWin1=list1.get(0);
String secWin1=list1.get(1);
driver.switchTo().window(secWin1);
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[2]")).click();
driver.switchTo().window(firWin1);
driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
Thread.sleep(2000);
Alert alert = driver.switchTo().alert();
alert.getText();
alert.accept();
String title2 = driver.getTitle();
System.out.println(title2);

}
}

