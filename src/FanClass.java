public class FanClass {
    private static final int  SLOW = 1;
    private static final int  MEDIUM = 2;
    private static final int  FAST = 3;
     int speed =SLOW;
     boolean on= false;
     double radius =5;
     String color = "blue";
     public FanClass(){};
     public int getSpeed(){
         return speed;
     }
     public boolean getOn(){
         return on;
     }
     public double getRadius(){
         return radius;
     }
     public String getColor(){
         return color;
     }
     void setSpeed(int speed){
         this.speed=speed;
     }
     void setOn(boolean on){
         this.on = on;
     }
     void setRadius(double radius){
         this.radius = radius;
     }
     void setColor(String color){
         this.color = color;
     }
     public String toString(){
         if(on == true){
             return "Fan is on.\n"+"Speed : "+speed+"\n"+"Color is : "+color+"\n"
                     +"Radius is : "+radius;
         }else{
             return "Fan is off.\n"+"Color is : "+color+"\n"
                     +"Radius is : "+radius;
         }
     }

    public static void main(String[] args) {
        FanClass fanClass1 = new FanClass();
        fanClass1.setSpeed(FAST);
        fanClass1.setRadius(10);
        fanClass1.setColor("Yellow");
        fanClass1.setOn(true);
        System.out.println(fanClass1);
        FanClass fanClass2 = new FanClass();
        fanClass2.setSpeed(MEDIUM);
        fanClass2.setRadius(5);
        fanClass2.setColor("Blue");
        fanClass2.setOn(false);
        System.out.println(fanClass2);;
    }
}
