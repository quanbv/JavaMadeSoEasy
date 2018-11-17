package quanbv.classandobject;

public class StaticAndInstanceSuperClass {
    public static void main(String[] args) {
        //Create instance of SubClass.
        new SubClass();
        /*Output
         SuperClass ----------> static block
         SubClass > static block
         SuperClass ----------> Instance/non-static block
         SuperClass ----------> constructor
         SubClass > Instance/non-static block
         SubClass > constructor
         */
    }
}

/**
* SuperClass
*/
class SuperClass {

   /* Static block */
   static {
      System.out.println("SuperClass ----------> static block");
   }

   /* Non-Static block (Instance block) */
   {
      System.out.println("SuperClass ----------> Instance/non-static block");
   }

   /* Constructor*/
   SuperClass() {
      System.out.println("SuperClass ----------> constructor");
   }
}

/**
* SubClass
*/
class SubClass extends SuperClass {
   
   /* Static block */
   static {
      System.out.println("SubClass > static block");
   }

   /* Non-Static block (Instance block) */
   {
      System.out.println("SubClass > Instance/non-static block");
   }

   /* Constructor*/
   SubClass() {
      System.out.println("SubClass > constructor");
   }
}