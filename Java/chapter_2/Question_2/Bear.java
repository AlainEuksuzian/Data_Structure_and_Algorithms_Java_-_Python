package chapter_2.Question_2;

public class Bear extends Animal {
   private final String type = "bear";

   Bear(){}

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
    else if (!(obj instanceof Bear)){
        return false;
    }
    else {
        Bear otherObj = (Bear) obj;
        return this.getType().equalsIgnoreCase(otherObj.getType());
    }

   }

}
