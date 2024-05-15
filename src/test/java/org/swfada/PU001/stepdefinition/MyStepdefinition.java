package org.swfada.PU001.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.swfada.PU001.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Dado("^PU001 - que el usuario ingresa a la plataforma ReJA$")
    public void QueElUsuarioIngresaALaPlataformaReJA() {
        myStep.QueElUsuarioIngresaALaPlataformaReJA();
    }

    @Cuando("PU001 - selecciona la instalación {string}")
    public void SeleccionaLaInstalación(String organismo) {
        myStep.SeleccionaLaInstalación(organismo);
    }

    @Y("^PU001 - pulsa el botón Siguiente$")
    public void PulsaElBotónSiguiente() {
        myStep.PulsaElBotónSiguiente();
    }

    @Y("^PU001 - se autentica mediante Certificado$")
    public void SeAutenticaMedianteCertificado() throws AWTException {
        myStep.SeAutenticaMedianteCertificado();
    }

    @Y("^PU001 - pulsa el botón Aceptar las obligaciones del sistema$")
    public void PulsaElBotónAceptarLasObligacionesDelSistema() {
        myStep.PulsaElBotónAceptarLasObligacionesDelSistema();
    }

    @Entonces("^PU001 - se accede a la Bandeja de trabajo$")
    public void SeAccedeALaBandejaDeTrabajo() {
        myStep.SeAccedeALaBandejaDeTrabajo();
    }
}
