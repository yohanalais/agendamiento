package com.bancolombia.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/crear_nueva_cita.feature",
	//	tags = "@tag4",
		snippets = SnippetType.CAMELCASE,
		glue = "com.bancolombia.formacion.definition")
public class RunnerTags {
 
}
