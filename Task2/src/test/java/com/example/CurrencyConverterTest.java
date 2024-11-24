package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    private CurrencyConverter converter;

    // Инициализация перед каждым тестом
    @BeforeEach
    void setup() {
        converter = new CurrencyConverter();
        converter.setRate("USD", "EUR", 0.85); // Установка курса USD -> EUR
        converter.setRate("GBP", "JPY", 150.50); // Установка курса GBP -> JPY
    }

    // Тест успешной конвертации USD -> EUR
    @Test
    void shouldConvertDollarToEuro() {
        System.out.println("Start test: shouldConvertDollarToEuro");
        double result = converter.convert("USD", "EUR", 100.00);
        assertEquals(85.00, result, 0.001); // Проверка с допустимой погрешностью
        System.out.println("End test: shouldConvertDollarToEuro");
    }

    // Тест на выброс исключения при неизвестной конверсии
    @Test
    void shouldThrowExceptionForUnknownConversion() {
        System.out.println("Start test: shouldThrowExceptionForUnknownConversion");
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> converter.convert("CAD", "AUD", 200.00) // Канадский доллар -> Австралийский доллар
        );
        assertEquals("No conversion rate for CAD to AUD", thrown.getMessage());
        System.out.println("End test: shouldThrowExceptionForUnknownConversion");
    }
}
