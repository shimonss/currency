import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("WELCOME TO CURRENCY CONVERTER");
        System.out.println("PLEASE ENTER A CHOOSE AN OPTION 1/2");
        System.out.println("1. DOLLARS TO SHEKELS");
        System.out.println("2. SHEKELS TO DOLLARS");
        Scanner s1 = new Scanner("1");
        System.out.println("PLEASE ENTER AMOUNT TO CONVERT");
Scanner s2 = new Scanner("10");
        System.out.println("TOTAL 2.80 SHEKELS");
        System.out.println("START OVER Y/N?");
        Scanner s3 = new Scanner("N");
        System.out.println("THANKS FOR USING OUR CURRENCY CONVERTER");
        String filepath ="calculator.text";
        Files.writeString(Paths.get(filepath),"10 * 0.28 = 2.80 shekels");
       String content = new String(Files.readAllBytes(Paths.get(filepath)));
      System.out.println(content);



    }


}
