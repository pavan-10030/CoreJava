
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
