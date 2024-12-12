public class Visitor extends Person {
    private String ticketType;
    private boolean hasFastPass;

    public Visitor() {
        super();
        this.ticketType = "";
        this.hasFastPass = false;
    }

    public Visitor(String name, int age, String address, String ticketType, boolean hasFastPass) {
        super(name, age, address);
        this.ticketType = ticketType;
        this.hasFastPass = hasFastPass;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean isHasFastPass() {
        return hasFastPass;
    }

    public void setHasFastPass(boolean hasFastPass) {
        this.hasFastPass = hasFastPass;
    }
}
