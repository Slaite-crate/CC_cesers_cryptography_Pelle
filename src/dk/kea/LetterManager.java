package dk.kea;

import java.util.ArrayList;
import java.util.List;

public class LetterManager {
    private List<Letter> letterList;

    public LetterManager() {
        letterList = new ArrayList<>();
        int number = 0;
        char letter = 'a';
        for (int i = 0; i < 26; i++){
            letterList.add(new Letter(number, letter));
            number++;
            letter++;
        }
        letter = 'A';
        for (int i = 0; i < 26; i++){
            letterList.add(new Letter(number, letter));
            number++;
            letter++;
        }
    }

    public List<Letter> getLetterList() {
        return letterList;
    }

    public void setLetterList(List<Letter> letterList) {
        this.letterList = letterList;
    }
}
