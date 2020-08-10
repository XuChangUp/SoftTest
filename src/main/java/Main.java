import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class Main {
    public static  void  main(String[] args) throws Exception{
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.10.107:4444/wd/hub/"), DesiredCapabilities.chrome());
        driver.get("http://www.baidu.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("page title:" + driver.getTitle());
        driver.quit();
    }
}