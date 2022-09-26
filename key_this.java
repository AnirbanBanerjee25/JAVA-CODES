//To demonstrate this keyword.
public class key_this {
    int a,b;
    key_this()
    {
        this(40,40);
        System.out.println("Inside default constructor\n");
    }
    //parameterized constructor
    key_this(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Inside parameterized constructor\n");
    }
    public static void main(String args[])
    {
        key_this obj=new key_this();
    }

}
