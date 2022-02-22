import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class fileExample {
    public static void main(String[]args){

        writeFile();
        deleteFile();
    }


   static void writeFile(){
       try{ 
           File fs= new File("Student.txt");
        // if(fs.createNewFile()){
        //     System.out.println("new file has been creatd");
        // }else{
        //     System.out.println("file already exist");
        // }
        // FileWriter fsw= new FileWriter(fs);
        // BufferedWriter fsbw= new BufferedWriter(fsw);
        // fsbw.write("this is text.");

        FileReader fr= new FileReader(fs);
        BufferedReader bfr=new BufferedReader(fr);
        String data="";

        while((data=bfr.readLine())!=null){
            System.out.println(data);
        }
        bfr.close();


    }
    catch(Exception e){
        System.out.println(e);
    }
    }

    static void deleteFile(){
        File fs= new File("student.txt");
        fs.delete();
    }


}
