import java.util.*;
public class alphabetical_order {
    void order(String word)
    {
        int i,j,l;
        l=word.length();
        char ch;
        String s=" ";
        for(i=65;i<=90;i++)
        {
          for(j=0;j<l;j++)
          {
              ch=word.charAt(j);
              if(ch==(char)i || ch==(char)(i+32))
                  System.out.print(ch);
          }
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        alphabetical_order ob= new alphabetical_order();
        String str;
        System.out.println("Enter String ");
        str=in.next();
        ob.order(str);
    }
}
