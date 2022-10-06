package ru.netology.webformtest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.awt.SystemColor.text;

public class WebformTestV1 {

@Test
    void shouldMakeConfirm() throws InterruptedException {
    Selenide.open("http://localhost:9999");
    $("[data-test-id = 'name'] input").setValue("Иван Иванов");
    $ ("[data-test-id = 'phone'] input").setValue("+79003170909");
    $ ("[data-test-id = 'agreement']").click();
    $$("button").find(Condition.exactText("Продолжить")).click();
    $("[data-test-id=order-success]").getText();
    Thread.sleep(5000);

}

}
