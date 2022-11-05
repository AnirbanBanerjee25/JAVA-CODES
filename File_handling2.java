/*Anirban wants to store his academic details permanently in the storage device. The details include.

Create a class “Anirban” consist of many fields (name, mark1, mark2, mark3, total and average) and methods.
file() method reads the name, mark1, mark2 and mark3,  and computes total and average. Once the computation is done then writes the Anirban’s detail in the file “Anirban.txt”. Finally reads the Anirban’s detail from file and display on console.
Write a java program to perform the given scenario using Byte Stream classes.*/
import java.util.*;
import java.io.*;
class Anirban
{
    String name;
    int m1,m2,m3,total=0,avg=0;
    void file()throws IOException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name");
        name=in.next();
        System.out.println("Enter Marks in 3 subjects");
        m1=in.nextInt();
        m2=in.nextInt();
        m3=in.nextInt();
        total=m1+m2+m3;
        avg=total/3;
        FileOutputStream fout=new FileOutputStream("Anirban.txt");
        byte a[]=name.getBytes();
        byte b[]=Integer.toString(m1).getBytes();
        byte c[]=Integer.toString(m2).getBytes();
        byte d[]=Integer.toString(m3).getBytes();
        byte e[]=Integer.toString(total).getBytes();
        byte f[]=Integer.toString(avg).getBytes();
        fout.write(a);
        fout.write('\n');
        fout.write(b);
        fout.write('\n');
        fout.write(c);
        fout.write('\n');
        fout.write(d);
        fout.write('\n');
        fout.write(e);
        fout.write('\n');
        fout.write(f);
        fout.close();
    }
}
class File_handling2
{
    public static void main(String args[])throws IOException
    {
        Anirban ob=new Anirban();
        int i;
        ob.file();
        FileInputStream fin=new FileInputStream("Anirban.txt");
        System.out.println("The details entered along with the total marks and avg is:");
        while((i=fin.read())!=-1)
        {
            System.out.print((char)i);
        }
        fin.close();
    }
}