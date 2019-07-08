import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Telusuri Layanan'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Promosi Tur'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Jual tour-promotion - Glexindo/label_Indonesia'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Jual tour-promotion - Glexindo/label_Platinum'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Jual tour-promotion - Glexindo/label_Dibawah Rp 10 Milyar'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Jual tour-promotion - Glexindo/label_BRC'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min'), '10')

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min_1'), '1')

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min_2'), '10')

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min_3'), '100')

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min_4'), '100')

WebUI.click(findTestObject('Page_Jual tour-promotion - Glexindo/button_Filter'))

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min'), '-1')

WebUI.click(findTestObject('Page_Jual tour-promotion - Glexindo/button_Filter'))

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min'), '100')

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min_5'), '0')

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min_6'), '0')

WebUI.click(findTestObject('Page_Jual tour-promotion - Glexindo/button_Filter'))

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min_7'), '1000')

WebUI.setText(findTestObject('Page_Jual tour-promotion - Glexindo/input_Filter menurut Harga_min_8'), '1000')

WebUI.click(findTestObject('Page_Jual tour-promotion - Glexindo/button_Filter'))

WebUI.closeBrowser()

