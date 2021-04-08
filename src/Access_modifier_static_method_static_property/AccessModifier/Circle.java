package Access_modifier_static_method_static_property.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(){};
    Circle(double radius){};
    protected double getRadius(){
        return radius;
    }
    protected double getArea(){
        return 2*Math.PI*radius;
    }
}
