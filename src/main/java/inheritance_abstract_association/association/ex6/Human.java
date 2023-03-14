package inherance_abstract_association.association.ex6;

//COMPOSITION
public class Human {
   public int age;
   public String name;

   private Heart aHeart;

   public Human(){
       aHeart = new Heart();
       aHeart.setHeartRate(67);
   }
}
