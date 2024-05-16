package org.swfada.PF001.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF001.page.MyPage;

import java.awt.*;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void QueElUsuarioIngresaALaPlataformaReJA() {
        myPage.open();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaLaInstalación(String organismo) {
        myPage.SeleccionarInstalación(organismo);
    }

    public void PulsaElBotónSiguiente() {
        myPage.PulsaElBotónSiguiente();
    }

    public void SeAutenticaMedianteCertificado() throws AWTException {
        myPage.AutenticaciónMedianteCertificado();
    }

    public void PulsaElBotónAceptarLasObligacionesDelSistema() {
        myPage.PulsarAceptarObligaciones();
    }

    public void SeAccedeALaBandejaDeTrabajo() {
        myPage.ValidarAccesoAPlataforma();
    }
}
