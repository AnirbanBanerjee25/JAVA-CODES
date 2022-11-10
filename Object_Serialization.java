import java.util.*;
import java.io.*;
class Anirban2 implements Serializable
{
    String name;
    int m1,m2,m3,total,avg;
    void file()throws IOException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name and marks in 3 subjects");
        name=in.next();
        m1=in.nextInt();
        m2=in.nextInt();
        m3=in.nextInt();
        total=m1+m2+m3;
        avg=total/3;
    }
}
public class Object_Serialization {
    public static void main(String args[])throws IOException,ClassNotFoundException{
        Anirban2 ob=new Anirban2();
        ob.file();
        FileOutputStream f=new FileOutputStream("Object.txt");
        ObjectOutputStream fout=new ObjectOutputStream(f);
        fout.writeObject(ob);
        fout.flush();
        fout.close();

        ObjectInputStream fw=new ObjectInputStream(new FileInputStream("Object.txt"));
        Anirban2 obj1=(Anirban2)fw.readObject();
        System.out.println("The Details are:");
        System.out.println(obj1.name);
        System.out.println(obj1.m1);
        System.out.println(obj1.m2);
        System.out.println(obj1.m3);
        System.out.println(obj1.total);
        System.out.println(obj1.avg);
    }
}
