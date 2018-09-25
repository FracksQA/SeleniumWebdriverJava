package br.com.julio;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class automationpracticecadastrar {
	
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//ChromeOptions options = new ChromeOptions(); 
		//options.addArguments("start-maximized"); // open Browser in maximized mode 
		//options.addArguments("disable-infobars"); // disabling infobars 
		//options.addArguments("--disable-extensions"); // disabling extensions 
		//options.addArguments("--disable-gpu"); // applicable to windows os only 
		//options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems 
		//options.addArguments("--no-sandbox"); // Bypass OS security model 
		//WebDriver driver = new ChromeDriver(options); 
		//driver.get("https://google.com"); 
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		Thread.sleep(2000);
		
		//driver.findElement(By.className("login"));
		
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		String textonoelemento = signin.getText();
		assertEquals("Sign in", textonoelemento );
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		Thread.sleep(2000);
		
		//inserir email no cadastro
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("tdbfla@yahoo.com.br");
		
		//clicar em criar conta
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		Thread.sleep(3000);
		
		//clica no checkbox
		driver.findElement(By.cssSelector("#id_gender1")).click();
		
		//WebElement ChkBox  = driver.findElement(By.cssSelector("input[id='id_gender1']")).click();
		
		//Thread.sleep(1000);

		//JavascriptExecutor js = (JavascriptExecutor) driver;        
		//js.executeScript("arguments[0].setAttribute('value', '1');", ChkBox  );		
		
		//preenche primeiro nome
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Flavios");
		
		//preenche segundo nome
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Tester");
		
		//preenche password
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("292929");
		
		Thread.sleep(2000);
		
		
		// escolher dia 15
		
		  driver.findElement(By.xpath("//*[@id=\"days\"]")).click();
		
		  driver.findElement(By.xpath("//*[@id=\"days\"]/option[16]")).click();

		//escolher mês
        
		  driver.findElement(By.xpath("//*[@id=\"months\"]")).click();
			
		  driver.findElement(By.xpath("//*[@id=\"months\"]/option[3]")).click();
		  
		  
		  //escolher ano
		  
		  driver.findElement(By.xpath("//*[@id=\"years\"]")).click();
			
		  driver.findElement(By.xpath("//*[@id=\"years\"]/option[42]")).click();
		  
		  //preenche address
		  
		  driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Rua tree");
		  		  
		  //preenche city
		  driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("São Paulo");
		  
		  
		  //preenche estado
		
		  driver.findElement(By.xpath("//*[@id=\"id_state\"]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[2]")).click();
		  
		  
		  //preenche zipcode
		  driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("04412");
		  
		  
		//preenche phonemobile
		  driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("9898989898"); 
		
		  
		  //preenche  alias
		  driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Roldão");
		  
		  
		  
		//preenche registrar
		  driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		  
		
		
		
		
		
		
	}
	
	@Test
	public void logarAutomation() throws InterruptedException {
		
		
		
	}

}
