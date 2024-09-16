package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman {

    public void read_file(String fileName) {
        try{
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String word = scanner.next();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void get_user_input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the missing letter: ");
        String guess = scanner.next();
    }
}
