package com.bancolombia.formacion.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.fluentlenium.core.annotation.Page;

import com.bancolombia.formacion.models.Cita;
import com.bancolombia.formacion.pageobjects.CitaPage;
import com.bancolombia.formacion.pageobjects.HomePage;

public class AgendarCitaSteps {
	@Page
	HomePage home;

	@Page
	CitaPage citaObject;

	public void agendarCita(List<Cita> cita) {
		home.menuAgendarCita.click();
		citaObject.campoFecha.sendKeys(cita.get(0).fecha());
		citaObject.identificacionPaciente.sendKeys(cita.get(0).getDocumentoPaciente());
		citaObject.identificacionDoctor.sendKeys(cita.get(0).getDocumentoDoctor());
		citaObject.Observaciones.sendKeys(cita.get(0).getObservacionesCita());
		citaObject.botonGuardar.click();

	}

	public void confirmoQueNoHayaQuedadoAgendadaLaCita() {

		String textoConfirmacionDoctor = citaObject.textoConfirmacionDoctor.getText().trim();

		assertTrue("El mensaje de confirmacion es incorrecto", textoConfirmacionDoctor
				.equals("*El campo 'Documento de identidad' no se encuentra entre nuestros doctores. "));

		assertTrue("El mensaje de confirmacion es incorrecto", textoConfirmacionDoctor
				.equals("*El campo 'Documento de identidad' no se encuentra entre nuestros doctores. "));

	}
	
	public void confirmoQueHayaQuedadoAgendadaLaCita() {
		
		String textoConfirmacionCita= citaObject.textoConfirmacionCita.getText().trim();
		assertTrue("El mensaje de confirmacion es incorrecto", textoConfirmacionCita
				.equals("Datos guardados correctamente. "));
		
	}

}
