<h1 align="center"> :robot: Проект по автоматизации тестирования в рамках обучения на курсе QA.GURU </h1>

## :rocket: Технологический стек

IntelliJ IDEA, Java, Gradle, JUnit5, Selenide, Selenoid, Jenkins, Allure Report, Allure TestOps,
Jira, Github, Telegram

<p  align="center"

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/IDEA-logo.svg"></code>
<code><img width="5%" title="Java" src="images/logo/java-logo.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/gradle-logo.svg "></code>
<code><img width="5%" title="JUnit5" src="images/logo/junit5-logo.svg"></code>
<code><img width="5%" title="Selenide" src="images/logo/selenide-logo.svg"></code>
<code><img width="5%" title="Selenoid" src="images/logo/selenoid-logo.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/jenkins-logo.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/allure-Report-logo.svg"></code>
<code><img width="5%" title="Allure TestOps" src="images/logo/allure-ee-logo.svg"></code>
<code><img width="5%" title="Jira" src="images/logo/jira-logo.svg"></code>
<code><img width="5%" title="Github" src="images/logo/git-logo.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></code>
</p>

## UI тесты

* ✅ Проверка компонентов информационного блока продукта R‑Vision IRP
* ✅ Проверка компонентов информационного блока продукта R‑Vision SENSE
* ✅ Проверка компонентов информационного блока продукта R‑Vision SGRC
* ✅ Проверка компонентов информационного блока продукта R‑Vision TDP
* ✅ Проверка компонентов информационного блока продукта R‑Vision TIP

### Отчёт о прохождении автотестов в Allure Report

<p align="center">
  <img src="images/readme13forDemo/Allure_Report.png">
</p>

### Хранение тестовой документации в Allure TestOps

<p align="center">
  <img src="images/readme13forDemo/Allure_TestOps1.png">
</p>

<p align="center">
  <img src="images/readme13forDemo/Allure_TestOps2.png">
</p>

### Интерграция с Jira

<p align="center">
  <img src="images/readme13forDemo/Jira.png">
</p>

### Пример запуска теста в Selenoid

<p  align="left"
<code><img width="60%" title="Selenoid" src="images/demo1.gif"></code>
</p>

### Уведомления о прохождении автотестов в Telegram

<p align="center">
  <img src="images/readme13forDemo/Telegram_1.png">
</p>

<p align="center">
  <img src="images/readme13forDemo/Telegram_2.png">
</p>

Serve report:

```bash
allure serve build/allure-results
```

### Запуск в Jenkins

Статистика по запускам <br >
<p align="center">
  <img src="images/readme13forDemo/jenkins1.png">
</p>

Параметры запуска <br >
<p align="center">
  <img src="images/readme13forDemo/jenkins2.png">
</p>

### Как запустить

Перед выполением необходимо:

* в local.properies определить параметры конфигурации (для запуска тестов локально)
* в remote.properies определить параметры конфигурации (для запуска тестов удаленно) или передать
  значения:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* remoteDriverUrl (url address from selenoid or grid)
* threads (number of threads)

### Локально

```
gradle clean test
```

### Удаленно

```
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -Dthreads=1 test
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
