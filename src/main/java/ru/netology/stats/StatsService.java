package ru.netology.stats;

public class StatsService {

    //1.Сумму всех продаж.
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //2.Среднюю сумму продаж в месяц.
    public long middleSales(long[] sales) {
        long middle = 0;
        for (long sale : sales) {
            middle = middle + sale;
        }
        return (long) middle/sales.length;
    }

    //3.Номер месяца, в котором был пик продаж,
    // то есть осуществлены продажи на максимальную сумму.
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //4.Номер месяца, в котором был минимум продаж,
    // то есть осуществлены продажи на минимальную сумму.
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5.Количество месяцев, в которых продажи были ниже среднего.
    public int amountMonthUnderMiddle (long[] sales) {

        long middle = middleSales(sales);

        int amount = 0;

        for (long sale : sales) {
            if (sale < middle) {
                amount++;
            }
        }
        return amount;
    }


    //6.Количество месяцев, в которых продажи были выше среднего.
    public int amountMonthUpperMiddle (long[] sales) {

        long middle = middleSales(sales);

        int amount = 0;

        for (long sale : sales) {
            if (sale > middle) {
                amount++;
            }
        }
        return amount;
    }
}
