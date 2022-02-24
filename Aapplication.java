import java.util.Scanner;

public class Aapplication{

    public static void main (String[]args){


    loginScreen();
}

static void loginScreen(){
    boolean reload= true;
    Scanner _input= new Scanner (System.in);
    System.out.println("--------------------Welcome to login Screen-----------");
    System.out.println();
    System.out.println("Enter username");
    String username= _input.nextLine();
    System.out.println("Enter password");
    String password= _input.nextLine();


    if(username=="admin"|| username.equals("admin")){
        if(password=="admin"|| password.equals("admin")){

            maindashboard();
            reload=true;

        }else{
            System.out.println("Invalid password");
        }

    }else{
        System.out.println("Invalid username");
    }

    while(reload){
    System.out.println("Do you want to continue Y/N");
    String choice= _input.nextLine();

    if(choice=="Y"|| choice.equals("Y")){
               
                loginScreen();

        }else{

            reload = false;
            System.out.println("Program has been terminated");
        }
    }
}
static void maindashboard(){
    System.out.println("Main dashboard");


    
}


}