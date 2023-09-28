package com.evalartapp.tasks;

import com.evalartapp.questions.GetTextField;
import jdk.nashorn.internal.scripts.JO;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

import static com.evalartapp.userInterfaces.charsTest.BOTON_SEND;
import static com.evalartapp.userInterfaces.multipliesTest.*;

public class multiplesOfThree implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String txt_multiplies;
        String options;
        int number;
        int aux;

        txt_multiplies= actor.asksFor(GetTextField.from(TXT_MULTIPLIES));
        number= Integer.parseInt(String.valueOf(txt_multiplies.charAt(txt_multiplies.length()-1)));
        options=actor.asksFor(GetTextField.from(MULTIPLIES_OPTIONS));
        String[] multipliesOption = options.split("\n");

        for (int i=0;i<multipliesOption.length;i++){
            if (Integer.parseInt(multipliesOption[i])%number==0){
                actor.attemptsTo(Click.on(By.xpath("//input[@value='"+multipliesOption[i]+"']")));
            }
        }

    }
    public static multiplesOfThree checkBox() {
        return Tasks.instrumented(multiplesOfThree.class);
    }
}
