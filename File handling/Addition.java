class Addition{
    public static void main(String args[])
    {
        int a=10;
        int b=15;
        int c=15;
    
    try {
        int sum = a/(b-c);
        System.out.println("the sum is"+sum);
    }
    catch (ArithmeticException e)
    {
        System.out.println("The sum is not possible");

    }
    finally{System.out.println("The final output is above");

    }
    }
}