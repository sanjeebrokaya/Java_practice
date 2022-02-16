import java.util.Scanner;


public class ifCondition {
    public static void main(String[]args){

      // Scanner scanInput= new Scanner(System.in);
        
       //if else
        // int age=scanInput.nextInt();
        // if(age>20){
        //     System.out.println("you can drink alcohol product");
        // }
        // else{
        // System.out.println("You cannot dirnk the alcohol.");
        // }


        //if else if
            // System.out.println("Enter mark for given subjects.");
            // System.out.print("Math: ");
            // int marksMath=scanInput.nextInt();
            // System.out.print("English: ");
            // int marksEnglish=scanInput.nextInt();
            // System.out.print("Social: ");
            // int marksSocial=scanInput.nextInt();
            
            // double percentage=(marksEnglish+marksMath+marksSocial)/3;

            // if(90 <= percentage && percentage>=100){
            //     System.out.println("You got S grade.");
            // }
            // else if(80 <= percentage && percentage>90){
            //     System.out.println("You got A grade.");
            // }
            // else if(70 <= percentage && percentage>80){
            //     System.out.println("You got B grade.");
            // }
            // else if(60 <= percentage && percentage>70){
            //     System.out.println("You got B grade.");
            // }
            // else{
            //     System.out.print("Undefine");
            // }

            //nested if

            String username="anish";
            int pin=1234;
            if(username=="anish"){
                if(pin==1234){
                    System.out.println("Welcome "+username);
                }
                else{
                    System.out.println("your pin was incorrect.");
                }
            }
            else{
                System.out.println("your username was incorrect.");

            }

       
    }

  }
