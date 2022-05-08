package exception.compiletimeexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowKeyWord {

    public static void main(String[] args) throws IOException {



        FileReader fileReader = new FileReader("/Users/djafarouldslimane/Documents/April22-Project1/git");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str = " ";
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);

        }
        //closing the file reader
            fileReader.close();

        //closing the bufferedReader
            bufferedReader.close();



    }
}
