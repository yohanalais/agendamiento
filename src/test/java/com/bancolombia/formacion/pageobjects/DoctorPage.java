package com.bancolombia.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class DoctorPage extends PageObject {
	@FindBy(id = "name")
	public WebElement campoNombre;

	@FindBy(id = "last_name")
	public WebElement campoApellido;

	@FindBy(id = "telephone")
	public WebElement campoTelefono;

	@FindBy(id = "identification_type")
	public WebElement campoTipoIdentificacion;

	@FindBy(id = "identification")
	public WebElement campoIdentificacion;

	@FindBy(linkText = "Guardar")
	public WebElement botonGuardar;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Guardado:'])[1]/following::p[1]")
	public WebElement textoConfirmacion;	
	
}
