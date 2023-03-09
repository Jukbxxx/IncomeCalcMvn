package ru.netology.services;
public class IncomeCalculator {

    public int calcIncome(int expences, int income, int minForRest) {
        int count = 0; // количество месяцев отдыха
        int threshold = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (threshold >= minForRest) { //minForRest - минимальная сумма на счету, при которой можно отдыхать
                count++;
                threshold = (threshold - expences) - threshold / 3 * 2;
            } else {
                threshold = threshold + income - expences;
            }

        }
        return count;
    }

}


