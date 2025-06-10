import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Reviews {
    @Test
    void review(){
        ChromeDriver cd= new ChromeDriver();
        cd.get("https://resolve.vote/");
        cd.manage().window().maximize();
        WebElement rev=cd.findElement(By.xpath("/html/body/div/header/div/nav/div[2]/a"));
        rev.click();
        WebElement unfil=cd.findElement(By.xpath("/html/body/div/div/section/div/div/div[1]/div[1]/h1"));
        unfil.isDisplayed();
    }
}
