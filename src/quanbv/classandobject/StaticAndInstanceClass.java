package quanbv.classandobject;

public class StaticAndInstanceClass {
    public static void main(String[] args) {
        // create instance of MyClass
        new MyClass();
        
        /*OUTPUT
        This is static block
        This is non-static/instance block
        MyClass constructor
        */
    }
}
class MyClass {
    /* Non-static (instance) block */
    {
        System.out.println("This is non-static/instance block");
    }

    /* Constructor */
    public MyClass() {
           System.out.println("MyClass constructor");
    }

    /* Static block */
    static {
        System.out.println("This is static block");
    }
}
