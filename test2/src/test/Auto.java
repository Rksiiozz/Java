package test;

class Auto extends Transport {
    private double enginePower; // потужність мотору

    public Auto(String id, double capacity, double costKm, double enginePower) {
        super(id, capacity, costKm);
        this.enginePower = enginePower;
    }

    @Override
    public double calcCost(double distance) {
        return distance * costKm;
    }

}