package dk.kea;

import java.util.List;

public class Crypto {

    private List<Letter> letterList;

    public Crypto() {
        LetterManager letterManager = new LetterManager();
        this.letterList = letterManager.getLetterList();
    }

    public String enCrypt(int shift, String message){
        if (shift < 0){
            shift = letterList.size() - ((shift * -1) % letterList.size());
        }
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()){
            char ch = c;
            for (Letter l : letterList){
                if (c == l.getLetter()){
                    for (Letter e : letterList){
                        if (e.getNumber() == (l.getNumber() + shift) % letterList.size()){
                            ch = e.getLetter();
                            break;
                        }
                    }
                    break;
                }
            }
            result.append(ch);
        }
        return result.toString();
    }

    public String deCrypt(int shift, String message){
        return enCrypt(-shift, message);
    }
}
