public class riding{
    public static void main(String args[]){
        B b =new B();
        b.eat();
        b.ea();

    }
}

class A{
    void eat(){
        System.out.println("A is eating");
    }
}
class B extends A{
    void eat(){
        System.out.println("B is eating");
    }
}