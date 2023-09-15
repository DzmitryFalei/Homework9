import java.util.HashMap;
import java.util.Map;

public class CharsCount {

    public Map<Character, Integer> getCharsCount(String str) {

        Map<Character, Integer> letters = new HashMap<>();
        char[] lettersArray = str.toCharArray();

        for (char c : lettersArray) {
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.putIfAbsent(c, 1);
            }
        }

        return letters;
    }
}
