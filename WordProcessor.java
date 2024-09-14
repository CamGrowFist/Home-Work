import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordProcessor {
    public void printUniqueWords(List<String> wordsList) {
        Set<String> uniqueWords = new HashSet<>(wordsList);
        System.out.println("Уникальные слова в списке: " + uniqueWords);
    }

    public void countWords(List<String> wordsList) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsList) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Количество слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}