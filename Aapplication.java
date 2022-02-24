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
            Scanner in=new Scanner(System.in);
            System.out.println("-----------------------Main dashboard---------------------");
            System.out.println();
            
            System.out.println("1. Student Management");
            System.out.println("2. Quit");
            System.out.println("\n Enter your choice");

            Integer choice = in.nextInt();

            switch(choice){
                case 1:
                studentScreen();
                break;

                case 2:
                System.out.println("Program terminated.");
                break;

                default:
                System.out.println("incorrect choide");
            }


    }







    static void studentScreen(){
            Scanner in=new Scanner(System.in);
            System.out.println("-----------------Student Management----------------");
            System.out.println();
            System.out.println("1. Create Student");
            System.out.println("2. Read all Student");
            System.out.println("3. Read Individual Student data");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Quit");

            System.out.println("\n Enter your Choice");
            Integer choice= in.nextInt();

            switch(choice){

                    case 1:
                    createStudent();
                    break;

                    case 2:

                    break;

                    case 3:

                    break;

                    case 4:

                    break;

                    case 5:

                    break;

                    case 6:

                    break;



        }

    }

    static void createStudent(){
        Scanner input= new Scanner(System.in);
        System.out.println("-----------------create Student-----------");
        System.out.println();
        System.out.println("First name");
        String firstname= input.nextLine();
        System.out.println("Last name");
        String lastname= input.nextLine();
        System.out.println("Address");
        String address= input.nextLine();
        System.out.println("Phone number");
        Integer phoneNumber= input.nextInt();
    }




}