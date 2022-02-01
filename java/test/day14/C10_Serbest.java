package test.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C10_Serbest extends TestBase {

    @Test
    public void test01() throws InterruptedException {
     driver.get("https://www.amazon.de/");
        Actions action=new Actions(driver);
        WebElement halloElement=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
       action.moveToElement(halloElement).perform();
       driver.findElement(By.xpath("//span[text()='Geschenke finden']")).click();
       Thread.sleep(4000);
    }




}
