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

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Produk'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_RFQ'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), 'laptop')

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Jual laptop - Glexindo Marketp/button_Lihat rincian'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Kirim Penawaran Sekarang'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Glexindo Marketplace/select_Pilih Ketentuan Pengiri'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Glexindo Marketplace/select_Pilih Ketentuan Pembaya'), 
    '7', true)

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Perkiraan waktu pengirim'), '2019-09-21')

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Port yang dipilih_prefer'), 'jakarta')

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/textarea_Pesan_comment'), 'tidak ada')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Kirim'))

WebUI.closeBrowser()

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Account_username'), 'kmz.in.act@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Password_password'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Ingat Account saya_remem'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Produk'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_RFQ'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), 'laptop')

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Jual laptop - Glexindo Marketp/button_Lihat rincian'))

