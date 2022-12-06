// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestmisaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testmisa() {
    driver.get("https://www.misa.vn/");
    driver.manage().window().setSize(new Dimension(956, 574));
    driver.findElement(By.cssSelector(".l-current > .img-responsive")).click();
    driver.findElement(By.cssSelector(".l-selection .img-responsive")).click();
    js.executeScript("window.scrollTo(0,1000)");
    driver.findElement(By.cssSelector(".td-icon-font")).click();
    driver.findElement(By.cssSelector("#menu-item-115 > .td-link-element-after > .td-icon-menu-right")).click();
    driver.findElement(By.linkText("Enterprises")).click();
    driver.findElement(By.cssSelector("#menu-item-117 > a")).click();
  }
}
