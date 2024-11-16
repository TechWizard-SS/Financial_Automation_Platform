package Financial_Automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class YearlyReportLoader {
    public YearlyReport loadYearlyReportFromFile(String resourcePath) {
        YearlyReport yearlyReport = new YearlyReport();

        try (InputStream inputStream = getClass().getResourceAsStream(resourcePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            if (inputStream == null) {
                return yearlyReport;
            }
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length != 3) {
                    System.out.println("Ошибка в формате строки: " + line);
                    continue;
                }

                int month = Integer.parseInt(values[0]);
                int amount = Integer.parseInt(values[1]);
                boolean isExpense = Boolean.parseBoolean(values[2]);

                yearlyReport.addMonthData(month, amount, isExpense);

            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Ошибка в формате числового значения: " + e.getMessage());
        }
        return yearlyReport;
    }
}
