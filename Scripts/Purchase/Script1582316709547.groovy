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

CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/4_OrderProducts')) //Verifica si es la página donde salen los items en el carrito
WebUI.takeScreenshot('C:\\Users\\tyler.diaz\\Downloads\\5_OrderDetailPage.png')

//CART PAGE
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Cart Page/BtnEditCart')) //Clic en el botón de editar el carrito
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/5_TextoOrderDetails')) //Verifica si el texto de Place Your Order está presente
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Cart Page/BtnNext')) //Clic en el botón Next

//PERSONAL INFO PAGE
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/6_TextoDatosPersonales')) //Verifica si el texto de la página donde pide los datos personales está presente
//Billing Address
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/FirstName1'), findTestData("Test Data").getValue(6, 1))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/LastName1'), findTestData("Test Data").getValue(6, 2))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/CompanyName1'), findTestData("Test Data").getValue(6, 3))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/StreetAddress1'), findTestData("Test Data").getValue(6, 4))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/ZipCode1'), findTestData("Test Data").getValue(6, 5))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/AreaCode'), findTestData("Test Data").getValue(6, 6))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/PrimaryPhone'), findTestData("Test Data").getValue(6, 7))

//Shipping Address
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/FirstName2'), findTestData("Test Data").getValue(7, 1))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/LastName2'), findTestData("Test Data").getValue(7, 2))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/CompanyName2'), findTestData("Test Data").getValue(7, 3))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/StreetAddress2'), findTestData("Test Data").getValue(7, 4))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/ZipCode2'), findTestData("Test Data").getValue(7, 5))
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Personal Info Page/EmailAddress'), findTestData("Test Data").getValue(7, 6))

CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Personal Info Page/BtnNextAfterAddresses')) //Clic en el botón Next

//PAYMENT INFO PAGE
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/7_TextoDatosPago')) //Verifica si el texto de la página donde pide los datos de pago está presente
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Payment Info Page/CardType')) //Clic en la lista de card type
WebUI.selectOptionByLabel(findTestObject('Object Repository/Payment Info Page/CardType'), findTestData("Test Data").getValue(8, 1), false) //Selecciona la opción con el texto "Visa"
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Payment Info Page/SecurityCode'), findTestData("Test Data").getValue(8, 2)) //Ingresa el security code
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/Payment Info Page/CardNumber'), findTestData("Test Data").getValue(8, 3)) //Ingresa el cardNumber
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Payment Info Page/ExpirationMonth')) //Clic en la lista de expiration month
WebUI.selectOptionByLabel(findTestObject('Object Repository/Payment Info Page/ExpirationMonth'), findTestData("Test Data").getValue(8, 4), false) //Selecciona la opción con el texto "June"
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Payment Info Page/ExpirationYear')) //Clic en la lista de expiration year
WebUI.selectOptionByLabel(findTestObject('Object Repository/Payment Info Page/ExpirationYear'), findTestData("Test Data").getValue(8, 5), false) //Selecciona la opción con el texto "2014"

CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Payment Info Page/BtnSubmitAfterPayment')) //Clic en el botón submit

CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/8_TextoOrdenExitosa')) //Verifica si el texto de orden exitosa

WebUI.closeBrowser()