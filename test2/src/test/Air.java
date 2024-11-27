package test;

class Air extends Transport {
    private double maxSpeed; // максимальна щвидкість літака

    public Air(String id, double capacity, double costKm, double maxSpeed) {
        super(id, capacity, costKm);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double calcCost(double distance) {
        return distance * costKm * 1.5;
    }

}