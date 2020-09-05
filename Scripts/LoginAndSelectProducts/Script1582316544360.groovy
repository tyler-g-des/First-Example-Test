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
import org.openqa.selenium.Keys as Keys

//SIGNIN PAGE
WebUI.openBrowser(GlobalVariable.url) //Abre el navegador con la URL de la página web
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/1_TextoLogin')) //Verifica si es la página de login
CustomKeywords.'entidad.OpcionComun.escribirTexto'(findTestObject('Object Repository/SignIn Page/Username'), findTestData("Test Data").getValue(1, 1)) //Ingresa el usuario (columna, fila)
CustomKeywords.'entidad.OpcionComun.escribirTextoEncriptado'(findTestObject('Object Repository/SignIn Page/Password'), findTestData("Test Data").getValue(2, 1)) //Ingresa la contraseña
WebUI.takeScreenshot('foto1.png')
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/SignIn Page/SigninBtn')) //Clic en el botón para iniciar sesión
//De esta forma se llaman métodos directamente, sin usar CustomKeywords
//WebUI.setText(findTestObject('Object Repository/SignIn Page/Username'), "Tyler Diaz") //Ingresa el usuario
//WebUI.setEncryptedText(findTestObject('Object Repository/SignIn Page/Password'), "Pass123") //Ingresa la contraseña
//WebUI.click(findTestObject('Object Repository/SignIn Page/SigninBtn')) //Clic en el botón para iniciar sesión

//SELECT ITEMS PAGE
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/2_TextoSeleccionarProductos')) //Verifica si es la página donde se seleccionan los productos
//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductType')) //Clic en la lista de tipo de producto
WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductType'), findTestData("Test Data").getValue(3, 1), false) //Selecciona la opción con el texto "Beverages"
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductsList')) //Clic en la lista de productos
WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductsList'), findTestData("Test Data").getValue(4, 1), false) //Selecciona la opción con el texto "Ipoh Coffee"W
//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnViewDetails')) //Clic en el botón View Details
//
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/3_BotonOrder')) //Verifica si es la página del detalle del producto, donde se ordena
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnOrder')) //Clic en el botón Order
//
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/4_OrderProducts')) //Verifica si es la página donde salen los items en el carrito
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/HomeLink')) //Clic en el botón Home
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/2_TextoSeleccionarProductos')) //Verifica si es la página donde se seleccionan los productos

//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductType')) //Clic en la lista de tipo de producto
WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductType'), findTestData("Test Data").getValue(3, 1), false) //Selecciona la opción con el texto "Beverages"
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductsList')) //Clic en la lista de productos
WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductsList'), findTestData("Test Data").getValue(4, 2), false) //Selecciona la opción con el texto "Outback Lager"
//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnViewDetails')) //Clic en el botón View Details
//
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/3_BotonOrder')) //Verifica si es la página del detalle del producto, donde se ordena
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnOrder')) //Clic en el botón Order
//
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/4_OrderProducts')) //Verifica si es la página donde salen los items en el carrito
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/HomeLink')) //Clic en el botón Home
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/2_TextoSeleccionarProductos')) //Verifica si es la página donde se seleccionan los productos

//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductType')) //Clic en la lista de tipo de producto
WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductType'), findTestData("Test Data").getValue(3, 1), false) //Selecciona la opción con el texto "Beverages"
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductsList')) //Clic en la lista de productos
WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductsList'), findTestData("Test Data").getValue(4, 3), false) //Selecciona la opción con el texto "Chai"
//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnViewDetails')) //Clic en el botón View Details
//
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/3_BotonOrder')) //Verifica si es la página del detalle del producto, donde se ordena
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnOrder')) //Clic en el botón Order
//
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/4_OrderProducts')) //Verifica si es la página donde salen los items en el carrito
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/HomeLink')) //Clic en el botón Home
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/2_TextoSeleccionarProductos')) //Verifica si es la página donde se seleccionan los productos

//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductType')) //Clic en la lista de tipo de producto
WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductType'), findTestData("Test Data").getValue(3, 2), false) //Selecciona la opción con el texto "Seasonings"
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductsList')) //Clic en la lista de productos
WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductsList'), findTestData("Test Data").getValue(4, 4), false) //Selecciona la opción con el texto "Genen Shouyu"
//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnViewDetails')) //Clic en el botón View DetailsThread.sleep(3000) //Espera 3 segundos
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/3_BotonOrder')) //Verifica si es la página del detalle del producto, donde se ordena
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnOrder')) //Clic en el botón Order
//
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/4_OrderProducts')) //Verifica si es la página donde salen los items en el carrito
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/HomeLink')) //Clic en el botón Home
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/2_TextoSeleccionarProductos')) //Verifica si es la página donde se seleccionan los productos

//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductType')) //Clic en la lista de tipo de producto
WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductType'), findTestData("Test Data").getValue(3, 2), false) //Selecciona la opción con el texto "Seasonings"
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/ProductsList')) //Clic en la lista de productos
CustomKeywords.'entidad.OpcionComun.elegirElemento'(findTestObject('Object Repository/Select Items Page/ProductsList'), findTestData("Test Data").getValue(4, 5), false)
//WebUI.selectOptionByLabel(findTestObject('Object Repository/Select Items Page/ProductsList'), gulaMalacca, false) //Selecciona la opción con el texto "Gula Malacca"
//
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnViewDetails')) //Clic en el botón View Details
//
CustomKeywords.'entidad.OpcionComun.objetoPresente'(findTestObject('Object Repository/Present Objects/3_BotonOrder')) //Verifica si es la página del detalle del producto, donde se ordena
CustomKeywords.'entidad.OpcionComun.darClick'(findTestObject('Object Repository/Select Items Page/BtnOrder')) //Clic en el botón Order

//