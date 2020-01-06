package Sunil2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https:/facebook.com");
	driver.manage().window().maximize();
	Select monthlistbox= new Select(driver.findElement(By.name("birthday_month")));
	Select yearlistbox= new Select(driver.findElement(By.id("year")));
	boolean value1=monthlistbox.isMultiple();
	System.out.println(value1);
	boolean value2=yearlistbox.isMultiple();
	System.out.println(value2);
	//select item from month list box
	monthlistbox.selectByVisibleText("Aug");
	System.out.println(monthlistbox.getFirstSelectedOption().getText());
	Thread.sleep(5000);
	//select item from year list box
		yearlistbox.selectByVisibleText("1997");
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.close();
	


	}

}
