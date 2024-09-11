package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJunitTest {
    @Test
    void firstTest() {
       Assertions.assertTrue(3>2);
    }
}
