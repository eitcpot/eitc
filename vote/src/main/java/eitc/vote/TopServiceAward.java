package eitc.vote;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopServiceAward {

	public static void main(String[] args) {
		try {
			Random ran = new Random();
			System.setProperty("webdriver.chrome.driver", "C:/seleniumdriver/chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			
            File f = new File("C:/seleniumdriver/fbusers.xml");   
            SAXReader reader = new SAXReader();   
            Document doc = reader.read(f);   
            Element root = doc.getRootElement();   
            Element foo;   
            for (Iterator i = root.elementIterator("User"); i.hasNext();) {   
                foo = (Element) i.next();   
                String email = foo.elementText("Email");
                String password = foo.elementText("Password");
                
                System.out.println("Email:" + email);   
                System.out.println("Password:" + password);   
                
    			//登入FB
    			driver.get("https://zh-tw.facebook.com/");
    			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
    			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
    			driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
    			Thread.sleep(3000);
    			
    			//轉頁至投票網站
    			driver.get("http://service2017.nextmag.com.tw/vote/index");
    			
    			//銀行，亂數選取
    			Thread.sleep(1000);
    			List<WebElement> radioGroup1 = driver.findElements(By.name("C1"));
    			System.out.println(radioGroup1.size());
    	        executor.executeScript("arguments[0].click();", radioGroup1.get(ran.nextInt(radioGroup1.size())));
    	        driver.findElement(By.name("next")).click();
    	        Thread.sleep(2000);
    	        driver.findElement(By.name("next")).click();
    	        
    	        //人壽，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup2 = driver.findElements(By.name("C2"));
    			System.out.println(radioGroup2.size());
    			executor.executeScript("arguments[0].click();", radioGroup2.get(ran.nextInt(radioGroup2.size())));
    	        driver.findElement(By.name("next")).click();
    	       
    	        //房仲業，選取東森房屋
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup3 = driver.findElements(By.name("C3"));
    			System.out.println(radioGroup3.size());
    	        executor.executeScript("arguments[0].click();", radioGroup3.get(9));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //汽車，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup4 = driver.findElements(By.name("C4"));
    			System.out.println(radioGroup4.size());
    			executor.executeScript("arguments[0].click();", radioGroup4.get(ran.nextInt(radioGroup4.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //國際航線，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup5 = driver.findElements(By.name("C5"));
    			System.out.println(radioGroup5.size());
    			executor.executeScript("arguments[0].click();", radioGroup5.get(ran.nextInt(radioGroup5.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //旅行社，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup6 = driver.findElements(By.name("C6"));
    			System.out.println(radioGroup6.size());
    			executor.executeScript("arguments[0].click();", radioGroup6.get(ran.nextInt(radioGroup6.size())));
    	        driver.findElement(By.name("next")).click();

    	        //國內宅配/快遞，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup7 = driver.findElements(By.name("C7"));
    			System.out.println(radioGroup7.size());
    			executor.executeScript("arguments[0].click();", radioGroup7.get(ran.nextInt(radioGroup7.size())));
    	        driver.findElement(By.name("next")).click();

    	        //百貨公司&購物中心，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup8 = driver.findElements(By.name("C8"));
    			System.out.println(radioGroup8.size());
    			executor.executeScript("arguments[0].click();", radioGroup8.get(ran.nextInt(radioGroup8.size())));
    	        driver.findElement(By.name("next")).click();

    	        //觀光飯店，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup9 = driver.findElements(By.name("C9"));
    			System.out.println(radioGroup9.size());
    			executor.executeScript("arguments[0].click();", radioGroup9.get(ran.nextInt(radioGroup9.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //藥妝&便利店，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup10 = driver.findElements(By.name("C10"));
    			System.out.println(radioGroup10.size());
    			executor.executeScript("arguments[0].click();", radioGroup10.get(ran.nextInt(radioGroup10.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //休閒娛樂，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup11 = driver.findElements(By.name("C11"));
    			System.out.println(radioGroup11.size());
    			executor.executeScript("arguments[0].click();", radioGroup11.get(ran.nextInt(radioGroup11.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //連鎖咖啡店，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup12 = driver.findElements(By.name("C12"));
    			System.out.println(radioGroup12.size());
    			executor.executeScript("arguments[0].click();", radioGroup12.get(ran.nextInt(radioGroup12.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //連鎖速食店，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup13 = driver.findElements(By.name("C13"));
    			System.out.println(radioGroup13.size());
    			executor.executeScript("arguments[0].click();", radioGroup13.get(ran.nextInt(radioGroup13.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //連鎖服飾，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup14 = driver.findElements(By.name("C14"));
    			System.out.println(radioGroup14.size());
    			executor.executeScript("arguments[0].click();", radioGroup14.get(ran.nextInt(radioGroup14.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //複合賣場超市，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup15 = driver.findElements(By.name("C15"));
    			System.out.println(radioGroup15.size());
    			executor.executeScript("arguments[0].click();", radioGroup15.get(ran.nextInt(radioGroup15.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //電信4G業者，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup16 = driver.findElements(By.name("C16"));
    			System.out.println(radioGroup16.size());
    			executor.executeScript("arguments[0].click();", radioGroup16.get(ran.nextInt(radioGroup16.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //大眾運蘇，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup17 = driver.findElements(By.name("C17"));
    			System.out.println(radioGroup17.size());
    			executor.executeScript("arguments[0].click();", radioGroup17.get(ran.nextInt(radioGroup17.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //網路購物，選取ET Mall東森購物網
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup18 = driver.findElements(By.name("C18"));
    			System.out.println(radioGroup18.size());
    			executor.executeScript("arguments[0].click();", radioGroup18.get(8));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //醫療院所，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup19 = driver.findElements(By.name("C19"));
    			System.out.println(radioGroup19.size());
    			executor.executeScript("arguments[0].click();", radioGroup19.get(ran.nextInt(radioGroup19.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //主題樂園，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup20 = driver.findElements(By.name("C20"));
    			System.out.println(radioGroup20.size());
    			executor.executeScript("arguments[0].click();", radioGroup20.get(ran.nextInt(radioGroup20.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //網路新創服務，亂數選取
    	        Thread.sleep(1000);
    			List<WebElement> radioGroup21 = driver.findElements(By.name("C21"));
    			System.out.println(radioGroup21.size());
    			executor.executeScript("arguments[0].click();", radioGroup21.get(ran.nextInt(radioGroup21.size())));
    	        driver.findElement(By.name("next")).click();
    	        
    	        //選取不抽獎
    	        Thread.sleep(1000);
    	        driver.findElement(By.xpath("/html/body/div/div/article/div/div/form/input[2]")).click();
            }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
