package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hangman\n" +
                "Guess the word");
        Hangman hangman = new Hangman();
        hangman.read_file("words.txt");
        hangman.get_user_input();
    }
}
