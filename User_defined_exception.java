import java.util.*;
class Myexception extends Exception
{
    public Myexception(String s)
    {
        System.out.println(s);
    }
}
class SmartHome
{
    String P;
    String Products[]={"Cooker","Cot","Kettle","Oven","Pillow","Sofa","Stove","TV","WashingMachine"};
    int Prices[]={1500,5000,1200,7000,500,15000,6500,21000,18000};
    void read()
    {
        Scanner in=new Scanner(System.in);
        P=in.next();
    }
    void compute()
    {
        try{
            if(P.equals("Cooker") || P.equals("Cot") || P.equals("Kettle") || P.equals("Oven") || P.equals("Pillow") || P.equals("Sofa") || P.equals("Stove") || P.equals("TV") || P.equals("WashingMachine"))
            {
                int i;
                for(i=0;i<9;i++)
                {
                    if(P.equals(Products[i]))
                    {
                        System.out.println(Prices[i]);
                    }
                }
            }
            else
            {
                throw new Myexception("Product not found");
            }
        }
        catch(Myexception e){}
    }
}
class User_defined_exception
{
    public static void main(String args[])
    {
        SmartHome ob=new SmartHome();
        ob.read();
        ob.compute();
    }
}