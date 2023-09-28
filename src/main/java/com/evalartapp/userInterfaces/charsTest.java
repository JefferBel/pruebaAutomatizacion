package com.evalartapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class charsTest {
     public static final Target TXT_WRITE = Target.the("Texto descripcion escritura").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/p"));
    public static final Target TEXT_FIELD = Target.the("Texto descripcion escritura").located(By.xpath("/html/body/div[2]/form/div[1]/div[1]/textarea"));
    public static final Target BOTON_SEND = Target.the("boton enviar").located(By.xpath("//button[@class=' border-black p-2 border-2 rounded-md mx-auto hover:bg-blue-300']"));
}
