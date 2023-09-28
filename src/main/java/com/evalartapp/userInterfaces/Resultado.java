package com.evalartapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Resultado {
    public static final Target MENSAJE = Target.the("Mensaje de finalizacion").located(By.xpath("/html/body/div/div/div/p"));
}
