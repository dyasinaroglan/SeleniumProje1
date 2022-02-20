package Part2;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import utils.BaseStaticDriver;

public class ReadMe extends BaseStaticDriver {

    /*
        1) Bu siteye gidin. -> https://demo.applitools.com/

        2) Username kısmına "krafttechno@gmail.com" girin.

        3) Password kısmına "techno123." girin.

        4) "Sign in" buttonunan tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.(Assert kullanın )

        6) URL'in bu olduğunu doğrulayın. -> https://demo.applitools.com/app.html   (Assert kullanın )
     */
    public static void main(String[] args)  {

        driver.manage().window().maximize();
        driver.get("https://demo.applitools.com/");

        WebElement userName = driver.findElement(By.cssSelector("input[id='username']"));
        userName.sendKeys("krafttechno@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id='password']"));
        password.sendKeys("techno123.");
        WebElement sıgnIn = driver.findElement(By.cssSelector("a[id='log-in']"));
        sıgnIn.click();

        WebElement text = driver.findElement(By.id("time"));
        String result =text.getText();
        String expected = "Your nearest branch closes in: 30m 5s";

        Assert.assertEquals("test tamamlandı...",expected,result);

        String url = driver.getCurrentUrl();
        Assert.assertEquals("YANLIŞ ADRES","https://demo.applitools.com/app.html",url);

        if(url.contains("https://demo.applitools.com/app.html")){
            System.out.println("testiniz başarı ile tamamlandı");

        }

       /* WebElement cumle=driver.findElement(By.cssSelector("h6[id='time']"));
        String a="Your nearest branch closes in: 30m 5s";
        String expected1= cumle.getText();

        Assert.assertEquals("yanlış",expected1,a);

        String url="https://demo.applitools.com/app.html";
        String expected2=driver.getCurrentUrl();
        Assert.assertEquals("yanlış yerdesin",expected2,url);

        */


        driver.quit();





        

    }
}
