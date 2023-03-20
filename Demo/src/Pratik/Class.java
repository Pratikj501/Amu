package Pratik;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class 
{

		// private static final String String = null;

		public static void main(String[] args) throws InterruptedException 
		{	
			
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRATIK\\Downloads\\ch\\cdriver.exe");
				WebDriver driver = new ChromeDriver(option);
				//driver.manage().window().maximize();
			//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//	Thread.sleep(2000);
				//driver.get(UtilityClass.getPFdata("URL"));
			//	driver.get("https://blazedemo.com/index.php");
				driver.get("https://www.google.com/");
			
				
//				//1.
//			WebElement listdept = driver.findElement(By.xpath("//select[@name='fromPort']"));
//			Select s=new Select(listdept);
//			s.selectByIndex(5);
//		
//			
//	        WebElement listdst = driver.findElement(By.xpath("//select[@name='toPort']"));		
//			Select s1=new Select(listdst);
//			s1.selectByIndex(2);
//			
//			
//			driver.findElement(By.xpath("//input[@type='submit']")).click();
//			
//			//2.
//			//total row
//			List<WebElement> row = driver.findElements(By.xpath("//tr"));
//			
//			double lowestPrice = Double.MAX_VALUE;
//			
//		for(int i=0; i<=row.size(); i++)
//		{
//			WebElement priceelement = row.get(i).findElement(By.xpath("/html/body/div[2]/table/tbody/tr[*]/td[6]"));
//		
//			Double.parseDouble(String)
//		}
//			
//			   
//			for( WebElement list:price)
//			{
//				System.out.println(list.getText());
//				System.out.println(list.getAttribute(null));
//			}
//		}

	}

}
