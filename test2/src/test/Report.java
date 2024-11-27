package test;

class Report {
    public static void report(Route route) {
        System.out.println("Route from " + route.getStart() + " to " + route.getEndCity());
        System.out.println("Distance: " + route.getDistance() + " km");
        System.out.println("Transport Details:");
        route.getTransports().forEach(transport -> {
            System.out.println(" - " + transport.getClass().getSimpleName() +
                    " (ID: " + transport.id + ") - Cost: " + transport.calcCost(route.getDistance()));
        });
        System.out.println("Total cost: " + route.calculateTotalCost());
    }
}
