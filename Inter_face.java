//Interface in Java example
import java.util.*;
interface vehicle{
    void changegear(int a);
    void speedup(int a);
    void apply(int a);
}
public class Inter_face implements vehicle{
    int speed;
    int gear;
    int dspeed;


    public void changegear(int a){
        gear=a;
    }
    public void speedup(int a)
    {
        speed=speed+a;
    }
   public void apply(int a){
        dspeed=speed-a;
    }
    public void printst(){
        System.out.println("Speed= "+speed+" Gear= "+gear+" Decremented speed= "+dspeed);
    }
}
class interface2 implements vehicle
{
    int speedn,gearn,dspeed;
    public void changegear(int a)
    {
        gearn=a;
    }
    public void speedup(int a)
    {
        speedn=a;
    }
    public void apply(int a)
    {
        dspeed=speedn-a;
    }
    public void display()
    {
        System.out.println("Gear= "+gearn+" Speed= "+speedn+" Decreased Speed= "+dspeed);
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Inter_face obj=new Inter_face();
        System.out.println("Bike current status:\n");
        obj.changegear(4);
        obj.speedup(20);
        obj.apply(10);
        obj.printst();
        interface2 obj2=new interface2();
        System.out.println("Car status:\n");
        obj2.changegear(3);
        obj2.speedup(50);
        obj2.apply(30);
        obj2.display();
    }
}
