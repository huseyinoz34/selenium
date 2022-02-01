package test.day13;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_senkronik extends TestBase {

   @Test
   public void test1(){
       driver.get("https://the-internet.herokuapp.com/upload");


   }

}
