import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "apple", "orange", "grape", "banana", "kiwi", "apple", "orange", "melon"};

        List<String> wordsList = Arrays.asList(wordsArray);

        WordProcessor wordProcessor = new WordProcessor();
        wordProcessor.printUniqueWords(wordsList);
        wordProcessor.countWords(wordsList);
    }
}