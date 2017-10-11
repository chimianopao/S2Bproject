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

public class testesChat {

	
	
	@Test
	public void testeNomeEmBranco() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.girafa.com.br");
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		WebElement input = driver.findElement(By.name("Username"));
		input.submit();
		Thread.sleep(300);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-popup-window\"]/div/div[2]/div/ul/li[1]"));
		assertTrue(element.getText().contains("Por favor, digite seu nome"));
		
		driver.quit();
	}
	
	@Test
	public void testeEmailEmBranco() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.girafa.com.br");
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		WebElement input = driver.findElement(By.name("Username"));
		input.sendKeys("joao");
		input = driver.findElement(By.name("Email"));
		input.submit();
		Thread.sleep(300);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-popup-window\"]/div/div[2]/div/ul/li[1]"));
		assertTrue(element.getText().contains("Por favor insira um endere�o de email v�lido"));
		driver.quit();
		
	}
	
	@Test
	public void testeAssuntoEmBranco() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.girafa.com.br");
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		WebElement input = driver.findElement(By.name("Username"));
		input.sendKeys("joao");
		input = driver.findElement(By.name("Email"));
		input.sendKeys("q@ig.com.br");
		
	//	input = driver.findElement(By.name("value_items_admin[0]"));
	//	input.sendKeys("Quero Comprar");
		
		input = driver.findElement(By.name("StartChatAction"));
		input.click();
		Thread.sleep(300);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-popup-window\"]/div/div[2]/div/ul/li"));
		assertTrue(element.getText().contains("Assunto: � exigido"));
		//driver.quit();
	
	
	
	}
	
	}

	
