package simple;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testeCadastro {

	@Test
	public void testeCadastroValido() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/div[1]/div[2]/div[4]/a")); //clica em login
		element.click();
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside[2]/div/div/div[3]/div[2]/div[2]/a")); //clica em cadastro
		element.click();
		WebElement input = driver.findElement(By.id("email"));
		input.sendKeys("a4aaaaaaaaaa@aaaaaaaaaa.com");
		input = driver.findElement(By.id("confirmarEmail"));
		input.sendKeys("a4aaaaaaaaaa@aaaaaaaaaa.com");
		input = driver.findElement(By.id("senha"));
		input.sendKeys("12345");
		input = driver.findElement(By.id("confirmarSenha"));
		input.sendKeys("12345");
		input = driver.findElement(By.id("cep"));
		input.sendKeys("91010005");
		input = driver.findElement(By.id("numero"));
		input.sendKeys("21");
		input = driver.findElement(By.id("complemento"));
		input.sendKeys("casa");
		input = driver.findElement(By.id("nome"));
		input.sendKeys("Joao");
		input = driver.findElement(By.id("data"));
		input.sendKeys("10051980");
		input = driver.findElement(By.id("genero"));
		input.sendKeys("M");
		input = driver.findElement(By.id("documento")); //cpf
		input.sendKeys("57234120190");
		input = driver.findElement(By.id("documento2")); //rg
		input.sendKeys("6065953210");
		input = driver.findElement(By.id("celular"));
		input.sendKeys("51999999999");
		input = driver.findElement(By.id("residencial"));
		input.sendKeys("5133333333");
		input = driver.findElement(By.id("documento2"));//envia
		input.submit();
		Thread.sleep(3000);
		Alert alerta = driver.switchTo().alert();
		assertTrue(alerta.getText().contains("Cadastro realizado com sucesso!"));
		alerta.dismiss();
		driver.close();
	}
	
	@Test
	public void testeCadastroEmailInvalido() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/div[1]/div[2]/div[4]/a")); //clica em login
		element.click();
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside[2]/div/div/div[3]/div[2]/div[2]/a")); //clica em cadastro
		element.click();
		WebElement input = driver.findElement(By.id("email"));
		input.sendKeys("aaaaaaaaaa");
		input = driver.findElement(By.id("confirmarEmail"));
		input.sendKeys("aaaaaaaaaa");
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
		input = driver.findElement(By.id("documento")); //cpf
		input.sendKeys("57765688200");
		input = driver.findElement(By.id("documento2")); //rg
		input.sendKeys("6065953210");
		input = driver.findElement(By.id("celular"));
		input.sendKeys("51999999999");
		input = driver.findElement(By.id("residencial"));
		input.sendKeys("5133333333");
		input = driver.findElement(By.id("documento2"));//envia
		input.submit();
		Thread.sleep(3000);
		Alert alerta = driver.switchTo().alert();
		assertTrue(alerta.getText().contains("O email digitado é inválido"));
		alerta.dismiss();
		driver.close();
		
	}
	
	@Test
	public void testeCadastroCPFInvalido() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Meus Documentos\\Theilor\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/div[1]/div[2]/div[4]/a")); //clica em login
		element.click();
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside[2]/div/div/div[3]/div[2]/div[2]/a")); //clica em cadastro
		element.click();
		WebElement input = driver.findElement(By.id("email"));
		input.sendKeys("aaaaaaaaaa@abc.com");
		input = driver.findElement(By.id("confirmarEmail"));
		input.sendKeys("aaaaaaaaaa@abc.com");
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
		input = driver.findElement(By.id("documento")); //cpf
		input.sendKeys("51");
		input = driver.findElement(By.id("documento2")); //rg
		input.sendKeys("6065953210");
		input = driver.findElement(By.id("celular"));
		input.sendKeys("51999999999");
		input = driver.findElement(By.id("residencial"));
		input.sendKeys("5133333333");
		input = driver.findElement(By.id("documento2"));//envia
		input.submit();
		Thread.sleep(3000);
		Alert alerta = driver.switchTo().alert();
		assertTrue(alerta.getText().contains("O CPF informado é inválido"));
		alerta.dismiss();
		driver.close();
		
	}
	
	
	
	
}
