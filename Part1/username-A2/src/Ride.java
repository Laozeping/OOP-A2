public class Ride {
    private String rideName;
    private int maxCapacity;
    private Employee operator;

    public Ride() {
        this.rideName = "";
        this.maxCapacity = 0;
        this.operator = null;
    }

    public Ride(String rideName, int maxCapacity, Employee operator) {
        this.rideName = rideName;
        this.maxCapacity = maxCapacity;
        this.operator = operator;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }
}
