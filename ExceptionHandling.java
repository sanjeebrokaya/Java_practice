public class ExceptionHandling {
    public static void main(String[] args){

    try{
    System.out.println(divide(1,0));
    }
    catch(Exception e){
    System.out.println(e);
}

    }

static int divide(int num1, int num2){

    return num1/num2;
}

}
