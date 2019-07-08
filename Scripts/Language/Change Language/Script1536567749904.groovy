import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/span_English'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/span_'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Bahasa Indonesia'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a__1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a__2'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Bahasa Melayu'))

WebUI.closeBrowser()

