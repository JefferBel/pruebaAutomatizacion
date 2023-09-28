package com.evalartapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class multipliesTest {
    public static final Target TXT_MULTIPLIES = Target.the("Texto descripcion multiplos").located(By.xpath("/html/body/div[2]/form/div[1]/div[3]/p"));
    public static final Target MULTIPLIES_OPTIONS = Target.the("Opciones de los muliplos").located(By.xpath("/html/body/div[2]/form/div[1]/div[3]/div"));
    public static final Target MULTIPLIES_CHECKBOX = Target.the("Cajas de checkeo opciones").located(By.xpath("//input[@value='180']"));

}
