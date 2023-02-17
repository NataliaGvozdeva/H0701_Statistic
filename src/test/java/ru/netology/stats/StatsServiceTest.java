package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest   {

    //1.Сумму всех продаж.
    @Test
    public void sumSalesTest () {

        StatsService service = new StatsService();
        long[] statistic = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 4};

        long expected = 12;
        long actual = service.sumSales(statistic);

        Assertions.assertEquals(expected, actual);
    }

    //2.Среднюю сумму продаж в месяц
    @Test
    public void middleSalesTest () {

        StatsService service = new StatsService();
        long[] statistic = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 4};

        long expected = 1;
        long actual = service.middleSales(statistic);

        Assertions.assertEquals(expected, actual);
    }

    //3.Номер месяца, в котором был пик продаж,
    // то есть осуществлены продажи на максимальную сумму.
    @Test
    public void maxSalesTest () {

        StatsService service = new StatsService();
        long[] statistic = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 4};

        long expected = 12;
        long actual = service.maxSales(statistic);

        Assertions.assertEquals(expected, actual);
    }

    //4.Номер месяца, в котором был минимум продаж,
    // то есть осуществлены продажи на минимальную сумму.
    @Test
    public void minSalesTest () {

        StatsService service = new StatsService();
        long[] statistic = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 4};

        long expected = 9;
        long actual = service.minSales(statistic);

        Assertions.assertEquals(expected, actual);
    }

    //5.Количество месяцев, в которых продажи были ниже среднего.
    @Test
    public void amountMonthUnderMiddleTest () {

        StatsService service = new StatsService();
        long[] statistic = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 4};

        long expected = 3;
        long actual = service.amountMonthUnderMiddle(statistic);

        Assertions.assertEquals(expected, actual);
    }

    //6.Количество месяцев, в которых продажи были выше среднего.
    @Test
    public void amountMonthUpperMiddleTest () {

        StatsService service = new StatsService();
        long[] statistic = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 4};

        long expected = 1;
        long actual = service.amountMonthUpperMiddle(statistic);

        Assertions.assertEquals(expected, actual);
    }
}
