/*Suman wants to store his academic details permanently in the storage device. The details include.

Create a class “Suman” consist of many fields (name, mark1, mark2, mark3, total and average) and methods.
file() method reads the name, mark1, mark2 and mark3,  and computes total and average. Once the computation is done then writes the Suman’s detail in the file “Suman.txt”. Finally reads the Suman’s detail from file and display on console.
Write a java program to perform the given scenario using Character Stream classes.



Input

Suman

80

90

90



Output

Suman

80

90

90

260

86*/
import java.util.*;
import java.io.*;
class Suman
{
    String name;
    int m1,m2,m3,avg=0,total=0;

    void file()throws IOException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Name");
        name=in.next();
        System.out.println("Enter marks in 3 subjects.");
        m1=in.nextInt();
        m2=in.nextInt();
        m3=in.nextInt();
        total=m1+m2+m3;
        avg=total/3;
        FileWriter f=new FileWriter("Sample.txt");
        f.write(name+'\n'+m1+'\n'+m2+'\n'+m3+'\n'+total+'\n'+avg);
        f.close();
    }
}
class File_handling1
{
    public static void main(String args[])throws IOException
    {
        int i;
        Suman ob=new Suman();
        ob.file();
        FileReader fw=new FileReader("Sample.txt");
        System.out.println("The details entered along with the total marks and avg is:");
        while((i=fw.read())!=-1)
        {
            System.out.print((char)i);
        }
        fw.close();
    }
}