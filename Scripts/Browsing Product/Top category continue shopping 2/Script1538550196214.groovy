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

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/img_Lanjut berbelanja_img-flui (2)'))

WebUI.click(findTestObject('Page_Lignite Coal - Glexindo Market/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/img_ Ton_img-fluid'))

WebUI.click(findTestObject('Page_SIR 10 - Glexindo Marketplace/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/img_ Kilogram_img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_Almond Oil - Glexindo Marketpl/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/img_ Satuan_img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_Pale Crepe Rubber - Glexindo M/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/i_Lanjut berbelanja_tm tm-arro'))

WebUI.delay(3)

WebUI.closeBrowser()

