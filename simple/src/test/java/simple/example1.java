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
	public void testCompraComFrete() throws InterruptedException {
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
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[7]/section/div[1]/div/div[4]/div[5]/a[1]/span"));
		element.click();

		//driver.quit();
		
	}
	
	*/
	
	
	
	
	
	@Test
	public void testChat() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//teste 1: nome em branco
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		WebElement input = driver.findElement(By.name("Username"));
		input.submit();
		Thread.sleep(300);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"user-popup-window\"]/div/div[2]/div/ul/li[1]"));
		assertTrue(element.getText().contains("Por favor, digite seu nome"));
		
		//teste 2: email em branco
		
		driver.navigate().to(site);
		driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
		input = driver.findElement(By.name("Username"));
		input.sendKeys("joao");
		input = driver.findElement(By.name("Email"));
		input.submit();
		Thread.sleep(300);
		element = driver.findElement(By.xpath("//*[@id=\"user-popup-window\"]/div/div[2]/div/ul/li[1]"));
		assertTrue(element.getText().contains("Por favor insira um endereço de email válido"));
		
		
		
		
	}

	/*
	@Test
	public void testCadastro() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("http://www.geradordecpf.org/");
		WebElement element = driver.findElement(By.id("btn-gerar-cpf"));
		element.click();
		Thread.sleep(5000);
		WebElement output = driver.findElement(By.id("numero"));
		String cpf = output.getText();
	
		
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		element = driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/div[1]/div[2]/div[4]/a")); //clica em login
		element.click();
		
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside[2]/div/div/div[3]/div[2]/div[2]/a")); //clica em cadastro
		element.click();
		
		WebElement input = driver.findElement(By.id("email"));
		input.sendKeys("aaaaaaaaaaaa@aaaaaaaaaa.com");
		input = driver.findElement(By.id("confirmarEmail"));
		input.sendKeys("aaaaaaaaaaaa@aaaaaaaaaa.com");
		input = driver.findElement(By.id("senha"));
		input.sendKeys("12345");
		input = driver.findElement(By.id("confirmarSenha"));
		input.sendKeys("12345");
		input = driver.findElement(By.id("cep"));
		input.sendKeys("91010005");
		input = driver.findElement(By.id("numero"));
		input.sendKeys("1");
		input = driver.findElement(By.id("complemento"));
		input.sendKeys("casa");
		
		input = driver.findElement(By.id("nome"));
		input.sendKeys("Joao");
		input = driver.findElement(By.id("data"));
		input.sendKeys("10051980");
		input = driver.findElement(By.id("genero"));
		input.sendKeys("M");
		input = driver.findElement(By.id("documento"));
		input.sendKeys(cpf);
		input = driver.findElement(By.id("documento2"));
		input.sendKeys("6065453210");
		input = driver.findElement(By.id("celular"));
		input.sendKeys("51999999999");
		input = driver.findElement(By.id("residencial"));
		input.sendKeys("5133333333");
		
		
		
		
		//<input tabindex="1" type="email" value="" required="" name="email" id="email" title="Digite um E-mail válido!" placeholder="E-mail">
		
		
		
	//	driver.navigate().to("https://www.girafa.com.br/chat-zoo/index.php/por/?site=girafa");
	//	WebElement input = driver.findElement(By.name("Username"));
	//	input.submit();
		
	//	WebElement element = driver.findElement(By.xpath("//*[@id=\"tituloatendimento\"]"));
	//	assertTrue(element.getText().contains("Por favor"));
		
		
		
	}
	
	
	*/
	
	
}
