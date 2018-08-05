package com.bancolombia.formacion.definition;

import java.util.List;

import com.bancolombia.formacion.models.Cita;
import com.bancolombia.formacion.steps.AgendarCitaSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgendarCitaDefinition {

	@Steps
	AgendarCitaSteps agendarCita;

	
	
	@When("^ingreso los datos de la cita a agendar$")
	public void ingresoLosDatosDeLaCitaAAgendar(List<Cita> cita) {
		agendarCita.agendarCita(cita);
	    
	}

	@Then("^confirmo que haya quedado agendada la cita$")
	public void confirmoQueHayaQuedadoAgendadaLaCita()  {
	   
	}
	
	@Then("^confirmo que no haya quedado agendada la cita$")
	public void confirmoQueNoHayaQuedadoAgendadaLaCita() {
	   
	}
	
}
