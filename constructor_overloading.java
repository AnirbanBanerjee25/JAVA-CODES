import java.util.*;
public class constructor_overloading {
    double length,width,height;
    int boxno;
    //Default constructor
    constructor_overloading()
    {
        length=width=height=0;
    }
    //Parameterized constructor
    constructor_overloading(double a,double b,double c,int num)
    {
        length=a;
        width=b;
        height=c;
        boxno=num;
    }
    constructor_overloading(int num)
    {
        this();//Calling Default Constructor
        boxno=num;
    }
    void display()
    {
        System.out.println("Length= "+length+" Width= "+width+" Height= "+height+" Box number="+boxno);
    }

    public static void main(String args[]) {
        constructor_overloading obj = new constructor_overloading(10.2,20.5,30.0,8);
        constructor_overloading obj1=new constructor_overloading(7);
        obj.display();
        obj1.display();
    }
}

