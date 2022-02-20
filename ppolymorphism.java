
class animal{
    void soundProduce(){
    System.out.println("animal produce sound.");
    }
}

class Dog extends animal{
    @Override
    void soundProduce(){
        super.soundProduce();
        System.out.println("dog bark");
    }    
}

class cat extends animal{
    @Override
    void soundProduce(){
    System.out.println("cat meow meow");
    }
}

class calculator{
   public int add(int num1,int num2){
   return num1+num2;
   }
  
 public double add(double num1, double num2){
  return num1+num2;
  }
}





public class ppolymorphism {
  
   public static void main(String[] args) {
       animal b = new animal();    
       Dog a = new Dog();
           a.soundProduce();
           b.soundProduce();
           
           calculator x= new calculator();
           double c = x.add(4.5, 4.5);
           int m = x.add(1,50);
           System.out.println(m);
           System.out.println(c);
           
           
   }
   
}
