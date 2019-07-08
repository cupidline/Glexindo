import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Produk'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Perusahaan'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), 'seg')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Menampilkan seg - Glexindo Mar/button_Lihat Perusahaan'))

