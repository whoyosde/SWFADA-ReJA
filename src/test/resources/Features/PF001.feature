#language: es
@PF.001
Característica: PF.001 - Acceso a la bandeja de expedientes de REJA
  Como usuario registrado en el sistema
  Quiero autenticarme
  Para acceder a la Bandeja de Trabajo

  Esquema del escenario: Autenicación en ReJA
    Dado PF001 - que el usuario ingresa a la plataforma ReJA
    Cuando PF001 - selecciona la instalación "<organismo>"
    Y PF001 - pulsa el botón Siguiente
    Y PF001 - se autentica mediante Certificado
    Y PF001 - pulsa el botón Aceptar las obligaciones del sistema
    Entonces PF001 - se accede a la Bandeja de trabajo

    Ejemplos:
      | organismo                                         |
      | Secretaria General para la Administración Pública |