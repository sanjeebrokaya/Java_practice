import javax.naming.spi.DirStateFactory.Result;

public class methodOverloading {


    static int add(int num1, int num2){
        System.out.println("Int type function");
        int result=num1+num2;                
        return result;
    }

    static double add(double num1, double num2){
        System.out.println("double function");
        return num1+num2;
    }

    static double add(double num1, double num2,double num3){
        System.out.println("function overriding.");
        return num1+num2+num3;
    }



    public static void main(String[]args){

        int x= add(1,2);
        double y= add(2.3, 4.55);
        double z= add(1.1,2.3,5.6);
       
        // System.out.println(add(1,6));
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
   

}

