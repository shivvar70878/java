import java.util.*;
public class Table {

    public static void main(String args[])
    {
        Scanner on=new Scanner(System.in);
        int num,c,p;
        System.out.print("Enter the number:");
        num=on.nextInt();
         for(c=1;c<=10;c++)
         {
             p=num*c;
             System.out.println(num+"*"+c+"="+p);
         }
    }
}