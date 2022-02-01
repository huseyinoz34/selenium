package test.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_Allert {

      WebDriver driver;


    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


    }
       @Test
    public void accapAllertTest(){
   driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
   driver.switchTo().alert().accept();
   WebElement sonucYazisiElementi=driver.findElement(By.xpath("//p[@id='result']"));
    String Aktuelsonucyazisi=sonucYazisiElementi.getText();
   String expectedSonucyazisi="You successfully clicked an alert";
           Assert.assertEquals(Aktuelsonucyazisi,expectedSonucyazisi);


       }
    @Test
    public void disMissAllert(){
    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
    driver.switchTo().alert().dismiss();
        WebElement sonucYazisiElementi=driver.findElement(By.xpath("//p[@id='result']"));
        String  actuelsonucyazisi=sonucYazisiElementi.getText();
        String istenmeyensonucyazisi="succesfully";
        Assert.assertFalse(actuelsonucyazisi.contains(istenmeyensonucyazisi));



    }
    @Test
    public void sendKeysAllerTest(){
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            driver.switchTo().alert().sendKeys("hüseyin");
            driver.switchTo().alert().accept();
        WebElement sonucYazisiElementi=driver.findElement(By.xpath("//p[@id='result']"));
        String  actuelsonucyazisi=sonucYazisiElementi.getText();
        System.out.println(actuelsonucyazisi);
        String aranansonucyazisi="hüseyin";
Assert.assertTrue(actuelsonucyazisi.contains(aranansonucyazisi));
    }
@AfterClass
    public void kapatma(){
        driver.close();
}

}
