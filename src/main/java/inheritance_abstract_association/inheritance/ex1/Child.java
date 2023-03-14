package inherance_abstract_association.inheritance.ex1;

public class Child extends Parent {
    @Override
    public void showMessage(){
        System.out.println("Hello Child class");
        super.showMessage();
    }



}
