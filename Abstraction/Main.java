/**
 * Abstraction in java is a mechanism for hiding implementation details and showing only neccessary info to the user.
 * Abstraction in java can be acheived through:
 *  1.Abstract class
 *  2.Interfaces
 * 
 * Abstract classes contains abstract methods and concrete methods 
 * Abstract methods have only method signature and no body
 * 
 * If a class has abstract method we should mark the whole class as abstract
 */
 
 
 /**
  * -------Abstraction Implementation through abstract class---------
  */

abstract class Demo{
    abstract void greet();
}


class Child extends Demo{
    void greet(){
        System.out.println("Namaste");
    }
}

class Child2 extends Demo{
    void greet()
    {
        System.out.println("Hello");
    }
}
class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        Child2 c2 = new Child2();
        c2.greet();
    }
}
