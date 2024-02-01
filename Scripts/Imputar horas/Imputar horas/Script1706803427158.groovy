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

WebUI.click(findTestObject('Page_Oorden/Imputacion/a_Agregar tiempo'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Oorden/Imputacion/input__horas'))

WebUI.setText(findTestObject('Page_Oorden/Imputacion/input__horas'), '8')

WebUI.click(findTestObject('Page_Oorden/Imputacion/textarea__descripcionProyecto'))

WebUI.setText(findTestObject('Page_Oorden/Imputacion/textarea__descripcionProyecto'), 'Test Katalon')

WebUI.click(findTestObject('Page_Oorden/Imputacion/Page_Oorden - El ERP Inteligente/div_Lyntia_08339_AGILE_2024  Enero traspaso proyecto Inetum'))

WebUI.setText(findTestObject('Page_Oorden/Imputacion/input__proyecto'), 'Lyntia_08339')

WebUI.sendKeys(findTestObject('Page_Oorden/Imputacion/input__proyecto'), Keys.chord(Keys.ENTER))

