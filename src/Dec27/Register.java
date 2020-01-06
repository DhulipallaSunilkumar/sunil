package Dec27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Register {


public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("sunil");
		//Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("dhulipalla");
		//Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("9703074761");
		//Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("dhulipallasunil1997@gmail.com");
		//Thread.sleep(3000);
		driver.findElement(By.name("address1")).sendKeys("ammerpet");
		//Thread.sleep(3000);
		driver.findElement(By.name("city")).sendKeys("ammerpet"); 	 	 	
		driver.findElement(By.name("state")).sendKeys("telagana");
		driver.findElement(By.name("postalCode")).sendKeys("500055");
		driver.findElement(By.name("country")).sendKeys("india");
		driver.findElement(By.name("email")).sendKeys("dhulipallasunil1997@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sunil@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("sunil@123");
		driver.findElement(By.name("register")).click();
		Thread.sleep(4000);
		driver.quit();
		

	}

}
