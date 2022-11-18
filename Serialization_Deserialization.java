//Anirban Banerjee
/*Program to accept details of N number of patients in a Hospital and store them in a file.
If someone wants to see a particular patients details he has to enter the ID of that patient and the program will
display the details of that patient.
 */
import java.util.*;
import java.io.*;
class serial99 implements Serializable
{
    String name,symptom,add;
    long no;
    int age,id;
    int n;
    public serial99(String name,int id,int age,String add,String symptom)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.add=add;
        this.symptom=symptom;
    }
}
public class Serialization_Deserialization{
    public static void main(String args[])
    {
        try {
            Scanner in = new Scanner(System.in);
            FileOutputStream fout = new FileOutputStream("ABC.txt");
            ObjectOutputStream f = new ObjectOutputStream(fout);
            String symptom, add;
            long no;
            int age, id;
            int n;
            System.out.println("Enter count");
            n = in.nextInt();
            int i;
            serial99 ob;
            for (i = 0; i < n; i++) {
                System.out.println("Enter name,id,age,address and symptom");
                String name = in.next();
                id = in.nextInt();
                age = in.nextInt();
                add = in.next();
                symptom = in.next();
                ob = new serial99(name, id, age, add, symptom);
                f.writeObject(ob);
            }
            f.flush();
            f.close();
            int idd;
            System.out.println("Enter id to search");
            idd = in.nextInt();
            FileInputStream fin = new FileInputStream("ABC.txt");
            ObjectInputStream few = new ObjectInputStream(fin);
            ob = null;
            System.out.println("Details of the patient are:");
            for(i=0;i<n;i++){
                ob=(serial99)few.readObject();
                if (idd == ob.id) {
                    System.out.println(ob.name);
                    System.out.println(ob.id);
                    System.out.println(ob.age);
                    System.out.println(ob.add);
                    System.out.println(ob.symptom);
                }
            }
            fin.close();
            few.close();
        }
        catch(IOException e){
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException has been caught");
        }

    }
}
