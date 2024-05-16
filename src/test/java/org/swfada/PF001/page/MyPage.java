package org.swfada.PF001.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

@DefaultUrl("/recursos_ndikepxp//inicio/indicarInstalacion.action;jsessionid=HHvBWSSxczGSl0jfrjiSJN7FC-jIQiMoFIJPfdCg.ndikepxp02")


public class MyPage extends PageObject {
    @FindBy(id = "instalacionEscogida")
    private WebElementFacade listaorganismos;

    @FindBy(id = "submitInstalacion")
    private WebElementFacade btnSiguiente;

    @FindBy(xpath = "//a[@class=\"btn botonLogin\"]")
    private WebElementFacade certificado;

    @FindBy(xpath = "//button[@class=\"swal-button swal-button--confirm\"]")
    private WebElementFacade btnAceptarAlerta;

    @FindBy(xpath = "(//button[@class=\"btn botonLogin\"])[1]")
    private WebElementFacade btnAceptarObligaciones;

    public void SeleccionarInstalación(String organismo) {
        btnAceptarAlerta.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contenido-nuevo-inicio")));
        listaorganismos.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + organismo + "')]"));
        clickOn(selectOptions);
    }

    public void PulsaElBotónSiguiente() {
        btnSiguiente.click();

    }

    public void AutenticaciónMedianteCertificado() throws AWTException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contenido-nuevo-inicio")));
        Robot robot = new Robot();
        Runnable mlauncher = () -> {
            try {
                certificado.click();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        try {
            Thread thread = new Thread(mlauncher);
            thread.start();
            //Simular Enter
            waitFor(5).second();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void PulsarAceptarObligaciones() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contenido-nuevo-inicio-ultimoacceso")));
        btnAceptarObligaciones.click();
    }

    public void ValidarAccesoAPlataforma() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"tablaResultadosBusqueda_wrapper\"]")));
    }
}
