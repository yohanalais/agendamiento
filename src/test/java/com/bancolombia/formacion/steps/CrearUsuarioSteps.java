package com.bancolombia.formacion.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.fluentlenium.core.annotation.Page;

import com.bancolombia.formacion.models.Persona;
import com.bancolombia.formacion.pageobjects.DoctorPage;
import com.bancolombia.formacion.pageobjects.HomePage;
import com.bancolombia.formacion.pageobjects.PacientePage;

public class CrearUsuarioSteps {
	@Page
	HomePage home;

	@Page
	DoctorPage doctorPage;

	@Page
	PacientePage pacientePage;

	public void ingresoAlaAplicacionDelHospital() {
		home.open();
	}

	public void ingresoLosDatosDelMedicoDelHospital(List<Persona> persona) {
		home.menuAgregarDoctor.click();
		doctorPage.campoNombre.sendKeys(persona.get(0).getNombre());
		doctorPage.campoApellido.sendKeys(persona.get(0).getApellido());
		doctorPage.campoTelefono.sendKeys(persona.get(0).getTelefono());
		doctorPage.campoTipoIdentificacion.sendKeys(persona.get(0).getTipoDocumento());
		doctorPage.campoIdentificacion.sendKeys(persona.get(0).getNumeroDocumento());
		doctorPage.botonGuardar.click();
	}

	public void confirmoQueSeHayaCreado() {
		String textoConfirmacion = doctorPage.textoConfirmacion.getText().trim();

		assertTrue("No fue creado el médico correctamente", textoConfirmacion.equals("Datos guardados correctamente."));
	}

	public void ingresoLosDatosDelPacienteDelHospital(List<Persona> persona) {
		home.menuAgregarPaciente.click();
		pacientePage.campoNombre.sendKeys(persona.get(0).getNombre());
		pacientePage.campoApellido.sendKeys(persona.get(0).getApellido());
		pacientePage.campoTelefono.sendKeys(persona.get(0).getTelefono());
		pacientePage.campoTipoIdentificacion.sendKeys(persona.get(0).getTipoDocumento());
		pacientePage.campoIdentificacion.sendKeys(persona.get(0).getNumeroDocumento());
		pacientePage.checkMedicinaPrepagada.click();
		pacientePage.botonGuardar.click();

	}

	public void confirmoQueSeHayaCreadoElPaciente() {
		String textoConfirmacion = pacientePage.textoConfirmacion.getText().trim();

		assertTrue("No fue creado el médico correctamente", textoConfirmacion.equals("Datos guardados correctamente."));

	}

	
}
