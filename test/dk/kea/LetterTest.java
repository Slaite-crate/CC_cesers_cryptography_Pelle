package dk.kea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterTest {
    Letter letter;

    @BeforeEach
    void setUp() {
        letter = new Letter(1, 'a');
    }

    @Test
    void testGetLetter(){
        assertEquals('a', letter.getLetter());
    }

    @Test
    void testGetNumber(){
        assertEquals(1, letter.getNumber());
    }
}