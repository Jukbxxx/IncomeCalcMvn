package ru.netology.services;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class IncomeCalculatorTest {

    @ParameterizedTest

    @CsvFileSource(files="src/test/resources/calculator.csv")
    public void testIncomeCalculator(int expected, int expences, int income, int minForRest) {
        IncomeCalculator service = new IncomeCalculator();
        int actual = service.calcIncome(expences, income, minForRest);
        Assertions.assertEquals(expected, actual);
    }

}
