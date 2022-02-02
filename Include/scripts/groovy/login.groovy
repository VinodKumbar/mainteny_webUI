import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {

	@Given("I want login to Mainteny Website")
	def loginURL() {
		WebUI.openBrowser(GlobalVariable.URL)

		WebUI.maximizeWindow()

		WebUI.deleteAllCookies()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/svg'),
				2)
	}

	@When("I enter the valid user name &  password click on the Login button")
	def loginCreds() {
		WebUI.setText(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/input_Enter your email_username'),
				GlobalVariable.Valid_Username)

		WebUI.setEncryptedText(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/input_Enter your password_password'),
				GlobalVariable.Valid_Password)

		WebUI.verifyElementClickable(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/button_Login'))

		WebUI.click(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/button_Login'))
	}


	@Then("I will be navigated to Mainteny Dashboard page")
	def dashboard() {
		WebUI.verifyElementText(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/span_Dashboard'),
				'Dashboard')

		WebUI.verifyElementText(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/div_Martin Lundquist'),
				'Martin Lundquist')

		WebUI.verifyElementClickable(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/div_ML'))

		WebUI.click(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/div_ML'))

		WebUI.click(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/span_Logout'))

		WebUI.navigateToUrl('https://staging.mainteny.com/auth/login')

		WebUI.verifyElementText(findTestObject('Object Repository/Login Page/Page_Mainteny - Service Manager Portal/Page_Mainteny - Service Manager Portal/div_Login'),
				'Login')

		WebUI.closeBrowser()
	}
}