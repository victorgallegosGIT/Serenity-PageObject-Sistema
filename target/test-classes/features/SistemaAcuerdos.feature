Feature: Login And Altas

  Background:
    Given nos encontramos en la pagina principal de Sistema de Acuerdos
    When nos logueamos rellenando el modal con los siguientes datos: "VICTOR222" "abc"
    Then deberíamos visualizar el mensaje de bienvenida: "SISTEMA ACUERDOS"

  @AltaPerfiles
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar alta a un Perfil
    #ENTONCES
    When hacemos clic en alta and perfil
    Then deberíamos dirigirnos hacia la seccion: "Alta de Perfiles"
    And rellenamos el formulario con los siguientes datos: "<CodigoPerfil>" "<NombreDePerfil>" "<Delegacion>"
    And  le damos guadar perfil
    #Then deberíamos visualizar un alert exitoso que diga: "Perfil Cargado Correctamente!"


    Examples:
      | CodigoPerfil | NombreDePerfil | Delegacion |
      | User123      | Marciano        | SANTA FE |


  @AltaUsuarios
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar alta a un usuario
    #ENTONCES
    When hacemos clic en alta and usuario
    Then deberíamos dirigirnos ha la seccion: "Alta de Usuarios"
    And rellenamos el formulario con los siguientes datos: "<NameUser>" "<name>" "<apellido>" "<DNI>" "<Telefono>" "<direccion>" "<perfil>" "<contrasenia>"
    And le damos guardar usuario
    Then deberíamos visualizar un alert exitoso que diga: "Usuario Cargado Correctamente!"

    Examples:
      | NameUser | name | apellido | DNI       | Telefono | direccion | perfil        | contrasenia |
      | User124  | Alf  | Marciano | 551251279 | 07       | 1999      | administrador | 123         |
      #| User125  | Alf1 | Marciano1 | 5512512322 | 08       | 1998      | administrador | 123         |
      #| User126  | Alf2 | Marciano2 | 5512512323 | 09       | 1997      | administrador | 123         |

  @AltaTiposDeAcuerdo
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar alta tipo de acuerdo

    #ENTONCES
    When hacemos clic en alta and tipos de acuerdo
    Then debemos dirigirnos hacia la seccion: "Alta Tipos de Acuerdo"
    And rellenamos el formulario con los siguientes datos: "<Codigo>" "<TiposDeAcuerdo>"
    And le damos guardar tipo de acuerdo
    Then deberíamos visualizar un alert que diga: "Tipo Acuerdo cargado correctamente!"

    Examples:
      | Codigo   | TiposDeAcuerdo |
      | Codigo01 | Diario         |

  @AltaDelegaciones
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar Alta una Delegacion
    #ENTONCES
    When hacemos clic en alta and delegaciones
    Then deberíamos dirigirnos hasta la seccion: "Alta de Delegaciones"
    And rellenamos el form con los siguientes datos: "<CodigoDelegacion>" "<NombreDelegacion>"
    And le damos guardar delegacion
    Then deberíamos visualizar un alerta que diga: "Delegacion cargada correctamente!"

    Examples:
      | CodigoDelegacion | NombreDelegacion |
      | Delegacion       | Dele             |

  @AltaEstadoDeExpedientes
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar Alta de Estado de Expedientes
    #ENTONCES
    When hacemos clic en alta and estados de expedientes
    Then tenemos que dirigirnos hasta la seccion: "Alta de Estados de Expedientes"
    And rellenamos el formu con los siguientes datos: "<CodigoEstado>" "<NombreEstado>"
    And le damos guardar estados de expedientes
    Then debemos visualizar un alerta que diga: "Estado de expediente cargado correctamente!"

    Examples:
      | CodigoEstado | NombreEstado |
      | Estado01     | Estado01     |

  @BajaPerfil
  Scenario:
    #Como un usuario administrador
    #Quiero loguearme y realizar una Baja de Perfil (habiliar / Deshabilitar)
    #Siempre que un perfil no este asignado a ningun perfil
    #ENTONCES
    When hacemos clic en baja and perfiles
    Then observamos la seccion: "Baja de Perfiles"
    And hacemos clic en habilitar
    Then debemos ver un alerta que diga: "Perfil Habilitado"
    And hacemos clic en deshabilitar
    Then debemos ver nuevamente un alerta que diga: "Perfil Deshabilitado"

  @BajaUsuarios
  Scenario:
    #Como un usuario administrador
    #Quiero loguearme y realizar una Baja de Usuario (habiliar / Deshabilitar)
    #ENTONCES
    When hacemos clic en baja and usuarios
    Then visualizamos la seccion: "Baja de Usuarios"
    And hacemos clic en habilitar usuario
    Then debemos ver un alert que diga: "Usuario Habilitado"
    And hacemos clic en deshabilitar usuario
    Then debemos ver nuevamente un alert que diga: "Usuario Deshabilitado"

  @BajaTiposDeAcuerdo
  Scenario:
    #Como un usuario administrador
    #Quiero loguearme y realizar una Baja de Tipos de acuerdo (habiliar / Deshabilitar)
    #Siempre que el tipo de acuerdo no este asignado a uno o mas acuerdos
    #ENTONCES
    When hacemos clic en baja and tipos de acuerdo
    Then debemos visualizar la seccion: "Modificación de Tipos de Acuerdo"
    And hacemos clic en habilitar tipo de acuerdo
    Then debemos ver una alerta que diga: "Tipo de Acuerdo Habilitado"
    And hacemos clic en deshabilitar tipo de acuerdo
    Then debemos visualizar nuevamente una alerta que diga: "Tipo de Acuerdo Deshabilitado"

  @BajaDelegaciones
  Scenario:
    #Como un usuario administrador
    #Quiero loguearme y realizar una Baja de Delegaciones (habiliar / Deshabilitar)
    #Siempre que la delegacion no este asignado a uno o mas usuarios
    #ENTONCES
    When hacemos clic en baja and delegaciones
    Then debemos visualizar la siguiente seccion: "Baja de Delegaciones"
    And hacemos clic en habilitar delegacion
    Then debemos ver la alerta que diga: "Delegación Habilitada"
    And hacemos clic en deshabilitar delegacion
    Then debemos visualizar una alerta que diga: "Delegación Deshabilitada"

  @BajaEstadoExpedientes
  Scenario:
    #Como un usuario administrador
    #Quiero loguearme y realizar una Baja de Estado de Expedientes (habiliar / Deshabilitar)
    #ENTONCES
    When hacemos clic en baja and estado de expedientes
    Then debemos visualizar a continuacion la seccion: "Modificación de Estados de Expedientes"
    And hacemos clic en habilitar estado de expedientes
    Then debemos ver la siguiente alerta que diga: "Estado Expediente Habilitado"
    And hacemos clic en deshabilitar estado de expedientes
    Then debemos visualizar la siguiente alerta que diga: "Estado Expediente Deshabilitado"

  @ModificacionesPerfiles
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar alta a un Perfil
    #ENTONCES
    When hacemos clic en modificaciones and perfil
    Then deberíamos dirigirnos hacia la seccion: "Modificacion de Perfiles"
    And hacemos clic en editar
    And Modificamos el formulario con los siguientes datos: "<CodigoPerfil>" "<NombreDePerfil>" "<Delegacion>"
    And  le damos guadar cambios
    Then debemos visualizar un alert exitoso que diga: "Cambios Guardados!"

    Examples:
      | CodigoPerfil | NombreDePerfil | Delegacion |
      | User224      | Duff           | LA RIOJA   |