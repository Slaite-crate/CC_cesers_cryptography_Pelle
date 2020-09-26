package dk.kea;

import java.util.ArrayList;
import java.util.List;

public class LetterManager {
    private List<Character> letterList;

    public LetterManager() {
        letterList = new ArrayList<>();
        char letter = 'a';
        for (int i = 0; i < 26; i++){
            letterList.add(letter);
            letter++;
        }
        letter = 'A';
        for (int i = 0; i < 26; i++){
            letterList.add(letter);
            letter++;
        }
    }

    public List<Character> getLetterList() {
        return letterList;
    }

    public void setLetterList(List<Character> letterList) {
        this.letterList = letterList;
    }
}
