package marathanChallenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for men",Keys.ENTER);
Thread.sleep(2000);
	//driver.findElement(By.xpath("(//span[text()=' for men'][1])")).click();
	String text = driver.findElement(By.xpath("//div[@class='sg-col-inner']//div")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("//span[text()='Safari']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='F Gear']")).click();
	driver.findElement(By.xpath("//span[text()='Featured']")).click();
	driver.findElement(By.linkText("Newest Arrivals")).click();
	String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'][1])")).getText();
	System.out.println(text2);
	String text3 = driver.findElement(By.xpath("(//span[@class='a-price-whole'][1])")).getText();
	System.out.println(text3);
	System.out.println(driver.getTitle());
	}
}
