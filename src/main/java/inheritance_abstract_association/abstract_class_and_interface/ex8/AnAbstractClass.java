package inherance_abstract_association.abstract_class_and_interface.ex8;

public abstract class AnAbstractClass {
    public AnAbstractClass(){
        System.out.println("This is constructor of abstract class");
    }
    public abstract void aMethod();
    public void nonAbstractMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}
