package test.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01DepensOnMethod {

    WebDriver driver;


    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

@Test(priority = 1)
    public void amazonTest(){
        driver.get("https://www.amazon.de/");
    WebElement logoelement= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
    Assert.assertTrue(logoelement.isDisplayed());



}

@Test(dependsOnMethods ="" )
    public void aramatesti(){
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella"+ Keys.ENTER);

}














}


