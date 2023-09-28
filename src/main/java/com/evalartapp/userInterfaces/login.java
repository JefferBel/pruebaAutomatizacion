package com.evalartapp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class login {

    public static final Target USER_FIELD = Target.the("Campo para ingresar el usuario").located(By.xpath("/html/body/div/div[2]/form/input[1]"));
    public static final Target PASSWORD_FIELD = Target.the("Campo para ingresar la contraseña").located(By.xpath("/html/body/div/div[2]/form/input[2]"));
    public static final Target BTN_SEND = Target.the("Enviar LogIn").located(By.xpath("/html/body/div/div[2]/form/button"));
}
