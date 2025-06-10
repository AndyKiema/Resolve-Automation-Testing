import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs {
    @Test
    void contactus() throws InterruptedException {
        ChromeDriver cd=new ChromeDriver();
        cd.get("https://resolve.vote/");
        cd.manage().window().maximize();
        WebElement ctus=cd.findElement(By.xpath("/html/body/div/header/div/nav/a[3]"));
        ctus.click();
        Thread.sleep(5000);
        WebElement chat=cd.findElement(By.xpath("/html/body/div/div/div/div/div[1]/h1"));
        chat.isDisplayed();
    }
}
