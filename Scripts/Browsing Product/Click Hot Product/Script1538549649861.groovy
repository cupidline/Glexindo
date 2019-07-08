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

WebUI.click(findTestObject('Page_Glexindo Marketplace/img_Kopi Luwak_img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_One Set Female Apparel - Glexi/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/img_Satu Set Pakaian Remaja_im'))

WebUI.click(findTestObject('Object Repository/Page_Palm Kernel Oil - Glexindo Mar/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/img_Minyak Kernel Sawit_img-fl'))

WebUI.click(findTestObject('Object Repository/Page_Shell Isoprene Rubber - Glexin/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/img_Minyak Bunga Matahari_img-'))

WebUI.click(findTestObject('Object Repository/Page_Lignite Coal - Glexindo Market/img_Produk_logo-head'))

WebUI.closeBrowser()

