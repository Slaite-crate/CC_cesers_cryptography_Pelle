package dk.kea;

import java.util.List;

public class Crypto {

    private List<Character> letterList;

    public Crypto() {
        LetterManager letterManager = new LetterManager();
        this.letterList = letterManager.getLetterList();
    }

    public String enCrypt(int shift, String message){
        return shifter(shift, message);
    }

    public String deCrypt(int shift, String message){
        return shifter(-shift, message);
    }

    private String shifter(int shift, String message){
        if (shift < 0){
            shift = letterList.size() - ((shift * -1) % letterList.size());
        }
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()){
            result.append(shiftedChar(c, shift));
        }
        return result.toString();
    }

    private char shiftedChar(char c, int shift){
        for (int i = 0; i < letterList.size(); i++){
            if (c == letterList.get(i)){
                for (int j = 0; j < letterList.size(); j++){
                    if (j == (i + shift) % letterList.size()){
                        return letterList.get(j);
                    }
                }
            }
        }
        return c;
    }
}
