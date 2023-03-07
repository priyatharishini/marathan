package marathanChallenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShowApplication {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
driver.get("https://in.bookmyshow.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
String title = driver.getTitle();
System.out.println(title);
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("pathaan");
driver.findElement(By.xpath("//span[@class='sc-jhaWeW ChCae']")).click();
driver.findElement(By.xpath("//div[@class='styles__CtaText-sc-1vmod7e-2 bBLrVT']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='2D']")).click();
WebElement text1 = driver.findElement(By.className("__venue-name"));
String text2 = text1.getText();
System.out.println(text2);
driver.findElement(By.xpath("//div[text()='INFO']")).click();
 String text = driver.findElement(By.xpath("//div[contains(text(),'Parking Facility')]")).getText();
if(text.contains("Parking"))
{
	System.out.println("parking facility avaiable");
}
else
{
	System.out.println("parking facility not avaiable");
}
driver.findElement(By.xpath("//div[@class='cross-container']")).click();
driver.findElement(By.xpath("(//div[@class='__text'])[3]")).click();	
driver.findElement(By.id("btnPopupAccept")).click();
driver.findElement(By.xpath("//li[text()='1']")).click();
driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
driver.findElement(By.xpath("(//a[@class='_available'])[1]")).click();
driver.findElement(By.xpath("//span[@id='btnSTotal_reserve']")).click();
Thread.sleep(5000);
 String text3 = driver.findElement(By.className("_total-section")).getText();
 System.out.println("the sub total" +text3);
	}

}
