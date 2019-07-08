import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Masuk (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Account_username (2)'), 'kmz.in.act@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Password_password (3)'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Ingat Account saya_remem (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Login (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Masuk (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/li_Semua RFQ'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Masuk (1)'))

WebUI.click(findTestObject('Object Repository/Page_Jual - Glexindo Marketplace/li_Tambahkan RFQ'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/span_Silahkan Pilih Kategori'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_concat(id(  select2-cate'), 'laptop')

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace/input_concat(id(  select2-cate'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Kuantitas _form-control'), '19.00')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/span_Satuan'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_concat(id(  select2-sele'), 'satuan')

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace/input_concat(id(  select2-sele'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/input'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/input'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_US _form-control'), '1,000.00')

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Kategori _keyword'), 'laptop')

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Kategori _keyword'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

