/**
 * ----------------Inheritance in Java----------------
 * A class acquiring the properties and behaviour of another class 
 * Can be achieved through ''extends' keyword
 * 
 */


/**
 * ---------------Inheritance Implementation----------------
 */
class Parent{
    
    
    void hello(){
        System.out.println("HELLO FROM PARENT");
    }
}

class Child extends Parent{
    
    
}
class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.hello();
    }
}
