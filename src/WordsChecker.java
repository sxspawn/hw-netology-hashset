import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private final Set<String> words;

    public WordsChecker(String text) {
        String[] wordsArray = text.split("\\P{IsAlphabetic}+");
        words = new HashSet<>(Arrays.asList(wordsArray));
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}