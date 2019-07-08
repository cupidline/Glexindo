import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.navigateToUrl('http://d3v5.glexindo.com/newui/id')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Telusuri Produk (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Sumber daya alam (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Pertanian (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Mesin (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Elektronik (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Automotif (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Apparels (1)'))

WebUI.closeBrowser()

