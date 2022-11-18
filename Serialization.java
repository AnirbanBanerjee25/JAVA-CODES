import java.util.*;
import java.io.*;
class employee implements Serializable
{
    String name;
    static int age,basic_pay;
    static int expenditure;
    static int savings;
    public employee(String name,int age,int basic_pay,int expenditure)
    {
        this.name=name;
        this.age=age;
        this.basic_pay=basic_pay;
        this.expenditure=expenditure;
    }
    public void cal()
    {
        savings=basic_pay-expenditure;
    }
}
class serial1
{
    public static void printdata(employee ob)
    {
        System.out.println("Name: "+ob.name);
        System.out.println("Age: "+ob.age);
        System.out.println("Basic pay:"+ob.basic_pay);
        System.out.println("Expenditure: "+ob.expenditure);
        System.out.println("Savings: "+ob.savings);
    }
}
public class Serialization {
    public static void main(String args[]) throws IOException {
        employee ob = new employee("Anirban", 20, 75000, 35000);
        ob.cal();
        serial1 obj = new serial1();
        try {
            FileOutputStream fout = new FileOutputStream("Employee.txt");
            ObjectOutputStream f = new ObjectOutputStream(fout);//Serialization
            f.writeObject(ob);
            f.flush();
            f.close();
            System.out.println("Data has been serialized.");
            System.out.println("Data before Deserialization:");
            obj.printdata(ob);
        }catch(IOException e){
            System.out.println("IOException is caught\n");
        }
        try {
            ob.expenditure=45000;
            ob.cal();
            FileInputStream fin = new FileInputStream("Employee.txt");
            ObjectInputStream fnn = new ObjectInputStream(fin);
            ob = null;
            ob = (employee) fnn.readObject();
            fin.close();
            fnn.close();
            System.out.println("Data after Deserialization and change in expenditure:");
            obj.printdata(ob);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught.");
        }
        catch(IOException e)
        {
            System.out.println("IOEXception is caught");
        }
    }
}
