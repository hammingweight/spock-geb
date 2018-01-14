import org.openqa.selenium.chrome.ChromeDriver

// You can download the Chrome driver from 
// https://sites.google.com/a/chromium.org/chromedriver/downloads
// Then edit this to point to where you've saved the driver.
System.setProperty("webdriver.chrome.driver","/home/cmeijer/selenium-drivers/chromedriver")

// You'll want to change this to when you start writing your own tests.
baseUrl = "https://google.co.za"

driver = { new ChromeDriver() }


