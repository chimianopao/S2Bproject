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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
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
		//String title = driver.getTitle();
		//assertTrue(title.startsWith("Smartphone Samsung Galaxy J5 Prime Dourado Dual Chip 32GB Tela 5\" 4G Câmera 13MP Quad Core 1.4 GHz - Compre Online | Girafa"));
		driver.findElement(By.id("calculoFrete")).click();
		input = driver.findElement(By.id("postalCodeID1"));
		input.sendKeys("91130020");
		input.submit();
		//*[@id="results"]/div[2]/div/div[4]/h5[1]/a
	//	WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/section/div[1]/div/div[4]/div[5]/a[1]/span"));
	//	element.click();

		//driver.quit();
		
	}
	
	
	
	public void testeFreteInvalido() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.girafa.com.br/Telefonia/samsung/smartphone-samsung-galaxy-j5-prime-dourado-dual-chip-32gb-tela-5-4g-camera-13mp-quad-core-1-4-ghz.htm");
		//String title = driver.getTitle();
		//assertTrue(title.startsWith("Smartphone Samsung Galaxy J5 Prime Dourado Dual Chip 32GB Tela 5\" 4G Câmera 13MP Quad Core 1.4 GHz - Compre Online | Girafa"));
		driver.findElement(By.id("calculoFrete")).click();
		WebElement input = driver.findElement(By.id("postalCodeID1"));
		input.sendKeys("00000000");
		input.submit();
		
	//	WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/section/div[1]/div/div[4]/div[5]/a[1]/span"));
	//	element.click();

		//driver.quit();
		
	}
	
	
	
	
	
	
	
	
	}

	

