import java.util.*;
class Prime{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int num,c,nof=0;
        System.out.println("Enter the numbers:");
        num=ob.nextInt();
        for(c=1;c<=num;c++)
        {
            if(num%c==0)
            { nof++;}
        }
        if(nof==2){
            System.out.print(num+"is a prime number");
        }
        else{
            System.out.print(num+" is not a prime number");
        }
        
        }
    }