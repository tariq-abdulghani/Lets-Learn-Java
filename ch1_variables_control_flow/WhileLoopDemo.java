package ch1_variables_control_flow;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class WhileLoopDemo {
    public static void main(String[] args) throws IOException {

//        // looping until condition is false
//        int count = 0;
//        while (count<10){
//            System.out.println(count);
//            count++;
//        }

        readFile("CH1.md");
    }


    public static void readFile(String fileName) throws IOException {
        var file = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = file.readLine())!= null){
            System.out.println(line);
        }

//        do{
//            line = file.readLine();
//            System.out.println(line);
//        }while (line!=null);

        file.close();
    }

}
