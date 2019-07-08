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

WebUI.navigateToUrl('http://d3v5.glexindo.com/newui/id')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Masuk (2)'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Account_username (3)'), 'company01')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Password_password (4)'), '123456')

WebUI.click(findTestObject('Page_Glexindo Marketplace/input_Ingat Account saya_remem (2)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Login (3)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/span_Login'))

WebUI.delay(5)

WebUI.navigateToUrl('http://d3v5.glexindo.com/newui/id/backend/dashboard')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/span_Pesan (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Buat Grup (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Aditya Dewantara (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Arbby Johan (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Faris Dzulfikar (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Ghani Akbar (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Han Tan (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/img (1)'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Tambahkan Kelompok Prati'), 'mencoba grup 5')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Tambahkan Kelompok Praticipa (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/img_1 (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Meninggalkan grup'))

WebUI.delay(3)

WebUI.acceptAlert()

