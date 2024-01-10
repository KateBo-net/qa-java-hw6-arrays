package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    StatsService service = new StatsService();

    @Test
    public void shouldCalculateSumOfSales() {

        int actual = service.calcSalesAmount(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAvgOfSales() {

        int actual = service.calcAvgSalesInMonth(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthWithMaxSales() {
        int actual = service.calcMonthWithMaxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthWithMinSales() {
        int actual = service.calcMonthWithMinSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountOfMonthWithBelowAvgSales() {
        int actual = service.calcCountOfMonthWithBelowAvgSales(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountOfMonthWithAboveAvgSales() {
        int actual = service.calcCountOfMonthWithAboveAvgSales(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
