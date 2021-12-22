package dlangina.tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static java.time.Duration.ofSeconds;

import io.qameta.allure.AllureId;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Продукты")
@Feature("Информация о продукте")
@Story("Блок информации о продукте")
@Tag("regress")
public class PageIntroTests extends TestBase {

  @AllureId("6247")
  @DisplayName("Проверка компонентов информационного блока продукта R‑Vision SENSE")
  @Test
  void checkInfoBlockComponentsForSense() {
    step("Открытие страницы продукта R‑Vision SENSE", () ->
        open("https://rvision.pro/sense/"));
    step("Проверка компонентов информационного блока", () -> {
      $(".beautiful-title-container")
          .shouldBe(visible, ofSeconds(6))
          .shouldHave(text("R-Vision SENSE"))
          .shouldHave(text("Аналитическая платформа кибербезопасности"));
    });
  }

  @AllureId("6297")
  @DisplayName("Проверка компонентов информационного блока продукта R‑Vision TDP")
  @Test
  void checkInfoBlockComponentsForTdp() {
    step("Открытие страницы продукта R‑Vision TDP", () ->
        open("https://rvision.pro/deception/"));
    step("Проверка компонентов информационного блока", () -> {
      $(".beautiful-title-container")
          .shouldBe(visible, ofSeconds(6))
          .shouldHave(text("R-Vision Threat Deception Platform"))
          .shouldHave(text("Имитация ИТ-инфраструктуры для обнаружения кибератак"));
    });
  }

  @AllureId("6298")
  @DisplayName("Проверка компонентов информационного блока продукта R‑Vision IRP")
  @Test
  void checkInfoBlockComponentsForIrp() {
    step("Открытие страницы продукта R‑Vision IRP", () ->
        open("https://rvision.pro/irp/"));
    step("Проверка компонентов информационного блока", () -> {
      $(".beautiful-title-container")
          .shouldBe(visible, ofSeconds(6))
          .shouldHave(text("R-Vision Incident Response Platform"))
          .shouldHave(text("Платформа для создания Центра реагирования на инциденты ИБ"));
    });
  }

  @AllureId("6299")
  @DisplayName("Проверка компонентов информационного блока продукта R‑Vision TIP")
  @Test
  void checkInfoBlockComponentsForTip() {
    step("Открытие страницы продукта R‑Vision TIP", () ->
        open("https://rvision.pro/tip/"));
    step("Проверка компонентов информационного блока", () -> {
      $(".beautiful-title-container")
          .shouldBe(visible, ofSeconds(6))
          .shouldHave(text("R-Vision Threat Intelligence Platform"))
          .shouldHave(text("Комплексная работа с данными киберразведки"));
    });
  }

  @AllureId("6300")
  @DisplayName("Проверка компонентов информационного блока продукта R‑Vision SGRC")
  @Test
  void checkInfoBlockComponentsForSgrc() {
    step("Открытие страницы продукта R‑Vision SGRC", () ->
        open("https://rvision.pro/sgrc/"));
    step("Проверка компонентов информационного блока", () -> {
      $(".beautiful-title-container")
          .shouldBe(visible, ofSeconds(6))
          .shouldHave(text("R-Vision Security GRC Platform"))
          .shouldHave(text(
              "Платформа для централизованного управления информационной безопасностью, моделирования рисков и автоматизации аудита ИБ"));
    });
  }
}
