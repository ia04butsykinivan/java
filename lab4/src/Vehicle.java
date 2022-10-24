import java.util.ArrayList;

abstract class Vehicle<T extends Person> {
    int countOfPlaces;
    ArrayList<T> passengers = new ArrayList<>();

    public Vehicle(int countOfPlaces) {
        this.countOfPlaces = countOfPlaces;
    }

    public void in(T passenger) throws Exception {
        if (passengers.size() >= countOfPlaces) {
            throw new Exception("Count of passengers more than places");
        }

        passengers.add(passenger);
    }

    public void out(int id) throws Exception {
        if (!passengers.stream().anyMatch(passenger -> passenger.id == id)) {
            throw new Exception("The passenger is not in the car");
        }

        passengers.removeIf(passenger -> passenger.id == id);
    }

    public int getCountOfPlaces() {
        return countOfPlaces;
    }

    public int getCountOfPassengers() {
        return passengers.size();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "countOfPlaces=" + countOfPlaces +
                ", passengers=" + passengers +
                '}';
    }
}
