import java.util.*;
public class Multipication {
    public static void main(String args[]) {
        int a, b;
     
    try

    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number=");
        a=obj.nextInt();
        System.out.println("Enter the second number =");
        b=obj.nextInt();
        int c=a*b;
        System.out.println("The multiplication of two numbers is ="+c);
  }
        catch (InputMismatchException e)
        {
            System.out.println("The multiplication is not possible");
        }
        finally{System.out.println("The final output is above");
}
    }}
