import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class TestMain {
    private WebDriver driver;

    @Test
    public void case1() throws Exception{
//        driver = new RemoteWebDriver(new URL("http://192.168.10.107:4444/wd/hub/"), DesiredCapabilities.chrome());
        driver = new RemoteWebDriver(new URL("http://192.168.10.107:4444/wd/hub/"),new ChromeOptions());
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        Assert.assertEquals("百度一下，你就知道",driver.getTitle());
        driver.quit();
    }
    @Test
    public void case2() throws Exception{
        driver = new RemoteWebDriver(new URL("http://192.168.10.107:4444/wd/hub/"), new ChromeOptions());
        driver.manage().window().maximize();
        driver.get("http://www.qq.com");
        Thread.sleep(3000);
        Assert.assertEquals("腾讯首页1",driver.getTitle());
        driver.quit();

    }

}
