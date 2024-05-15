#language: es
@PU.001
Característica: PU.001 - Acceso a la bandeja de expedientes de REJA
  Como usuario registrado en el sistema
  Quiero autenticarme
  Para acceder a la Bandeja de Trabajo

  Esquema del escenario: Autenicación en ReJA
    Dado PU001 - que el usuario ingresa a la plataforma ReJA
    Cuando PU001 - selecciona la instalación "<organismo>"
    Y PU001 - pulsa el botón Siguiente
    Y PU001 - se autentica mediante Certificado
    Y PU001 - pulsa el botón Aceptar las obligaciones del sistema
    Entonces PU001 - se accede a la Bandeja de trabajo

    Ejemplos:
      | organismo |
      | Secretaria General para la Administración Pública   |

