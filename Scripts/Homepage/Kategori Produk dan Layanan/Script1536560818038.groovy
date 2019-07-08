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

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Sumber daya alam'))

WebUI.click(findTestObject('Page_Jual minerals - Glexindo Marke/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Pakaian'))

WebUI.click(findTestObject('Page_Jual apparels - Glexindo Marke/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Otomotif'))

WebUI.click(findTestObject('Page_Jual automotives - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Elektronik'))

WebUI.click(findTestObject('Page_Jual electronics - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Mesin'))

WebUI.click(findTestObject('Page_Jual machineries - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Kecantikan  Perawatan Pribad'))

WebUI.click(findTestObject('Object Repository/Page_Jual beauty-personal-care - Gl/a_Produk_custom-logo-link'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Pertanian'))

WebUI.click(findTestObject('Page_Jual foods - Glexindo Marketpl/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Rumah  Taman'))

WebUI.click(findTestObject('Page_Jual home-garden - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Aksesoris'))

WebUI.click(findTestObject('Page_Jual accessories - Glexindo Ma/img_Produk_logo-head'))


