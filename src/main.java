import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private static final Date debut=new Date(2021, 05, 22, 7, 0);
	private static final Date fin=new Date(2021, 05, 24, 22, 00);
	
	
	//"08:30:00"
	//"yyyy-MM-dd HH:mm:ss"
	public static void main(String[] args) {
		
		
		Film semonSlayer =new Film("Demon Slayer - Kimetsu no Yaiba - Le film : Le train de l'infini","01:57:00" );
		
		
		
		
		
		Seance semonSlayerSamedi= new Seance(semonSlayer, "2021-05-22 08:30:00");
		
		System.out.println(semonSlayer.toString());
		System.out.println(semonSlayerSamedi.toString());
		
		System.out.println(debut.toString());
		System.out.println(fin.toString());
		
		 File file = new File("ressource/chromedriver.exe");
	        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	        
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.mk2.com/salles/916-mk2-bibliotheque");
	       
	        
	        List<WebElement> elementstitres=driver.findElements(By.className("l-schedule-days"));
	        System.out.println(elementstitres.get(5).getAttribute("id"));
//	        driver.findElement(By.id("what")).clear();
//	        sleeep(2000);
//	        driver.findElement(By.id("what")).sendKeys("Java");
//	        
//	        driver.findElement(By.id("where")).clear();
//	       
//	        driver.findElement(By.id("where")).sendKeys("Hyderabad");
//	       
//	        driver.findElement(By.id("fj")).click();
//	       
//	        System.out.println("Page Title:" + driver.getTitle());
//	        System.out.println("Jobs Count: " + driver.findElement(By.id("searchCount")).getText());
//	        sleeep(2000);
	       
	        driver.close();
	}
	
	
	public static void sleeep(int duree)
	{
		 try {
				Thread.sleep(duree);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	

}
