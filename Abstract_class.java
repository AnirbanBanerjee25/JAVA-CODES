import java.util.*;
import java.io.*;
abstract class My
{
    abstract public void calculate();
    abstract public void display();
}

class Abstract extends My
{
    String name;
    int age;
    public Abstract(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void calculate()
    {
        if(age>18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not Eligible to vote");
        }
    }

}
class Abstract_class
{
    public static void main(String args[])throws IOException
    {
        String name;
        int age;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name and age");
        name=in.next();
        age=in.nextInt();
        Abstract ob=new Abstract(name,age);
        ob.display();
        ob.calculate();
    }
}
