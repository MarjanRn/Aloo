package chapterOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsUniqueTest {

    IsUnique isUnique = new IsUnique();

    @Test
    public void returnsFalseWhenValueIsNull() {
        boolean actualResult = isUnique.isAllCharactersUnique(null);

        assertEquals(false, actualResult);
    }

    @Test
    public void returnsFalseWhenLengthOfValueIsOne() {
        String value = "a";
        boolean actualResult = isUnique.isAllCharactersUnique(value);

        assertEquals(false, actualResult);
    }


    @Test
    public void returnsTrueWhenValueIsUnique() {
        String value = "uniqe str";
        boolean actualResult = isUnique.isAllCharactersUnique(value);

        assertEquals(true, actualResult);
    }

    @Test
    public void returnsFalseWhenValueIsNotUnique() {
        String value = "unique string";
        boolean actualResult = isUnique.isAllCharactersUnique(value);

        assertEquals(false, actualResult);
    }
}