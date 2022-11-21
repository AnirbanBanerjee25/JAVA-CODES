//Sample code to understand Serialization and Deserialization.
import java.io.*;
import java.util.*;
class Myexeption extends Exception
{
    Myexeption(String s)
    {
        System.out.println(s);
    }
}
class supersinger implements Serializable
{
    String name,add,gender;
    int score;
    int age;
    public supersinger(String name,String add,String gender,int score,int age)
    {
        this.name=name;
        this.add=add;
        this.gender=gender;
        this.score=score;
        this.age=age;
    }
}
class Practisenew
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        supersinger ob;
        int n=0;
        try {
            String name, add, gender;
            int score;
            int age;
            int i;
            FileOutputStream fout = new FileOutputStream("Singer.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            System.out.println("Enter no of participants");
            n = in.nextInt();
            if (n < 0) throw new Myexeption("Invalid Input");
            for (i = 0; i < n; i++) {
                System.out.println("Enter name of participant "+(i+1));
                name = in.next();
                System.out.println("Enter address of participant "+(i+1));
                add = in.next();
                System.out.println("Enter gender of participant "+(i+1));
                gender = in.next();
                System.out.println("Enter score of participant "+(i+1));
                score = in.nextInt();
                System.out.println("Enter age of participant "+(i+1));
                age = in.nextInt();
                ob = new supersinger(name, add, gender, score, age);
                out.writeObject(ob);
            }
            out.flush();
            out.close();
        }
        catch(Exception e){};
        try{

            FileInputStream fin=new FileInputStream("Singer.txt");
            ObjectInputStream f=new ObjectInputStream(fin);
            ob=null;
            int i;
            for(i=0;i<n;i++)
            {
                ob=(supersinger)f.readObject();
                if(ob.age<18)throw new Myexeption("Invalid age");
                if(ob.gender.equals("Male"))
                {
                    if(ob.score>50)
                    {
                        System.out.println(ob.name+" has qualified");
                    }
                    else{
                        System.out.println(ob.name + " Please try next time!");
                    }
                }
                else if(ob.gender.equals("Female"))
                {
                    if(ob.score>40)
                    {
                        System.out.println(ob.name+" has qualified");
                    }
                    else
                    {
                        System.out.println(ob.name+" Please try next time!");
                    }
                }

            }
        }
        catch(Exception e){};
    }
}
