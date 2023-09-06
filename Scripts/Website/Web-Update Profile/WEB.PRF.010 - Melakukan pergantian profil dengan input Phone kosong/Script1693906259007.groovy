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

WebUI.navigateToUrl('https://demo-app.online/')

WebUI.click(findTestObject('Object Repository/Page_Coding.id - Halaman Utama/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Coding.id - Login/input_Email_email'), 'rifkiauliairawan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Coding.id - Login/input_Kata                                 _98da12'), 
    'JCmwKw2VXH/Exv650Bd5PA==')

WebUI.click(findTestObject('Object Repository/Page_Coding.id - Login/button_Login'))

WebUI.navigateToUrl('https://demo-app.online/dashboard/profile/edit')

WebUI.setText(findTestObject('Object Repository/Page_Coding.ID - Update Profile/input_Fullname_name'), 'New John')

WebUI.setText(findTestObject('Object Repository/Page_Coding.ID - Update Profile/input_Phone_whatsapp'), '')

WebUI.setText(findTestObject('Object Repository/Page_Coding.ID - Update Profile/input_BirthDay_birth_date'), '18-Apr-1925')

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Update Profile/div_Fullname                               _a7cccf'))

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Update Profile/button_Save Changes'))

WebUI.verifyElementText(findTestObject('Page_Coding.ID - Update Profile/strong_The whatsapp field is required'), 'The whatsapp field is required.')

WebUI.closeBrowser()

