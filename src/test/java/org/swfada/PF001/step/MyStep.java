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
    @net.thucydides.core.annotations.Step
    public void PulsaElBotónSiguiente() {
        myPage.PulsaElBotónSiguiente();
    }

    @net.thucydides.core.annotations.Step
    public void SeAutenticaMedianteCertificado() throws AWTException {
        myPage.AutenticaciónMedianteCertificado();
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónAceptarLasObligacionesDelSistema() {
        myPage.PulsarAceptarObligaciones();
    }

    @net.thucydides.core.annotations.Step
    public void SeAccedeALaBandejaDeTrabajo() {
        myPage.ValidarAccesoAPlataforma();
    }
}
