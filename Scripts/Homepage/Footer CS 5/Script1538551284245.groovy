import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Feedback'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input__first-name'), 'andro')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input__last-name'), 'meda')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Subyek_subject'), 'test jurun')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/textarea_Pesan Anda_your-messa'), 'test memerikan masukan')

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Kirim Pesan'))

WebUI.closeBrowser()

