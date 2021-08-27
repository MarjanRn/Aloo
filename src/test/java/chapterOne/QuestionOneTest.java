package chapterOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionOneTest {

    QuestionOne questionOne = new QuestionOne();

    @Test
    public void returnsFalseWhenValueIsNull() {
        boolean actualResult = questionOne.isAllCharactersUnique(null);

        assertEquals(false, actualResult);
    }

    @Test
    public void returnsFalseWhenLengthOfValueIsOne() {
        String value = "a";
        boolean actualResult = questionOne.isAllCharactersUnique(value);

        assertEquals(false, actualResult);
    }

}