package quanbv.classandobject;

public class PassByValueExample1 {
    static void m(int i, String str){
        i = 2;
        str = "b";
        System.out.println("\nIn method m(), after making changes to parameters");
        System.out.println("i = " + i + ", str = " + str);
    }

    public static void main(String[] args) {
        int i = 1;  //primitive type
        String str = "a"; //String object
        System.out.println("In main(), BEFORE passing by value i.e. BEFORE calling method m()");
        System.out.println("i = " + i + ", str = " + str);

        m(i, str); //PASS int primitive type and String object by VALUE

        System.out.println("\nIn main(), AFTER passing by value i.e. AFTER calling method m()");
        System.out.println("i = " + i + ", str = " + str);
        /*Output
        In main(), BEFORE passing by value i.e. BEFORE calling method m()
        i = 1, str = a
        
        In method m(), after making changes to parameters
        i = 2, str = b
        
        In main(), AFTER passing by value i.e. AFTER calling method m()
        i = 1, str = a
         */
    }
}
