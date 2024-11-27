package test;

class Ship extends Transport {
    private int shipPortID; // порт корабоя

    public Ship(String id, double capacity, double costKm, int shipPortID) {
        super(id, capacity, costKm);
        this.shipPortID = shipPortID;
    }

    @Override
    public double calcCost(double distance) {
        return distance * costKm * 0.8;
    }

}
