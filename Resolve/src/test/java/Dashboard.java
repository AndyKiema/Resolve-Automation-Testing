import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dashboard {
    @Test
    void opendashboard(){
        ChromeDriver cd=new ChromeDriver();
        cd.get("https://resolve.vote/");
        WebElement tagline= cd.findElement(By.xpath("/html/body/div/section[1]/div/div/div[1]/div[1]/h1"));
        tagline.isDisplayed();
    }
}
