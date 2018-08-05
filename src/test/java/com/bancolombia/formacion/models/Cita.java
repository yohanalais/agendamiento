package com.bancolombia.formacion.models;

public class Cita {
	private String fecha;
	private String documentoPaciente;
	private String documentoDoctor;
	private String observaciones;

	public String fecha() {
		return fecha;
	}

	public String getDocumentoPaciente() {
		return documentoPaciente;
	}

	public String getDocumentoDoctor() {
		return documentoDoctor;
	}

	public String getObservacionesCita() {
		return observaciones;
	}

}
