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

WebUI.click(findTestObject('Page_Glexindo Marketplace/a_Masuk (2)'))

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Account_username (3)'), 'company01')

WebUI.setText(findTestObject('Page_Glexindo Marketplace/input_Password_password (4)'), '123456')

WebUI.click(findTestObject('Page_Glexindo Marketplace/input_Ingat Account saya_remem (2)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/button_Login (3)'))

WebUI.click(findTestObject('Page_Glexindo Marketplace/span_Login'))

WebUI.delay(5)

WebUI.navigateToUrl('http://d3v5.glexindo.com/newui/id/backend/dashboard')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/span_Produk saya'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/a_ Add Product'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_Nama Produk_name'), 'test barang')

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/textarea_Harap isi form_short_'), 'barang baru')

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_Visibilitas_select2-sear'), 'free user')

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_Visibilitas_select2-sear'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input__select2-search__field'), 'silver')

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input__select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.sendKeys(findTestObject('Page_Glexindo Marketplace - Dashboa/input__select2-search__field'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Page_Glexindo Marketplace - Dashboa/input__select2-search__field'), Keys.chord(Keys.TAB))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_Save_select2-search__fie'), Keys.chord(
        Keys.ENTER))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_Save_select2-search__fie'), 'karet')

WebUI.sendKeys(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_Save_select2-search__fie'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_Pesanan Minimum_minimum_'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_Persediaan unit_stock_un'), '1000')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/label_Fixed Price'))

WebUI.setText(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/input_Harap isi form_form-cont'), '10')

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/button_Publikasikan Produk'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/button_Publikasikan Produk'))

WebUI.click(findTestObject('Object Repository/Page_Glexindo Marketplace - Dashboa/button_Simpan ke Draf'))

