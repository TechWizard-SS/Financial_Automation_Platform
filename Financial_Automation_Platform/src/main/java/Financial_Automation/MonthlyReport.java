package Financial_Automation;

public class MonthlyReport {
    private String item_name;
    private boolean isExpense;
    private int quantity;
    private double sumOfOne;

    public MonthlyReport(String item_name, boolean isExpense, int quantity, double sumOfOne) {
        this.item_name = item_name;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
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

    public void setSumOfOne(int sumOfOne) {
        this.sumOfOne = sumOfOne;
    }

    public double getTotal(){
        return sumOfOne * (double) quantity;
    }
}
