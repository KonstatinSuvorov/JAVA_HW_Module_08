package com.example;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {

    private final Map<String, Double> rates = new HashMap<>();

    // Метод для установки курса обмена
    public void setRate(String from, String to, double rate) {
        rates.put(from + "-" + to, rate);
    }

    // Метод для выполнения конвертации
    public double convert(String from, String to, double amount) {
        String key = from + "-" + to;
        if (!rates.containsKey(key)) {
            throw new IllegalArgumentException("No conversion rate for " + from + " to " + to);
        }
        return amount * rates.get(key);
    }
}
