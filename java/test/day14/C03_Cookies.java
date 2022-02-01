package test.day14;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {

    //1- Amazon anasayfaya gidin
    //2- tum cookie’leri listeleyin
    //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
    //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
    //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
    //6- eklediginiz cookie’nin sayfaya eklendigini test edin
    //7- ismi skin olan cookie’yi silin ve silindigini test edin
    //8- tum cookie’leri silin ve silindigini test edin


@Test
    public void test01() {
    driver.get("https://www.amazon.com");
    Set<Cookie> cookiSet = driver.manage().getCookies();
    System.out.println(cookiSet);
    int sayac = 1;
    for (Cookie each : cookiSet
    ) {
        System.out.println(sayac + ". cocokie  " + each);
        sayac++;
    }

    Cookie mycookie = new Cookie("en sevdigim cookie", "cikolatali");
    driver.manage().addCookie(mycookie);
    int sayac1 = 1;
    Set<Cookie> cookiSet1 = driver.manage().getCookies();
    for (Cookie each : cookiSet1
    ) {
        System.out.println(sayac + ". cocokie  " + each);
        sayac1++;

    }
    driver.manage().deleteAllCookies();
    Assert.assertTrue(cookiSet1.size()==0);

}
}
