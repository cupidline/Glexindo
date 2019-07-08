import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.*
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/button_Produk'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Perusahaan'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), 'glexindo')

WebUI.sendKeys(findTestObject('Page_Glexindo Marketplace/input_Dibuat dengan Sketsa_sea'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

