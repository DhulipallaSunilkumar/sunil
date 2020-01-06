package Sunil5;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nakura {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		String title1=driver.switchTo().window(brw.get(2)).getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		String title2=driver.switchTo().window(brw.get(0)).getTitle();
		System.out.println(title2);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("text")).sendKeys("xxyzil");
		driver.findElement(By.name("email")).sendKeys("jhone@gmail.com");
		driver.findElement(By.name("password")).sendKeys("asgil@gi");
		driver.findElement(By.name("number")).sendKeys("9876543210");
		driver.findElement(By.name("uploadCV")).click();
		driver.close();
		

		
		
		
			
		
		

	}

}
