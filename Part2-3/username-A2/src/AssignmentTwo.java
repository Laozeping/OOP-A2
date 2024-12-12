public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partThree();
    }

    public void partThree() {
        Employee employee = new Employee("John", 30, "Park Ave", "Ride Operator", 25000);
        Ride ride = new Ride("Roller Coaster", 5, employee);
        Visitor visitor1 = new Visitor("Alice", 25, "123 Elm St", "Standard", false);
        Visitor visitor2 = new Visitor("Bob", 32, "456 Oak St", "VIP", true);
        Visitor visitor3 = new Visitor("Charlie", 29, "789 Pine St", "Standard", false);
        Visitor visitor4 = new Visitor("Diana", 22, "101 Maple St", "FastPass", true);
        Visitor visitor5 = new Visitor("Eve", 40, "202 Birch St", "Standard", false);
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.printQueue();
        ride.removeVisitorFromQueue(visitor3);
        ride.printQueue();
    }

    public void partFourA() {
    }

    public void partFourB() {
    }
    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
