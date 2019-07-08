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

WebUI.navigateToUrl(GlobalVariable.URLdefault)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Telusuri Produk'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Karet'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/label_Indonesia'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/label_Platinum'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/label_Dibawah Rp 10 Milyar'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/label_BRC'))

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min'), '10')

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/button_Filter'))

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_1'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_2'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_3'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_4'), 
    '100')

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/button_Filter'))

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_5'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_6'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/button_Filter'))

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_7'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_8'), 
    '100')

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/button_Filter'))

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min'), '0')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_9'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_10'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_11'), 
    '10000')

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/button_Filter'))

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min'), '-1')

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/button_Filter'))

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_12'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_13'), 
    '-1')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_14'), 
    '-1')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min'), '0')

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/button_Filter'))

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_15'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_16'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/input_Filter menurut Harga_min_17'), 
    '0')

WebUI.click(findTestObject('Object Repository/Page_Jual rubber - Glexindo Marketp/button_Filter'))

WebUI.closeBrowser()

