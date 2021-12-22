package dlangina.helpers;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.logging.LogType.BROWSER;

import com.codeborne.selenide.Selenide;
import java.nio.charset.StandardCharsets;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class DriverUtils {

  public static byte[] getScreenshotAsBytes() {
    return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
  }

  public static byte[] getPageSourceAsBytes() {
    return getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
  }

  public static String getConsoleLogs() { // todo refactor
    return String.join("\n", Selenide.getWebDriverLogs(BROWSER));
  }
}
