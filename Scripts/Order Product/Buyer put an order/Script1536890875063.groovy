import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://d3v5.glexindo.com/newui/id')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Masuk (3)'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Account_username (4)'), 'kmz.in.act@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Glexindo Marketplace/input_Password_password (5)'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Page_Glexindo Marketplace/input_Ingat Account saya_remem (3)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Login (4)'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea (4)'), 'aroma')

WebUI.sendKeys(findTestObject('Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea (4)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Jual aroma - Glexindo Marketpl/img_Favorit_attachment-shop_ca'))

WebUI.click(findTestObject('Page_Aroma Kopi - Glexindo Marketpl/button_Beli Sekarang'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Kuantitas_carte2230b8535 (1)'), '20')

WebUI.click(findTestObject('Page_Glexindo Marketplace/div_Jasa pengiriman_custom-rad'))

WebUI.selectOptionByValue(findTestObject('Page_Glexindo Marketplace/select_Pengiriman LautKargo Ud'), 'express', true)

WebUI.selectOptionByValue(findTestObject('Page_Glexindo Marketplace/select_Pengiriman LautKargo Ud'), 'air-cargo', true)

WebUI.setText(findTestObject('Page_Glexindo Marketplace/textarea_Persyaratan Lainnya_f'), 'dengan karung')

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Mulai Beli (1)'))

WebUI.navigateToUrl('http://d3v5.glexindo.com/newui/id/backend/order/panel#381')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_Mulai Beli'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/button_Beli Produk'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_US_form-control'), '5.00')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/select_FOBCFRCIFEXWFASCIPFCACP'), 
    'fob', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/select_-- Pilih Jenis Pembayar'), 
    'cash', true)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/button_Beli Produk'))

WebUI.acceptAlert()

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/select_-- Pilih Jenis Pembayar'), 
    'creditcard', true)

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/label_Layanan'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/button_Beli Produk'))

WebUI.acceptAlert()

WebUI.closeBrowser()

