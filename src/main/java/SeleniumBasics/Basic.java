package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new FirefoxDriver();
//        System.setProperty("Webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\JavaSelenium\\src\\main\\Drivers\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");
        String exptitle="Google";
        String acttitle=driver.getTitle();
        //System.out.println(acttitle);
        if(exptitle.equalsIgnoreCase(acttitle)){
            System.out.println("Title Matched");
        }
    else {
            System.out.println("Title Mismatched");
        }
        WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
        searchbox.sendKeys("Selenium");
        searchbox.clear();
        searchbox.sendKeys("Javatpoint");
        Thread.sleep(3000);

        driver.close();
    }
}
