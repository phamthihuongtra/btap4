package btap4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập đường dẫn tới file");
        String filePath = scanner.nextLine();}

    public void writeFile(String filePath){
        try {
            File file = new File(filePath);

            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}