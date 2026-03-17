class Base {
    int a;

    Base(int a) {
        this.a = a;

    }

    void show() {
        System.out.println("Base class a is " + a);
    }

}

class Derive extends Base {
    int b;
    Derive(int a,int b)
    {
        super(a);
        this.b=b;

    }

    void show() {
        super.show();
        System.out.println("Derive class a is " + a);
System.out.println("Derive class b is "+b);
}}

class Overriding {
    public static void main(String args[]) {
        Derive D = new Derive(10, 20);
        D.show();
    }
}