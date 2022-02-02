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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.waitForElementPresent(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/svg'), 2)

WebUI.setText(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/input_Enter your email_username'), 
    GlobalVariable.Invalid_Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/input_Enter your password_password'), 
    GlobalVariable.Valid_Password)

WebUI.verifyElementClickable(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/button_Login'))

WebUI.click(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/button_Login'))

String error_Message = WebUI.getText(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/div_Bad username or password'), 
    FailureHandling.STOP_ON_FAILURE)

println(error_Message)

WebUI.closeBrowser()

