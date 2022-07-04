/*Anirban Banerjee*/
class overload
{
    double area(double m)
    {
        return(3.14*m*m);
    }
    double area(double a,double b)
    {
        return(a*b);
    }
    int area(int s)
    {
        return(s*s);
    }
    public static void main(String args[])
    {
        overload ob=new overload();
        int ar2;
        double ar1,ar3;
        ar1=ob.area(5.3);
        ar2=ob.area(8);
        ar3=ob.area(6.2,3.6);
        System.out.println("Area of circle="+ar1);
        System.out.println("Area of square="+ar2);
        System.out.println("Area of rectangle="+ar3);

    }
}