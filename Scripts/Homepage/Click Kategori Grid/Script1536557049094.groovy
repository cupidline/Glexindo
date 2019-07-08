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

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/img'))

WebUI.click(findTestObject('Object Repository/Page_Jual minerals - Glexindo Marke/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/img_1'))

WebUI.click(findTestObject('Object Repository/Page_Jual agriculture - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Mesin (2)'))

WebUI.click(findTestObject('Object Repository/Page_Jual machineries - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/div_Elektronik'))

WebUI.click(findTestObject('Object Repository/Page_Jual electronics - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Automotif (2)'))

WebUI.click(findTestObject('Object Repository/Page_Jual automotives - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Apparels (2)'))

WebUI.click(findTestObject('Object Repository/Page_Jual apparels - Glexindo Marke/a_Produk_custom-logo-link'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/a_Aksesoris (1)'))

WebUI.click(findTestObject('Object Repository/Page_Jual accessories - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/div_Aksesoris_d-flex justify-c'))

WebUI.click(findTestObject('Object Repository/Page_Jual home-garden - Glexindo Ma/img_Produk_logo-head'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace/div_Perawatan Kecantikan  Prib'))

WebUI.closeBrowser()

