package entidad

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class OpcionComun {
	//Método que valida si el objeto está presente y luego da clic sobre el mismo
	@Keyword
	def darClick(TestObject object)
	{
		if(WebUI.verifyElementPresent (object, 3, FailureHandling.STOP_ON_FAILURE) == true) //Si no se encuentra el elemento entonces da error en el log
		{
			WebUI.click(object)
		}
	}

	//Método que valida si el objeto está presente y luego escribe el texto
	@Keyword
	public void escribirTexto(TestObject object, String string2)
	{
		if(WebUI.verifyElementPresent (object, 3, FailureHandling.STOP_ON_FAILURE) == true)
		{ //Si no se encuentra el elemento entonces da error en Katalon
			WebUI.setText(object, string2)
		}
	}

	//Método que valida si el objeto está presente y luego escribe el texto encriptado (en el caso de la contraseña)
	@Keyword
	public void escribirTextoEncriptado(TestObject object, String string2)
	{
		if(WebUI.verifyElementPresent (object, 3, FailureHandling.STOP_ON_FAILURE) == true)
		{ //Si no se encuentra el elemento entonces da error en Katalon
			WebUI.setEncryptedText(object, string2)
		}
	}

	@Keyword
	public void elegirElemento(TestObject object, String string, boolean booleanValue)
	{
		WebUI.selectOptionByLabel(object, string, booleanValue)
		//True if value is regular expression or false if not.
	}

	//Método que verifica si un objeto en específico está presente, este elemento será único dentro de cada página y de esa
	//forma se podrá saber si se accedió a la página correcta o no, si no es así, Katalon mostrará un error en el log
	@Keyword
	public void objetoPresente(TestObject object)
	{
		if(WebUI.verifyElementPresent (object, 3, FailureHandling.STOP_ON_FAILURE) == true)
		{
			KeywordLogger log = new KeywordLogger()
			log.logInfo("La página a la que se ha accedido es correcta")
		}
	}

	//Este método espera a que un elemento esté presente
	@Keyword
	public void esperaObjetoPresente(TestObject object)
	{
		WebUI.waitForElementPresent(object, 5); //Da 5 segundos para que espera a que el elemento esté presente
	}

	// someter la trasaccion
	//rechazo de la trasaccion
	//confirmacion de la trasaccion
}