package P11;

import java.io.*;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Java\\IP\\Java Interview Coded\\src\\P11\\test.txt");
        if(file.isFile()){
            System.out.println("already has a file");
        }else{
            file.createNewFile();
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("Hello world");
        bufferedWriter.newLine();
        bufferedWriter.write("Welcome to java");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String> strings = new ArrayList<>();

        while((line = bufferedReader.readLine())!= null){
            System.out.println(line);
        }
    }
}
