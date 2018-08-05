package com.bancolombia.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/ycastillo/")
public class HomePage extends PageObject {
	@FindBy(linkText = "Agregar Doctor")
	public WebElement menuAgregarDoctor;
	
	@FindBy(linkText = "Agregar Paciente")
	public WebElement menuAgregarPaciente;

	@FindBy(linkText = "Agendar Cita")
	public WebElement menuAgendarCita;
}
