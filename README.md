# spock-geb
A skeleton Spock/Geb/Chrome project that can be run from Gradle.

This project is intended to get you going with Spock and Geb using the Chrome browser and the
Selenium Chrome driver.

## Prerequisites
Download the Chrome driver from https://sites.google.com/a/chromium.org/chromedriver/downloads
Unzip the driver *somewhere*.

Edit the [GebConfig.groovyfile](./src/test/resources/GebConfig.groovy) file, so that the `webdriver.chrome.driver`
property points *somewhere* (i.e. where you saved the driver).

## Checking that everything works
If you're on Windows, run

```
gradlew.bat clean test
```

If you're using Linux, run

```
./gradlew clean test
```

Hopefully that will work (you should see Chrome launch). If it didn't work look for the test report
file `build/reports/tests/test/index.html`

## If it all worked, then...
 * Edit the `baseUrl` property in the [GebConfig.groovyfile](./src/test/resources/GebConfig.groovy) file
 * Delete the [Geb test file](src/test/groovy/Test.groovy)
 * Start writing your own Groovy/Geb tests and save them in src/test/groovy
 
