package test.day13;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;

public class C02_FileExist {

@Test
public void test1(){
    System.getProperty("user.home");

    String path=System.getProperty("user.home"+"\\Desktop");
    System.out.println(System.getProperty("user.dir"));
  //C:\Users\hseyi\IdeaProjects\com.TestNgBatch44\pom.xml
String pomxml=System.getProperty("user.dir" + "\\pom.xml");
    Assert.assertTrue(Files.exists(Path.of(pomxml)));



}
}
