package org.swfada.PF001.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF001.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Dado("^PF001 - que el usuario ingresa a la plataforma ReJA$")
    public void QueElUsuarioIngresaALaPlataformaReJA() {
        myStep.QueElUsuarioIngresaALaPlataformaReJA();
    }

    @Cuando("PF001 - selecciona la instalación {string}")
    public void SeleccionaLaInstalación(String organismo) {
        myStep.SeleccionaLaInstalación(organismo);
    }

    @Y("^PF001 - pulsa el botón Siguiente$")
    public void PulsaElBotónSiguiente() {
        myStep.PulsaElBotónSiguiente();
    }

    @Y("^PF001 - se autentica mediante Certificado$")
    public void SeAutenticaMedianteCertificado() throws AWTException {
        myStep.SeAutenticaMedianteCertificado();
    }

    @Y("^PF001 - pulsa el botón Aceptar las obligaciones del sistema$")
    public void PulsaElBotónAceptarLasObligacionesDelSistema() {
        myStep.PulsaElBotónAceptarLasObligacionesDelSistema();
    }

    @Entonces("^PF001 - se accede a la Bandeja de trabajo$")
    public void SeAccedeALaBandejaDeTrabajo() {
        myStep.SeAccedeALaBandejaDeTrabajo();
    }
}
