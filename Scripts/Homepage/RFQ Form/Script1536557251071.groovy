import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.media.rtp.GlobalReceptionStats as GlobalReceptionStats
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Apa yang sedang Anda car (1)'), 'laptop')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Email salah_company_name (1)'), 'velocite')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_homepage.notification.rq (1)'), 'andro@gmail.com')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Nama Perusahaan Harus Di (1)'), 'tidak ada')

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Kirim Kebutuhan Anda (1)'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Account_username (1) (1)'), 'kmz.in.act@gmail.com')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Password_password (2) (1)'), 'test1234')

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Login (1) (1)'))

WebUI.delay(3)

//WebUI.navigateToUrl('http://d3v5.glexindo.com/newui/id/rfq/add/detail?company_name=velocite&description=tidak%20ada&keyword=laptop')
WebUI.click(findTestObject('Page_Glexindo Marketplace/span_Silahkan Pilih Kategori'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_View Compare_select2-sea'), 'laptop')

WebUI.sendKeys(findTestObject('Page_Glexindo Marketplace/input_View Compare_select2-sea'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Kuantitas _form-control'), '1.00')

WebUI.click(findTestObject('Page_Glexindo Marketplace/span_Satuan'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_concat(id(  select2-sele'), 'satuan')

WebUI.sendKeys(findTestObject('Page_Glexindo Marketplace/input_concat(id(  select2-sele'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_US _form-control'), '1,200.00')

WebUI.click(findTestObject('Page_Glexindo Marketplace/input'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/input'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Kirim RFQ'))

WebUI.closeBrowser()

