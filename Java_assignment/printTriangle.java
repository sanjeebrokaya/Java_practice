public class printTriangle {
    
    public static void main(String[] args) {
        
        for(int row=0;row<=5;row++){
            for (int col= 0; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("_________________\n");

        for(int row=5;row>0;row--){
            for (int col=0; col<row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }










    }
}
