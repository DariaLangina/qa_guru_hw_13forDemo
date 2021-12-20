package dlangina.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import dlangina.config.Project;
import dlangina.helpers.AllureAttachments;
import dlangina.helpers.DriverSettings;
import dlangina.helpers.DriverUtils;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith({AllureJunit5.class})
public class TestBase {

  @BeforeAll
  static void setUp() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    DriverSettings.configure();
  }

  @AfterEach
  public void addAttachments() {
    String sessionId = DriverUtils.getSessionId();

    AllureAttachments.addScreenshotAs("Last screenshot");
    AllureAttachments.addPageSource();
    AllureAttachments.addBrowserConsoleLogs();
//        AllureAttachments.attachNetwork(); // todo
    Selenide.closeWebDriver();

    if (Project.isVideoOn()) {
      AllureAttachments.addVideo(sessionId);
    }

  }
}
