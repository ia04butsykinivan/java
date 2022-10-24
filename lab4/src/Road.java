import java.util.ArrayList;

public class Road {
    ArrayList<Vehicle> vehiclesInRoad = new ArrayList<>();

    public int getCountOfPersons() {
        return vehiclesInRoad.stream().reduce(0, (subtotal, vehicle) -> subtotal + vehicle.getCountOfPassengers(), Integer::sum);
    }

    public void addVehicleToRoad(Vehicle vehicle) {
        vehiclesInRoad.add(vehicle);
    }
}
