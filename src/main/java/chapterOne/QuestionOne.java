package chapterOne;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class QuestionOne {
    public boolean isAllCharactersUnique(String value) {
        return hashSet(value) &&
                bitVector(value) &&
                nLogN(value);
    }

    private boolean nLogN(String value) {
        Set<Character> bst = new TreeSet<>();
        for (char c : value.toCharArray()) {
            if (bst.contains(c))
                return false;
            else
                bst.add(c);
        }
        return true;
    }

    private boolean bitVector(String value) {
        int[] alphabet = new int[26];
        value = value.replaceAll("\\s", "");
        for (char c : value.toCharArray()) {
            if (alphabet[c - 'a'] > 0)
                return false;
            else {
                alphabet[c - 'a']++;
            }
        }
        return true;
    }

    private boolean hashSet(String value) {
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
