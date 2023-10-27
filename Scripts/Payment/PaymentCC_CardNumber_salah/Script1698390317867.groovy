import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://payment.page/templates/agency/')

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_YOUR INFORMATION_email_address (2)'), 'trial@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_Email Address_first_name (1)'), 'trial')

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_First Name_last_name (2)'), 'name')

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_cardnumber (2)'), '4242 4242 4242 1234')

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_exp-date (2)'), '11 / 25')

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_cvc (2)'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_CVC_card_zip_code (2)'), '23456')

WebUI.closeBrowser()

