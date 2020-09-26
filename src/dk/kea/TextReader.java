package dk.kea;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextReader {

    private StringBuilder text;

    public TextReader(String path){
        File file = new File(path);
        BufferedReader br;
        text = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                text.append(st).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getText() {
        return text.toString();
    }
}

