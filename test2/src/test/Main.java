package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Transport auto = new Auto("AUTO1", 1000, 2.5, 15);
            Transport air = new Air("AIR1", 5000, 10, 10000);
            Transport ship = new Ship("SHIP1", 20000, 1.5, 50);

            Route route = new Route("Frankfurt", "Lviv", 964, Arrays.asList(auto, air, ship), 1000);
            Report.report(route);

            Route route2 = new Route("Frankfurt", "Lviv", 964, Arrays.asList(auto, air, ship), 6000);
            Report.report(route2);

            Route route3 = new Route("Frankfurt", "Lviv", 0, Arrays.asList(auto, air, ship), 6000);
            Report.report(route3);


        } catch (InvalidRouteException e) {
            System.err.println("Route error: " + e.getMessage());
        } catch (OverCapacityException e) {
            System.err.println("Capacity error: " + e.getMessage());
        }
    }
}

