package com.evalartapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class calendarTest {
    public static final Target TXT_CALENDAR = Target.the("Texto descripcion calendario").located(By.xpath("/html/body/div[2]/form/div[1]/div[4]/p"));
    public static final Target INPUT_CALENDAR = Target.the("Entrada calendario").located(By.xpath("/html/body/div[2]/form/div[1]/div[4]/input"));


}
