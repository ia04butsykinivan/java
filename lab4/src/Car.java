public class Car<T extends Person> extends Vehicle<T>{
    public Car(int countOfPlaces) {
        super(countOfPlaces);
    }
}
