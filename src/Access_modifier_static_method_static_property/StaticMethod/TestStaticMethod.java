package Access_modifier_static_method_static_property.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(111,"A");
        Student student2 = new Student(222,"B");
        Student student3 = new Student(333,"C");
        student1.display();
        student2.display();
        student3.display();
    }
}
