package com.evalartapp.tasks;

import com.evalartapp.questions.GetTextField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import javax.swing.*;

import java.time.LocalDate;
import java.util.Arrays;

import static com.evalartapp.userInterfaces.calendarTest.*;
import static com.evalartapp.userInterfaces.charsTest.*;

public class calendarDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String txtDescriptionCalendar;
        int numberOfDays;
        String year;
        String mounth;
        String day;

        txtDescriptionCalendar = actor.asksFor(GetTextField.from(TXT_CALENDAR));
        String[] corteDate= txtDescriptionCalendar.split(": ");
        String [] corte= txtDescriptionCalendar.split(" dias");
        numberOfDays=Integer.parseInt(corte[0].substring((corte[0].length())-3).replaceAll(" ",""));
        String[] dateCompleted = (corteDate[1].replaceAll(" ","")).split("/");

        LocalDate todaysDate = LocalDate.of(Integer.parseInt(dateCompleted[2]),Integer.parseInt(dateCompleted[1]),Integer.parseInt(dateCompleted[0]));
        LocalDate newDate;
        if (txtDescriptionCalendar.contains("antes")) {
            newDate = todaysDate.minusDays(numberOfDays);
        }
        else {
            newDate = todaysDate.plusDays(numberOfDays);
        }

        if (newDate.getDayOfMonth()<10){
        day="0"+newDate.getDayOfMonth();
        }
        else {
            day=newDate.getDayOfMonth()+"";
        }
        if (newDate.getMonthValue()<10){
            mounth="0"+newDate.getMonthValue();
        }
        else {
            mounth=newDate.getMonthValue()+"";
        }
        year=newDate.getYear()+"";
        actor.attemptsTo(Enter.theValue(day+mounth+year).into(INPUT_CALENDAR));

        actor.attemptsTo(Click.on(BOTON_SEND));

    }
    public static calendarDate minusDate() {
        return Tasks.instrumented(calendarDate.class);
    }
}
