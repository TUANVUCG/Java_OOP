import java.util.Scanner;

public class QuadraticEquation {
    private double a ;
    private double b ;
    private double c ;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    void setA(double a) {
        this.a = a;
    }

    void setB(double b) {
        this.b = b;
    }

    void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = b*b-(4*a*c);
        return delta;
    }
    public double getRoot1(){
        double r1 = (-b + Math.sqrt(getDiscriminant()))/(2*a);
        return r1;
    }public double getRoot2(){
        double r2 = (-b - Math.sqrt(getDiscriminant()))/(2*a);
        return r2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a : ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.printf("Enter b : ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.printf("Enter c : ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()==0){
            System.out.println("Root is : "+ quadraticEquation.getRoot1());
        }else if(quadraticEquation.getDiscriminant()>0){
            System.out.println("Root 1 : " + quadraticEquation.getRoot1());
            System.out.println("Root 2 : " + quadraticEquation.getRoot2());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
