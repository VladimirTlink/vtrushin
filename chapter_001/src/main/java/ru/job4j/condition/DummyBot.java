package ru.job4j.condition;

/**
 *Class Calculate решение задачи части 4 урок 3.1.
 *@autor vtrushin
 *@since 16.12.2017
 */

public class DummyBot {


    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
