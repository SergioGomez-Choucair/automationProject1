#Author: Carlos
@stories
  Feature: Gestionar Cita Médica

@scenario1
    Scenario Outline: Como paciente
              Quiero realizar la solicitud de una cita médica
              A través del sistema de Administración de Hospitales

    Given que Carlos necesita registrar un nuevo doctor
    When el realiza el registro del mismo en el aplicativo de Administración de Hospitales
    |nombres   |apellidos      |telefono  |
    |<nombres> |<apellidos>    |<telefono>|
    Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente
    |mensaje  |
    |<mensaje>|

    Examples:
      |nombres  |apellidos      |telefono  |mensaje                       |
      |Pablo    |Perez          |3102345567|Datos guardados correctamente.|
      |Francisco|Jimenez        |3121235675|Datos guardados correctamente.|

@scenario2
    Scenario Outline: Realizar el Registro de un Paciente

    Given que Carlos necesita registrar un nuevo paciente
    When el realiza el registro del paciente en el aplicativo de Administración de Hospitales
      |name     |lastName      |phone     |
      |<nombres>|<apellidos>   |<telefono>|
    Then el verifica que se muestre en pantalla el mensaje Datos guardados correctamente.

    Examples:
      |nombres  |apellidos      |telefono  |
      |Luis     |Gonzalez       |3102342567|
      |Natalia  |Ramos          |3112345443|
