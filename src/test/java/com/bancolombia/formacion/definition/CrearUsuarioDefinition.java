package com.bancolombia.formacion.definition;

import java.util.List;


import com.bancolombia.formacion.models.Persona;
import com.bancolombia.formacion.steps.CrearUsuarioSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearUsuarioDefinition {
	@Steps
	CrearUsuarioSteps crearUsuario;

	@Given("^Ingreso a la aplicacion del hospital$")
	public void ingresoALaAplicacionDelHospital() {
		crearUsuario.ingresoAlaAplicacionDelHospital();
	}

	@When("^ingreso los datos del medico del hospital$")
	public void ingresoLosDatosDelMedicoDelHospital(List<Persona> persona) {
		crearUsuario.ingresoLosDatosDelMedicoDelHospital(persona);
	}

	@Then("^confirmo que se haya creado$")
	public void confirmoQueSeHayaCreado() {
		crearUsuario.confirmoQueSeHayaCreado();
	}

	@When("^ingreso los datos del paciente del hospital$")
	public void ingresoLosDatosDelPacienteDelHospital(List<Persona> persona) {
		crearUsuario.ingresoLosDatosDelPacienteDelHospital(persona);
	}

	@Then("^confirmo que se haya creado el paciente$")
	public void confirmoQueSeHayaCreadoElPaciente() {
		crearUsuario.confirmoQueSeHayaCreadoElPaciente();
	}
	
	
}
