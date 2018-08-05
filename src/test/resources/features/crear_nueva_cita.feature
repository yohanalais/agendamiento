Feature: Agendar cita medica
  como paciente del hospital necesito tener la posibilidad de poder agendar una cita medica

  @tag1
  Scenario: Crear un doctor del hospital
    Given Ingreso a la aplicacion del hospital
    When ingreso los datos del medico del hospital
      | Nombre | Apellido | telefono   | numeroDocumento | tipoDocumento        |
      | Maria  | Perez    | 3002874653 |      1111111112 | Cédula de ciudadanía |
    Then confirmo que se haya creado

  @tag2
  Scenario: Crear un paciente del hospital
    Given Ingreso a la aplicacion del hospital
    When ingreso los datos del paciente del hospital
      | Nombre | Apellido | telefono   | numeroDocumento | tipoDocumento        |
      | Yohana | Castillo | 3128945647 |      2222222221 | Cédula de ciudadanía |
    Then confirmo que se haya creado el paciente

  @tag3
  Scenario: Agendar una cita con datos incorrectos
    Given Ingreso a la aplicacion del hospital
    When ingreso los datos de la cita a agendar
      | Fecha      | documentoPaciente | documentoDoctor | Observaciones         |
      | 08/21/2018 |        1094786573 |      1094755734 | Cita medicina general |
    Then confirmo que no haya quedado agendada la cita

  @tag4
  Scenario: Agendar una cita
    Given Ingreso a la aplicacion del hospital
    When ingreso los datos de la cita a agendar
      | Fecha      | documentoPaciente | documentoDoctor | Observaciones         |
      | 08/24/2018 |        1111111112 |      2222222221 | Cita medicina general |
    Then confirmo que haya quedado agendada la cita
