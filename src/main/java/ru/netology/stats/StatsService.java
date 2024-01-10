package ru.netology.stats;

public class StatsService {

    public int calcSalesAmount(int[] sales) {
        int sumOfSales = 0;
        for (int i : sales) {
            sumOfSales += i;
        }
        return sumOfSales;
    }

    public int calcAvgSalesInMonth(int[] sales) {
        return calcSalesAmount(sales) / sales.length;
    }

    public int calcMonthWithMaxSales(int[] sales) {
        int maxOfSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxOfSalesMonth]) {
                maxOfSalesMonth = i;
            }
        }
        return maxOfSalesMonth + 1;
    }

    public int calcMonthWithMinSales(int[] sales) {
        int minOfSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minOfSalesMonth]) {
                minOfSalesMonth = i;
            }
        }
        return minOfSalesMonth + 1;
    }

    public int calcCountOfMonthWithBelowAvgSales(int[] sales) {
        int countOfMonth = 0;
        int avgOfSales = calcAvgSalesInMonth(sales);
        for (int i : sales) {
            if (i < avgOfSales) {
                countOfMonth++;
            }
        }
        return countOfMonth;
    }

    public int calcCountOfMonthWithAboveAvgSales(int[] sales) {
        int countOfMonth = 0;
        int avgOfSales = calcAvgSalesInMonth(sales);
        for (int i : sales) {
            if (i > avgOfSales) {
                countOfMonth++;
            }
        }
        return countOfMonth;
    }
}
