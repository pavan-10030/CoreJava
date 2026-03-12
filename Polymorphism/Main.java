/**
 * ---------------Polymorphism---------------------
 * 
 * Polymorphism: One having many forms
 * In java polymorphism can be acheived through:
 *  1.Method Overloading
 *  2.Method Overriding
 *  3.Loose coupling
 * 
 * Loose Coupling:Creating parent type references to child objects is called loose coupling
 * Using parent type reference we can invoke only inherited and overridden methods.We cannot access specialized methods.
 */
 
 
 /**
  * -------------- Polymorphism through loose coupling -----------------
  */


class Plane
{
    void fly()
    {
        System.out.println("Plane Flies....");
    }
}

class CargoPlane extends Plane{
    
    @Override
    void fly()
    {
        System.out.println("Cargo Plane Flies....");
    }
}

class FighterPlane extends Plane
{
    @Override
    void fly()
    {
        System.out.println("Fighter Plane Flies....");
    }
}
class Main {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();
        Plane p;
        p=cp;
        p.fly();
        p=fp;
        p.fly();
    }
}
