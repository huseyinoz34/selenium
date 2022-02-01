package test.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_KeyboardAction extends TestBase {
// 1- Bir Class olusturalim KeyboardActions2
//   2- https://html.com/tags/iframe/ sayfasina gidel
//            // 3- video’yu gorecek kadar asagi inin
//4- videoyu izlemek icin Play tusuna basin
//5- videoyu calistirdiginizi test edin
//
//
//
//
//
    @Test
public void test() throws InterruptedException {
driver.get("https://html.com/tags/iframe");

        Actions actions=new Actions(driver);
      actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        WebElement iframeelementi=driver.findElement(By.xpath("//iframe[@class='lazy-loaded']"));
       driver.switchTo().frame(iframeelementi);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
        //5- videoyu calistirdiginizi test edin
        WebElement pauseButton=driver.findElement(By.xpath("//button[@title='Pause (k)']"));
        Assert.assertTrue(pauseButton.isEnabled());
        Thread.sleep(10000);

    }




}