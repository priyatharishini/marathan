package marathanChallenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusApplication {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("src")).sendKeys("chennai");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.id("dest")).sendKeys("bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//td[text()='26']")).click();
		driver.findElement(By.id("search_btn")).click();
	WebElement buslist = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
	String text = buslist.getText();
	System.out.println( "the Number of buses "+text);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
	WebElement sleeper = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
	String text2 = sleeper.getText();
	System.out.println("the number of sleeper bus"+text2);
	System.out.println("the title is "+driver.getTitle());
	}

}
