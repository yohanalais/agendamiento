package com.bancolombia.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PacientePage extends PageObject {
	@FindBy(name = "name")
	public WebElement campoNombre;
	
	@FindBy(name = "last_name")
	public WebElement campoApellido;
	
	@FindBy(name = "telephone")
	public WebElement campoTelefono;
	
	@FindBy(name = "identification_type")
	public WebElement campoTipoIdentificacion;
	
	@FindBy(name = "identification")
	public WebElement campoIdentificacion;
	
	@FindBy(name = "prepaid")
	public WebElement checkMedicinaPrepagada;
	
	@FindBy(linkText = "Guardar")
	public WebElement botonGuardar;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Guardado:'])[1]/following::p[1]")
	public WebElement textoConfirmacion;

}
