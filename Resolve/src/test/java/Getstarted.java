import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Getstarted {
    @Test
    void gets(){
        ChromeDriver cd=new ChromeDriver();
        cd.get("https://resolve.vote/");
        cd.manage().window().maximize();
        WebElement getst=cd.findElement(By.xpath("/html/body/div/header/div/div[2]/a[2]"));
        getst.click();
        WebElement cre=cd.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/h1"));
        cre.isDisplayed();
        
    }
}
