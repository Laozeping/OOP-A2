public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partFourB();
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
        Employee employee = new Employee("John", 30, "Park Ave", "Ride Operator", 25000);
        Ride ride = new Ride("Roller Coaster", 5, employee);
        Visitor visitor1 = new Visitor("Alice", 25, "123 Elm St", "Standard", false);
        Visitor visitor2 = new Visitor("Bob", 32, "456 Oak St", "VIP", true);
        Visitor visitor3 = new Visitor("Charlie", 29, "789 Pine St", "Standard", false);
        Visitor visitor4 = new Visitor("Diana", 22, "101 Maple St", "FastPass", true);
        Visitor visitor5 = new Visitor("Eve", 40, "202 Birch St", "Standard", false);
        System.out.println("Is Alice in the ride history? " + ride.checkVisitorFromHistory(visitor1));
        ride.addVisitorToHistory(visitor1);
        System.out.println("Is Alice in the ride history? " + ride.checkVisitorFromHistory(visitor1));
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);
        System.out.println("Number of visitors in ride history: " + ride.numberOfVisitors());
        ride.printRideHistory();
    }
    public void partFourB() {
        Employee operator = new Employee("John", 30, "Park Ave", "Ride Operator", 25000);
        Ride rollerCoaster = new Ride("Roller Coaster", 5, operator);
        Visitor visitor1 = new Visitor("Alice", 25, "123 Elm St", "Standard", false);
        Visitor visitor2 = new Visitor("Bob", 32, "456 Oak St", "VIP", true);
        Visitor visitor3 = new Visitor("Charlie", 29, "789 Pine St", "Standard", false);
        Visitor visitor4 = new Visitor("Diana", 22, "101 Maple St", "FastPass", true);
        Visitor visitor5 = new Visitor("Eve", 40, "202 Birch St", "Standard", false);
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor5);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.runOneCycle();
        System.out.println("Unsorted Ride History:");
        rollerCoaster.printRideHistory();
        rollerCoaster.sortRideHistory();
        System.out.println("Sorted Ride History:");
        rollerCoaster.printRideHistory();
    }
    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
