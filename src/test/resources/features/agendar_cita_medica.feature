#Author: Carlos
@stories
  Feature: Gestionar Cita Médica
@scenario1
    Scenario Outline: Como paciente
              Quiero realizar la solicitud de una cita médica
              A través del sistema de Administración de Hospitales

    Given que Carlos necesita registrar un nuevo doctor
    When el realiza el registro del mismo en el aplicativo de Administración de Hospitales
    |nombres   |apellidos      |telefono  |numero_documento  |
    |<nombres> |<apellidos>    |<telefono>|<numero_documento>|
    Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente
    |mensaje  |
    |<mensaje>|
    Examples:
      |nombres  |apellidos      |telefono  |numero_documento       |mensaje                      |
      |Pablo    |Perez          |3102345567|1013234560             |Datos guardados correctamente.|

@scenario2
    Scenario: Realizar el Registro de un Paciente
      Given que Carlos necesita registrar un nuevo paciente
      When el realiza el registro del paciente en el aplicativo de Administración de Hospitales
        |name   |lastName      |phone     |
        |Juan   | Lopez        |3124567897|
      Then el verifica que se muestre en pantalla el mensaje Datos guardados correctamente.