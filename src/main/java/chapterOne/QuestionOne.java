package chapterOne;

import java.util.HashSet;
import java.util.Set;

public class QuestionOne {
    public boolean isAllCharactersUnique(String value) {
        Set<Character> characters = new HashSet<>();
        if (value == null || value.length() < 2) return false;
        for (char c : value.toCharArray()) {
            if (!characters.add(c)) {
                return false;
            }
        }
        return true;
    }
}
