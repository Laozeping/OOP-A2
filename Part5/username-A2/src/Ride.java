import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private final Queue<Visitor> visitorQueue;
    private final LinkedList<Visitor> rideHistory;
    private String rideName;
    private int maxCapacity;
    private Employee operator;
    private int maxRider;
    private int numOfCycles;

    public Ride() {
        this.rideName = "";
        this.maxCapacity = 0;
        this.operator = null;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 1;
        this.numOfCycles = 0;
    }

    public Ride(String rideName, int maxCapacity, Employee operator, int maxRider) {
        this.rideName = rideName;
        this.maxCapacity = maxCapacity;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycles = 0;
    }

    public Ride(String rideName, int maxCapacity, Employee operator) {
        this.rideName = rideName;
        this.maxCapacity = maxCapacity;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 1;
        this.numOfCycles = 0;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitorQueue.size() < maxCapacity) {
            visitorQueue.offer(visitor);
            System.out.println(visitor.getName() + " has been added to the queue.");
        } else {
            System.out.println("The queue is full and visitors can't be added: " + visitor.getName());
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitorQueue.remove(visitor)) {
            System.out.println(visitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println(visitor.getName() + " not found in the queue.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in the current queue:");
        for (Visitor visitor : visitorQueue) {
            System.out.println(visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No operator assigned to the ride. The ride cannot be run.");
            return;
        }
        if (visitorQueue.isEmpty()) {
            System.out.println("The queue is empty. No visitors to take the ride.");
            return;
        }
        int riders = Math.min(maxRider, visitorQueue.size());
        System.out.println("Running one cycle with " + riders + " visitors.");
        if (maxRider > visitorQueue.size()) {
            numOfCycles++;
            System.out.println("The ride has been run for cycle " + numOfCycles + ".");
            return;
        }
        int count = visitorQueue.size() - riders;
        for (int i = 0; i < count; i++) {
            Visitor visitor = visitorQueue.poll();
            addVisitorToHistory(visitor);
        }
        numOfCycles++;
        System.out.println("The ride has been run for cycle " + numOfCycles + ".");
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " has been added to the ride history.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("All visitors in the ride's history:");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(visitor.getName());
        }
    }

    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Visitors have been sorted.");
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
