package test.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_windowHandle {

    WebDriver driver;



    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
      //      Tests package’inda yeni bir class olusturun: WindowHandle2
       //https://the-internet.herokuapp.com/windows adresine gidin.
       // Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
      // Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.// Click Here butonuna basın.
       // Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
     // Sayfadaki textin “New Window” olduğunu doğrulayın.
      // Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.


    }

    @Test
    public void windowhandle(){

        driver.get("https://the-internet.herokuapp.com/windows");
        Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().contains("Opening a new window"));
        Assert.assertTrue(driver.getTitle().equals("The Internet"));
        String ilksayfawindowhandl=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Assert.assertFalse(driver.getTitle().contains("New Window"));
        driver.switchTo().window(ilksayfawindowhandl);
        Assert.assertTrue(driver.getTitle().equals("The Internet"));



    }







}
