package inherance_abstract_association.inheritance.ex2;

public class SubClass extends SuperClass {
    public String message = "Hello SubClass class";


   public SubClass(){
       System.out.println(super.message);
       System.out.println(message);
   }


}
