import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pricing {
    @Test
    void pricingpage(){
        ChromeDriver cd=new ChromeDriver();
        cd.get("https://resolve.vote/");
        cd.manage().window().maximize();
        WebElement pricingtextlink=cd.findElement(By.xpath("/html/body/div/header/div/nav/a[2]"));
        pricingtextlink.click();
        WebElement fairpricing=cd.findElement(By.xpath("/html/body/div/div/section[1]/div/div[1]/h2"));
        fairpricing.isDisplayed();
    }

}
