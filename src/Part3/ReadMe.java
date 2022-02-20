package Part3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ReadMe extends BaseStaticDriver {

    /*

        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve  Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 918 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        4) Snepdeal logosuna tıklayınız.

        5) URL'in bu olduğunu doğrulayın. (https://www.snapdeal.com/)

     */
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.cssSelector("input[class='col-xs-20 searchformInput keyword']"));
        search.sendKeys("teddy bear");
        Thread.sleep(1000);
        WebElement searchClick = driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
        searchClick.click();
        Thread.sleep(2000);
        WebElement text = driver.findElement(By.cssSelector("div[id='searchMessageContainer']"));
        String result = text.getText();
        String expected = "We've got 418 results for 'teddy bear'";
        Assert.assertEquals("yanlış",expected,result);
        if(result.contains(expected)){
            System.out.println("başarılı bir şekilde tamamlandı");
        }

        WebElement logo = driver.findElement(By.cssSelector("img[title='Snapdeal']"));
        logo.click();

        String url = driver.getCurrentUrl();
        Assert.assertEquals("yanlış url","https://www.snapdeal.com/",url);
            System.out.println("testiniz başarı ile tamamlandı.");
            driver.quit();

    }
}
