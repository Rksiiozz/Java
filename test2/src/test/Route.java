package test;
import java.util.List;

class Route {
    private String start;
    private String end;
    private double distance;
    private List<Transport> transports;
    private double totalWeight; // Сума ваги вантажу на маршруті

    public Route(String start, String end, double distance, List<Transport> transports, double totalWeight) throws OverCapacityException {

        if (distance <= 0) {
            throw new InvalidRouteException("Distance must be > 0");
        }

        this.start = start;
        this.end = end;
        this.distance = distance;
        this.transports = transports;
        this.totalWeight = totalWeight;

        transports.stream()
                .filter(transport -> totalWeight > transport.capacity) //транспорти в яких вантаж перевищує капасіті
                .findFirst() // Знаходимо перший транспорт, що відповідає умові
                .ifPresent(transport -> {
                    throw new OverCapacityException("Cargo > for capacity " + transport.id);
                });
    }

    public String getStart() {
        return start;
    }

    public String getEndCity() {
        return end;
    }

    public double calculateTotalCost() {
        return transports.stream()
                .mapToDouble(t -> t.calcCost(distance))
                .sum(); // Stream для загальних витрат
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public double getDistance() {
        return distance;
    }
}

