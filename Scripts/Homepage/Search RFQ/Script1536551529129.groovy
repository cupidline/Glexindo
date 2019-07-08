import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Produk (1)'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_RFQ'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea (1)'), 'perusahaan')

WebUI.sendKeys(findTestObject('Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Account_username'), 'kmz.in.act@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Password_password'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Jual perusahaan - Glexindo Mar/a_RFQ saya'))

WebUI.delay(3)

WebUI.closeBrowser()

