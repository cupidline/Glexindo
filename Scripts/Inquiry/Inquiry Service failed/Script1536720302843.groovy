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

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Masuk (2) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Account_username (3) (1)'), 'kmz.in.act@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Password_password (4) (1)'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Ingat Account saya_remem (2) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Login (3) (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Telusuri Layanan (2)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Produk dan Layanan Lainnya'))

WebUI.click(findTestObject('Page_Jual other-product-and-service/img_Favorit_attachment-shop_ca'))

WebUI.click(findTestObject('Object Repository/Page_Asuransi Kredit Perdagangan AX/button_Beli Sekarang'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/textarea'), 'membeli asuransi')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_KIRIM PESAN (1)'))

WebUI.closeBrowser()

