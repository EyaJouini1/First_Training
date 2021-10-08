package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class FirstTest {
	public static void main(String[] args) {
	
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize(); 
		
			    WebElement Fname=driver.findElement(By.name("firstname"));
			Fname.sendKeys("jouini");
		
			WebElement Lname =driver.findElement(By.name("lastname"));
			Lname.sendKeys("Eya");
			
			WebElement mail =driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input"));
			mail.sendKeys("jouinieya1998@gmail.com");
		
		
			WebElement phone =driver.findElement(By.xpath("//*[@id=\"field25\"]/div/input"));
			phone.sendKeys("50577582");
			
			
			WebElement job =driver.findElement(By.xpath("//*[@id=\"field26\"]/div/input"));
			job.sendKeys("ingénieure");
			
			
			
			WebElement company =driver.findElement(By.xpath("//*[@id=\"field9\"]/div/input"));
			company.sendKeys("Neoliance ");
			
			
			WebElement selectElement = driver.findElement(By.name("employees_c"));
			Select selectObject = new Select(selectElement);
			selectObject.selectByVisibleText("11 - 50 employees");
			
			
			WebElement mot =driver.findElement(By.id("interest_serve_c0"));
			mot.click();
			
			
			 WebElement radio1 = driver.findElement(By.id("doi1"));
			 radio1.click();
			 
				
				WebElement element = driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input"));
				Actions actions = new Actions(driver);
				actions.moveToElement(element);
				actions.perform();
				element.click();
				
		}}
			
			
			
	//	WebElement btnSubmit=driver.findElement(By.className("element-container my-2 btn btn-primary"));
		
		
		
		/*

		//WebElement element = driver.findElement(By.id("gbqfd"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btnSubmit);
	*/
	


