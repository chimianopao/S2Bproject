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

public class testeCadastro {

	@Test
	public void testCadastro() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.geradordecpf.org/");
		WebElement element = driver.findElement(By.id("btn-gerar-cpf"));
		element.click();
		Thread.sleep(5000);
		WebElement output = driver.findElement(By.id("numero"));
		//element.getAttribute("value")
		String cpf = output.getAttribute("innerText");
		//String cpf = output.getText();
		
		String site = "http://www.girafa.com.br";
		driver.navigate().to(site);
		element = driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/div[1]/div[2]/div[4]/a")); //clica em login
		element.click();
		
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside[2]/div/div/div[3]/div[2]/div[2]/a")); //clica em cadastro
		element.click();
		
		WebElement input = driver.findElement(By.id("email"));
		input.sendKeys("aaaaaaaaaaa@aaaaaaaaaa.com");
		input = driver.findElement(By.id("confirmarEmail"));
		input.sendKeys("aaaaaaaaaaa@aaaaaaaaaa.com");
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
		input.sendKeys("02642864057");
		input = driver.findElement(By.id("documento2")); //rg
		input.sendKeys("6065953210");
		input = driver.findElement(By.id("celular"));
		input.sendKeys("51999999999");
		input = driver.findElement(By.id("residencial"));
		input.sendKeys("5133333333");
		input = driver.findElement(By.id("documento2"));
		input.submit();
		
	}
	
	
	
	
	
}
