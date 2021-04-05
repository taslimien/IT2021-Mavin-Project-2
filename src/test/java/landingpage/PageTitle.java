package landingpage;

import Home.AmazonHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitle extends AmazonHomePage {

    @Test
    public void checkTitle(){
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
