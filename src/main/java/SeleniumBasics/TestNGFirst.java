package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestNGFirst {
@Test
    public void setUp(){
    WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com");



}
}
