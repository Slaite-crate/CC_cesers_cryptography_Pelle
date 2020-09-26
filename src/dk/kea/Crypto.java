package dk.kea;

import java.util.List;

public class Crypto {

    private List<Character> letterList;

    public Crypto() {
        LetterManager letterManager = new LetterManager();
        this.letterList = letterManager.getLetterList();
        for (char a : letterList){
            System.out.println(a);
        }
    }

    public String enCrypt(int shift, String message){
        if (shift < 0){
            shift = letterList.size() - ((shift * -1) % letterList.size());
        }
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()){
            char ch = c;
            for (char l : letterList){
                if (c == l){
                    for (char e : letterList){
                        if (e == (l + shift) % letterList.size()){
                            ch = e;
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
