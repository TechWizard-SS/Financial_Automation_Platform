package Financial_Automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MonthlyReportLoader monthlyLoader = new MonthlyReportLoader();
        YearlyReportLoader yearlyLoader = new YearlyReportLoader();

        String resourcePath = "/MonthlyReport.txt";
        String resourcePath2 = "/YearlyReport.txt";


        List<MonthlyReport> monthlyReport = monthlyLoader.loadMonthlyReportsFromFile(resourcePath);
        YearlyReport yearlyReport = yearlyLoader.loadYearlyReportFromFile(resourcePath2);

        for(MonthlyReport report : monthlyReport){
            System.out.println("Item: " + report.getItem_name() + ", Total: " + report.getTotal());
        }

        System.out.println("\nГодовой отчет: ");
        yearlyReport.printYearlyReport();
    }

}
