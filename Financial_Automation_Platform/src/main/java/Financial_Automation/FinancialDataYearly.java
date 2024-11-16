package Financial_Automation;

import jakarta.persistence.*;

@Entity
@Table(name = "yearly_reports")
public class FinancialDataYearly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="id", nullable = false)
    private Long id;

    @Column(name ="month", nullable = false)
    private int month;

    @Column(name ="amount", nullable = false)
    private double amount;

    @Column(name ="is_expense", nullable = false)
    private boolean isExpense;


    public  FinancialDataYearly(){}
    public FinancialDataYearly(int month, double amount, boolean isExpense) {
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Месяц должен быть в диапазоне от 1 до 12");
        }
        this.month = month;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма не может быть отрицательной");
        }
        this.amount = amount;
    }

    public boolean isExpense() {
        return isExpense;
    }

    public void setExpense(boolean expense) {
        isExpense = expense;
    }

    @Override
    public String toString() {
        return "FinancialDataYearly{" +
                "id=" + id +
                ", month=" + month +
                ", amount=" + amount +
                ", isExpense=" + isExpense +
                '}';
    }
}
