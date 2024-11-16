package Financial_Automation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MonthlyReportLoader {
    public List<MonthlyReport> loadMonthlyReportsFromFile(String resourcePath) {
        List<MonthlyReport> monthlyReports = new ArrayList<>();

        try (InputStream inputStream = getClass().getResourceAsStream(resourcePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length != 4) {
                    System.out.println("Ошибка в формате строки: " + line);
                    continue;
                }

                String itemName = values[0];
                boolean isExpense = Boolean.parseBoolean(values[1]);
                int quantity = Integer.parseInt(values[2]);
                double sumOfOne = Double.parseDouble(values[3]);

                MonthlyReport report = new MonthlyReport(itemName, isExpense, quantity, sumOfOne);
                monthlyReports.add(report);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        return monthlyReports;
    }

}
