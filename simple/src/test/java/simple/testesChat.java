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
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.girafa.com.br");
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		WebElement input = driver.findElement(By.name("Username"));
		input.submit();
		Thread.sleep(300);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-popup-window\"]/div/div[2]/div/ul/li[1]"));
		assertTrue(element.getText().contains("Por favor, digite seu nome"));
		Thread.sleep(4000);
		driver.quit();
	}
	
	@Test
	public void testeEmailEmBranco() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.girafa.com.br");
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		WebElement input = driver.findElement(By.name("Username"));
		input.sendKeys("joao");
		input = driver.findElement(By.name("Email"));
		input.submit();
		Thread.sleep(300);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-popup-window\"]/div/div[2]/div/ul/li[1]"));
		assertTrue(element.getText().contains("Por favor insira um endereço de email válido"));
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	@Test
	public void testeAssuntoEmBranco() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.girafa.com.br");
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		WebElement input = driver.findElement(By.name("Username"));
		input.sendKeys("joao");
		input = driver.findElement(By.name("Email"));
		input.sendKeys("q@ig.com.br");
		input = driver.findElement(By.name("StartChatAction"));
		input.click();
		Thread.sleep(300);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-popup-window\"]/div/div[2]/div/ul/li"));
		assertTrue(element.getText().contains("Assunto: é exigido"));
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	public void testeTudoCerto() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.girafa.com.br");
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		WebElement input = driver.findElement(By.name("Username"));
		input.sendKeys("joao");
		input = driver.findElement(By.name("Email"));
		input.sendKeys("q@ig.com.br");
		
		input = driver.findElement(By.name("value_items_admin[0]"));
		input.sendKeys("Quero Comprar");
	//	input = driver.findElement(By.name("Question"));
	//	input.sendKeys("AAAAAAAAAAAAAAAAAAAAAAAAA");
		
		input = driver.findElement(By.name("StartChatAction"));
		input.click();
		Thread.sleep(300);
		WebElement element = driver.findElement(By.id("status-chat"));
		assertTrue(element.getText().contains("Você é o número"));
		
	//	WebElement element = driver.findElement(By.xpath("//*[@id='user-popup-window']/div/div[2]/div/text()"));
	//	assertTrue(element.getText().contains("A sua solicitação foi enviada!"));
		
		driver.quit();
	
	}
	
	
	}

	

