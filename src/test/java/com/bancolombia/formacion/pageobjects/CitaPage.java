package com.bancolombia.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class CitaPage extends PageObject {
	
	@FindBy(id = "datepicker")
	public WebElement campoFecha;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='*'])[2]/following::input[1]")
	public WebElement identificacionDoctor;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='*'])[3]/following::input[1]")
	public WebElement identificacionPaciente;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Observaciones'])[1]/following::textarea[1]")
	public WebElement Observaciones;
	
	@FindBy(linkText = "Guardar")
	public WebElement botonGuardar;
	
	@FindBy (xpath ="(.//*[normalize-space(text()) and normalize-space(.)='Error:'])[1]/following::span[1]")
	public WebElement textoConfirmacionDoctor;
	
	@FindBy (xpath ="(.//*[normalize-space(text()) and normalize-space(.)='Error:'])[1]/following::span[2]")
	public WebElement textoConfirmacionPaciente;
			
	@FindBy (xpath ="(.//*[normalize-space(text()) and normalize-space(.)='Guardado:'])[1]/following::p[1]")
	public WebElement textoConfirmacionCita;
	
	
	

}
