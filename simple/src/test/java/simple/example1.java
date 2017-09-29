package simple;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example1 {

	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String site = "http://www.girafa.com.br/Login";
		//String site = "http://www.metric-conversions.org/pt-br/velocidade/nos-em-quilometros-por-hora.htm";
		driver.navigate().to(site);
//		String title = driver.getTitle();
//		assertTrue(title.startsWith("Eletrônicos, Eletrodomésticos, Smartphone | Girafa"));
		
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("q")));
		//body > div.container.no-padding > header > div.topoMobile.visible-xs.visible-sm
		//html/body/div[1]/header/div[2]
		//WebElement input = driver.findElement(By.xpath("//div[@class='topoMobile visible-xs visible-sm']//div[@id='q']"));
		
		
		WebElement input = driver.findElement(By.xpath("//*[@id=\"buscaprodutoform3\"]//*[@id=\"q\"]"));
		//WebElement input = driver.findElement(By.id("q"));
		//WebElement input = driver.findElement(By.id("argumentConv"));
		
		//By.xpath("//div[@class='page']//div[@id='_loginButton']")
		
		
		input.sendKeys("celular");
		input.submit();
		//Thread.sleep(500);
		WebElement output = driver.findElement(By.id("answer"));
		String result = output.getText();
		assertTrue(result.contains("2knots"));
		//Thread.sleep(500);
		driver.quit();
		
		
		
		
		
		
		
	}

}
