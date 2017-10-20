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

public class testesFrete {

	@Test
	public void testeFreteValido() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		String title = driver.getTitle();
		assertTrue(title.startsWith("Eletrônicos, Eletrodomésticos, Smartphone | Girafa"));
		WebElement input = driver.findElement(By.xpath("//*[@id=\"buscaprodutoform3\"]//*[@id=\"q\"]"));
		input.sendKeys("celular");
		input.submit();
		driver.findElement(By.xpath("//*[@id=\"results\"]/div[2]/div/div[3]/a[2]")).click();
		driver.findElement(By.id("calculoFrete")).click();
		input = driver.findElement(By.id("postalCodeID1"));
		input.sendKeys("91130020");
		input.submit();
		Thread.sleep(900);
		WebElement element = driver.findElement(By.id("respostaFrete"));
		String frete = element.getText();
		assertTrue(frete.startsWith("Frete comum"));
		driver.quit();
		
	}
	
	
	@Test
	public void testeFreteInvalido() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		WebElement input = driver.findElement(By.xpath("//*[@id=\"buscaprodutoform3\"]//*[@id=\"q\"]"));
		input.sendKeys("celular");
		input.submit();
		driver.findElement(By.xpath("//*[@id=\"results\"]/div[2]/div/div[3]/a[2]")).click();
		driver.findElement(By.id("calculoFrete")).click();
		input = driver.findElement(By.id("postalCodeID1"));
		input.sendKeys("12345678"); //CEP que não existe
		input.submit();
		Thread.sleep(900);
		WebElement element = driver.findElement(By.id("respostaFrete"));
		String frete = element.getText();
		assertFalse(frete.startsWith("Frete comum"));

		driver.quit();
		
	}
	
	
	}

	

