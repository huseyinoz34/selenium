package test.day14;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;

public class C04_Screenschoot extends TestBase {


   @Test
   public void test1(){

driver.get("https://www.google.com/");
       TakesScreenshot tss=(TakesScreenshot)driver;
       // tum sayfa icin bi file olusturalim

//File tumSayfass=new File()";
//tumSayfass=tss.getScreenshotAs(OutputType.FILE);

   }



}
