package Financial_Automation;

import jakarta.persistence.*;

@Entity
@Table(name="monthly_reports")
public class FinancialDataMonthly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "month")
    private int month;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "is_expense")
    private boolean isExpense;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "sum_of_one")
    private double sumOfOne;

    public FinancialDataMonthly(int month, String itemName, boolean isExpense, int quantity, double sumOfOne) {
        this.month = month;
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }


    public FinancialDataMonthly(){

    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isExpense() {
        return isExpense;
    }

    public void setExpense(boolean expense) {
        isExpense = expense;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSumOfOne() {
        return sumOfOne;
    }

    public void setSumOfOne(double sumOfOne) {
        this.sumOfOne = sumOfOne;
    }

    @Override
    public String toString() {
        return "FinancialDataMonthly{" +
                "id=" + id +
                ", month=" + month +
                ", itemName='" + itemName + '\'' +
                ", isExpense=" + isExpense +
                ", quantity=" + quantity +
                ", sumOfOne=" + sumOfOne +
                '}';
    }
}
