public class factorial {
    public static void main(String[]args){

    int num=0;
     num=factorial(4);

     System.out.println(num);

    }


static int factorial (int number){

    if(number==0){
        return 1;
    }
    else{
        return number*factorial(number-1);

    }

}



}
