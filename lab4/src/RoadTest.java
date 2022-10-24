import org.junit.Test;

public class RoadTest {
    @Test
    public void test1() {
        Road road = new Road();

        Bus vehicle1 = new Bus(8);

        Person person1 = new Person(1, "John");

        try {
            vehicle1.in(person1);

            vehicle1.out(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        road.addVehicleToRoad(vehicle1);

        System.out.println(road.getCountOfPersons());
    }

    @Test
    public void test2() {
        Road road = new Road();

        Bus vehicle1 = new Bus(8);

        Person person1 = new Person(1, "John");

        try {
            vehicle1.in(person1);

            vehicle1.out(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        road.addVehicleToRoad(vehicle1);

        System.out.println(road.getCountOfPersons());
    }

    @Test
    public void test3() {
        Road road = new Road();

        Bus vehicle1 = new Bus(1);

        Person person1 = new Person(1, "John");
        Person person2 = new Person(2, "Sam");

        try {
            vehicle1.in(person1);
            vehicle1.in(person2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        road.addVehicleToRoad(vehicle1);

        System.out.println(road.getCountOfPersons());
    }
}