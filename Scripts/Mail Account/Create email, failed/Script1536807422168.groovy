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

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Account_username (3)'), 'company01')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Password_password (4)'), '123456')

WebUI.click(findTestObject('Page_Glexindo Marketplace/input_Ingat Account saya_remem (2)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Login (3)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/span_Login'))

WebUI.delay(5)

WebUI.navigateToUrl('http://d3v5.glexindo.com/newui/id/backend/dashboard')

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/span_Layanan Surat Perusahaan'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/button_Alamat Email'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_E-mail_email_address'), 'testmail')

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Konfirmasi Password_pass'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/button_Simpan'))

WebUI.delay(0)

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Konfirmasi Password_pass'), 'BR4+6ebIRw/89ruX5hJDag==')

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/button_Simpan'))

WebUI.delay(3)

WebUI.clearText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_E-mail_email_address'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/button_Simpan'))

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/button_Simpan'))

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Konfirmasi Password_pass'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/button_Simpan'))

WebUI.delay(3)

WebUI.closeBrowser()

