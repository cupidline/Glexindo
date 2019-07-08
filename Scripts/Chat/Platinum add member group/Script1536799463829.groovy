import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Masuk (2)'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Account_username (3)'), 'company01')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Password_password (4)'), '123456')

WebUI.click(findTestObject('Page_Glexindo Marketplace/input_Ingat Account saya_remem (2)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Login (3)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/span_Login'))

WebUI.delay(5)

WebUI.navigateToUrl('http://d3v5.glexindo.com/newui/id/backend/dashboard')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/span_Pesan'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Buat Grup'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Aditya Dewantara'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Arbby Johan'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Faris Dzulfikar'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Ghani Akbar'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Han Tan'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/img'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Tambahkan Kelompok Prati'), 'mencoba grup 3')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Tambahkan Kelompok Praticipa'))

WebUI.closeBrowser()

