import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signin {
    @Test
    void signin(){
        ChromeDriver cd=new ChromeDriver();
        cd.get("https://resolve.vote/");
        cd.manage().window().maximize();
        WebElement sign= cd.findElement(By.xpath("/html/body/div/header/div/div[2]/a[1]"));
        sign.click();
        WebElement welc=cd.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/h1"));
        welc.isDisplayed();
    }
}
