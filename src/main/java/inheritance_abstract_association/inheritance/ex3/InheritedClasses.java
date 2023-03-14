package inherance_abstract_association.inheritance.ex3;

public class InheritedClasses {
    public void DisplayA() {
        System.out.print("A ");
    }

    public static void main(String[] args){
        F obj1 = new F();
        obj1.DisplayA();
        obj1.DisplayB();
        obj1.DisplayC();
        obj1.DisplayD();
        obj1.DisplayE();
        obj1.DisplayF();
    }
}

class B extends InheritedClasses {
    public void DisplayB(){
        System.out.print("B ");
    }
}
class C extends B {
    public void DisplayC(){
        System.out.print("C ");
    }
}
class D extends C {
    public void DisplayD(){
        System.out.print("D ");
    }
}
class E extends D {
    public void DisplayE(){
        System.out.print("E ");
    }
}
class F extends E {
    public void DisplayF(){
        System.out.println("F");
    }
}
