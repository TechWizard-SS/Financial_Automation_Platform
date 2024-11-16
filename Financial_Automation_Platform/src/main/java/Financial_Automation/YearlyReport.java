package Financial_Automation;

import java.util.HashMap;

public class YearlyReport {
    private HashMap<Integer, Integer> monthlyIncome = new HashMap<>();
    private HashMap<Integer, Integer> monthlyExpense = new HashMap<>();

    public void addMonthData(int month, int amount, boolean isExpense){
        if (isExpense) {
            monthlyExpense.put(month, amount);
        }
        else {
            monthlyIncome.put(month,amount);
        }
    }

    public int getAnnualIncome(){
       return monthlyIncome.values().stream().mapToInt(Integer :: intValue).sum();
    }

    public int getAnnualExpense(){
        return monthlyExpense.values().stream().mapToInt(Integer:: intValue).sum();
    }

    public void printYearlyReport(){
        System.out.println("Годовой отчет");
        System.out.println("Месяц | Доход | Расход");
        for (int month = 1; month <= 12; month++) {
            int income = monthlyIncome.getOrDefault(month, 0);
            int expense = monthlyExpense.getOrDefault(month, 0);
            System.out.printf("%5d | %5d | %6d%n", month, income, expense);
        }
    }
}
