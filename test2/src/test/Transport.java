package test;

abstract class Transport {
    protected String id;
    protected double capacity;
    protected double costKm;

    public Transport(String id, double capacity, double costKm) {
        this.id = id;
        this.capacity = capacity;
        this.costKm = costKm;
    }

    public abstract double calcCost(double distance);
}

