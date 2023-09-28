package com.evalartapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.swing.*;

import static com.evalartapp.userInterfaces.Resultado.MENSAJE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidarMensaje implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(MENSAJE, isPresent()).forNoMoreThan(10).seconds();
        return the(MENSAJE).answeredBy(actor).getText();
    }
    public static Question<String> finalizacion() {
        return new ValidarMensaje();
    }
}
