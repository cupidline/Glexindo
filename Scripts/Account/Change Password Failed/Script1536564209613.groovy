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

//String URL = 'http://d3v5.glexindo.com/newui/id'

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Masuk (1)'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Account_username (2)'), 'kmz.in.act@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace/input_Password_password (3)'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Page_Glexindo Marketplace/input_Ingat Account saya_remem (1)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Login (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Masuk (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Glexindo Marketplace/li_Account Saya'))

WebUI.mouseOver(findTestObject('Page_Glexindo Marketplace - Dashboa/div_Irfan Kamil'))

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/a_Edit Profil'))

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/button_Ganti Password'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Password lama_old_passwo'), 'test12345')

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Password baru_new_passwo'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace - Dashboa/input_Konfirmasi Password Baru'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Page_Glexindo Marketplace - Dashboa/button_Kirim'))

WebUI.closeBrowser()

