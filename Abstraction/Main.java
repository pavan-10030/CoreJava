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
