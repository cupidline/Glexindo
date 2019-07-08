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

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Masuk (2)'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Account_username (3)'), 'kmz.in.act@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace/input_Password_password (4)'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Page_Glexindo Marketplace/input_Ingat Account saya_remem (2)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Login (3)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Glexindo Marketplace/img_Lanjut berbelanja_img-flui (1)'))

WebUI.click(findTestObject('Page_Batubara Lignit - Glexindo Mar/button_Beli Sekarang'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Kuantitas_carte2230b8535'), '-1')

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Mulai Beli'))

