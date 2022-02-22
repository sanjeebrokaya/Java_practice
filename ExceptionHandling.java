public class ExceptionHandling {
    public static void main(String[] args){

    //     try{
    //         System.out.println(divide(1,0));
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }


    // try{
    //     String data=null;
    //     System.out.println(data);
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }


        try{
            int[] data={1,2};
            System.out.println(data[5]);

        }
        catch(Exception e){
            System.out.println(e);
        }





    }

static int divide(int num1, int num2){

    return num1/num2;
}




}
