public class Employee extends Person {
    private String jobTitle;
    private double salary;

    public Employee() {
        super();
        this.jobTitle = "";
        this.salary = 0.0;
    }

    public Employee(String name, int age, String address, String jobTitle, double salary) {
        super(name, age, address);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
