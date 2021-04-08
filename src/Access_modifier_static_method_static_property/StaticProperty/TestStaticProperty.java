package Access_modifier_static_method_static_property.StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes","Germany");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("BMW","Germany");
        System.out.println(Car.numberOfCars);
    }
}
