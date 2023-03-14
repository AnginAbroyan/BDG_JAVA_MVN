package inherance_abstract_association.abstract_class_and_interface.ex1;


//1.	Create an abstract class 'Parent' with an abstract method message(). It has two subclasses ChildOne &
// ChildSecond each having override version of  message() method that prints "This is first subclass" and "This is
// second subclass" respectively. Call the message()  by creating an object for each subclass.
public abstract class Parent {
    public abstract void message();
}
class ChildOne extends Parent{
    @Override
    public void message(){
        System.out.println("This is the 1st subclass.");
    }
}
class ChildTwo extends Parent{
    @Override
    public void message(){
        System.out.println("This is the 2nd subclass.");
    }

}



