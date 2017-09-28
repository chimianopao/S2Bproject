package simple;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String site = "http://www.girafa.com.br/";
		driver.navigate().to(site);
		String title = driver.getTitle();
		assertTrue(title.startsWith("girafa"));
		
		WebElement input = driver.findElement(By.name("buscaprodutoform"));
		input.sendKeys("playstation");
		input.submit();
		//Thread.sleep(500);
		WebElement output = driver.findElement(By.id("aswer"));
		String result = output.getText();
		assertTrue(result.contains("2knots"));
		//Thread.sleep(500);
		driver.quit();
		
		
		
		
		
		
		
	}

}
