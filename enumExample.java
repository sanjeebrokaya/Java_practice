import java.util.ArrayList;

public class enumExample {


    enum Gender{
        Male,Female
    }



    public static void main(String[]args){

        System.out.println(Gender.Male);

//arry list
        int[] data={1,2,3,4,5};
        ArrayList dataarray= new ArrayList();

        dataarray.add(1);
        dataarray.add(14);
        dataarray.add(15);
        dataarray.add(16);
        dataarray.add(11);

        System.out.println(dataarray.get(4));
        dataarray.remove(1);
        System.out.println(dataarray);

        

    }
    
}
