package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekEnhancedTest {

    @Test
    void when1ThenMonday() {
        int day = 1;
        String expected = "Понедельник";
        String result = SwitchWeekEnhanced.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when0ThenError() {
        int day = 0;
        String expected = "Ошибка";
        String result = SwitchWeekEnhanced.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }
}