import java.util.*;
class Reverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,d,rev=0;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        while(num!=0)
        { d=num%10;
            rev=rev*10+d;
            num=num/10;

        }
        System.out.print("reversed number:"+rev);
        if(rev==num)
        {
            System.out.print("The number is palindrome");
        }
        else{
            System.out.print("The number is not palindrome");
        }

    }
}
