/*When a member is declared static, it can be accessed before any objects of its class are created
  and without reference to any object.
 */
public class static_key {
    static int a=m1();
    static{
        System.out.println("Inside Static Block\n");
    }
    static int m1()
    {
        System.out.println("From m1()\n");
        return 100;
    }
    public static void main(String args[])
    {
        System.out.println("From main\n");
        System.out.println("Value of a: "+a);
    }
}
