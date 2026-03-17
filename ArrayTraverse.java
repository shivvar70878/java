import java.util.*;
class ArrayTraverse {
    public static void main(String args[])
    {int num[]={1,2,3,4,5,6,7,8,9};
    int data,i, found=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to be searched:");
data=sc.nextInt();
for(i=0;i<num.length;i++)
{if(num[i]==data)
    {found=1;
    System.out.print("search successful");
    break;
    }
}
if(found==0)
{System.out.print("search unsuccessful");
}

}
}