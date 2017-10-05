package simple;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example1 {
/*
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		String title = driver.getTitle();
		assertTrue(title.startsWith("Eletrônicos, Eletrodomésticos, Smartphone | Girafa"));
		WebElement input = driver.findElement(By.xpath("//*[@id=\"buscaprodutoform3\"]//*[@id=\"q\"]"));
		input.sendKeys("celular");
		input.submit();
		
		driver.findElement(By.xpath("//a[@href='/Telefonia/samsung/smartphone-samsung-galaxy-j5-prime-dourado-dual-chip-32gb-tela-5-4g-camera-13mp-quad-core-1-4-ghz.htm']")).click();
		driver.findElement(By.id("calculoFrete")).click();
		input = driver.findElement(By.id("postalCodeID1"));
		input.sendKeys("91130020");
		input.submit();
		
	//	WebElement element = driver.findElement(By.xpath("//*[@class=\"produto\"]//*[@class=\"add-to-cart\"]")).click();

		driver.quit();
		
	}
	
	//*[@id="user-popup-window"]/div/div[2]/div/ul/li[1]
	
	
	*/
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		WebElement input = driver.findElement(By.name("Username"));
		input.submit();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-popup-window\"]/div/div[2]/div/ul/li[1]"));
		assertTrue(element.getText().contains("Por favor, digite seu nome"));
		
	}

}
