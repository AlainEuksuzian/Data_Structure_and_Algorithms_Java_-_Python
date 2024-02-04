package chapter_2.Question_2;

public class Fish extends Animal{

   private final String type = "fish";

   Fish(){}

   @Override
   public String getType() {
       return this.type;
   }

   @Override
   public String toString() {
       return this.type;
   }

   @Override
   public boolean equals(Object obj) {
       if (obj == null){
        return false;
       }
       else if (!(obj instanceof Fish)){
        return false;
       }
       else {
        Fish otherObj = (Fish) obj;
        return this.getType().equalsIgnoreCase(otherObj.getType());
       }
   }
}
