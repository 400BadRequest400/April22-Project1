package exception.compiletimeexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryAndCatch {

    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("/Users/djafarouldslimane/Documents/April22-Project1/git");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            bufferedReader = new BufferedReader(fileReader);
            String str = " ";
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //closing the file reader
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            //closing the bufferedReader
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
