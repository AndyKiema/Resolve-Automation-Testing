import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Howitworks {
    @Test
    void howitworks(){
        ChromeDriver ch=new ChromeDriver();
        ch.get("https://resolve.vote/");
        ch.manage().window().maximize();
        WebElement how=ch.findElement(By.xpath("/html/body/div/header/div/nav/a[4]"));
        how.click();
        WebElement our=ch.findElement(By.xpath("/html/body/div/div/section[1]/div/div/div[1]/div[1]/h1"));
        our.isDisplayed();

    }
}
