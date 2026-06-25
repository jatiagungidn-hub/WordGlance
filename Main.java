import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordManager manager = new WordManager();

        System.out.println("=== WordGlance ===");
        while (true) {
            String word = takeInput("Word: ", scanner, manager);

            if (word == null) {
                break;
            }

            String meaning = takeInput("Meaning: ", scanner, manager);
            String definition = takeInput("Definition: ", scanner, manager);

            Word newWord = new Word(word, meaning, definition);
            manager.addWord(newWord);
        }

        scanner.close();
    }

    public static String takeInput(String label, Scanner scanner, WordManager manager) {
        while (true) {
            System.out.print(label);
            String input = scanner.nextLine();

            if (input.isBlank()) {
                continue;
            }

            switch (input) {
                case "/list":
                    manager.listAllWords();
                    System.out.println();
                    continue;

                case "/help":
                    continue;

                case "/exit":
                    return null;

                default:
                    return input;
            }
        }
    }
}
