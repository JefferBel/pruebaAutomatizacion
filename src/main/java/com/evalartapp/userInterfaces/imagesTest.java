package com.evalartapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class imagesTest {
    public static final Target TXT_DESCRIPTION_IMAGES = Target.the("Texto con la descripción del problema").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div/p[1]"));
    public static final Target IMAGES = Target.the("Texto de las figuras").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/div/p[2]"));
    public static final Target NUMBER_OF_IMAGES = Target.the("Campo para ingresar conteo").located(By.xpath("/html/body/div[2]/form/div[1]/div[2]/input"));

}
