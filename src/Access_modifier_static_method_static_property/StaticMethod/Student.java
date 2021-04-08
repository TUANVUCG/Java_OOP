package Access_modifier_static_method_static_property.StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college ="DBRR";
    Student(int r, String n ){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "RRDB";
    }
    void display(){
        System.out.println("rollno : "+ rollno + " name: "+ name +" college : "+ college);
    }
}
