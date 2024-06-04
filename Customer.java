public class Customer {
    private String customerId;
    private String name;
    private String address;
    private double lastReading;
    private double currentReading;

    public Customer(String customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.lastReading = 0;
        this.currentReading = 0;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getLastReading() {
        return lastReading;
    }

    public void setLastReading(double lastReading) {
        this.lastReading = lastReading;
    }

    public double getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(double currentReading) {
        this.currentReading = currentReading;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + "\nName: " + name + "\nAddress: " + address + 
               "\nLast Reading: " + lastReading + "\nCurrent Reading: " + currentReading;
    }
}
