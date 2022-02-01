package test.day08;

import org.testng.annotations.Test;

public class C01_natation {

    @Test(priority = 15)
    public void youtubetest(){
        System.out.println("youtube testi calisti");
    }

    @Test(priority = 10)
    public void amazontest(){
        System.out.println("amazon testi calisti");
    }

    @Test(priority = 5)
    public void bestBuyTest(){
        System.out.println("bestbuy testi calisti");
    }


}
