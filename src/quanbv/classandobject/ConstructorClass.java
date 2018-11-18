package quanbv.classandobject;

abstract class AbsClass {
    public AbsClass() {
        System.out.println("AbsClass constructor");
    }
}

public class ConstructorClass extends AbsClass{
    
    public ConstructorClass() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        new SubClassCons();
        AbsClass obj1 = new ConstructorClass();
//        AbsClass obj=new AbsClass(); //compilation error
        /* Output
         constructor of SuperClass
         constructor of SubClass
         */
    }
}

class SuperClassCons{
    SuperClassCons(){
          System.out.println("no-arg constructor of SuperClass");
    }
}

class SubClassCons extends SuperClassCons{
    SubClassCons(){
           this(1);
           System.out.println("no-arg constructor of SubClass");
    }
    SubClassCons(int i){
           super();
           System.out.println("int-arg constructor of SubClass");
    }
}
