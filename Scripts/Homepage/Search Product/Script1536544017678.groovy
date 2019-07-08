import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Produk'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Produk'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), 'oil')

WebUI.sendKeys(findTestObject('Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.closeBrowser()

