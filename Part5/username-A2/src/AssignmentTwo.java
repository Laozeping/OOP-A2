public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partFive();
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
        Employee operator = new Employee("John", 30, "Park Ave", "Ride Operator", 25000);
        Ride rollerCoaster = new Ride("Roller Coaster", 10, operator, 2);
        Visitor visitor1 = new Visitor("Alice", 25, "123 Elm St", "Standard", false);
        Visitor visitor2 = new Visitor("Bob", 32, "456 Oak St", "VIP", true);
        Visitor visitor3 = new Visitor("Charlie", 29, "789 Pine St", "Standard", false);
        Visitor visitor4 = new Visitor("Diana", 22, "101 Maple St", "FastPass", true);
        Visitor visitor5 = new Visitor("Eve", 40, "202 Birch St", "Standard", false);
        Visitor visitor6 = new Visitor("Frank", 30, "303 Cedar St", "VIP", true);
        Visitor visitor7 = new Visitor("Grace", 28, "404 Redwood St", "Standard", false);
        Visitor visitor8 = new Visitor("Hank", 35, "505 Oak St", "VIP", true);
        Visitor visitor9 = new Visitor("Ivy", 26, "606 Elm St", "FastPass", true);
        Visitor visitor10 = new Visitor("Jack", 33, "707 Pine St", "Standard", false);
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);
        System.out.println("Before running the cycle:");
        rollerCoaster.printQueue();
        rollerCoaster.runOneCycle();
        System.out.println("After running one cycle:");
        rollerCoaster.printQueue();
        rollerCoaster.printRideHistory();
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
