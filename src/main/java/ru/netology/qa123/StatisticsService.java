package ru.netology.qa123;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax <= income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}