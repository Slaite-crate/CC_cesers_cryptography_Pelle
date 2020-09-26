package dk.kea;

public class Main {

    public static void main(String[] args) {
        TextReader tx = new TextReader("C:\\Users\\Pelle\\IdeaProjects\\CC_cesers_cryptography_Pelle\\src\\dk\\kea\\alice.txt");
        Crypto crypto = new Crypto();
        int shift = 25;
        String str = tx.getText();
        str = crypto.enCrypt(shift, str);
        System.out.println("encrypted: " + str);
        str = crypto.deCrypt(shift, str);
        System.out.println("decrypted: " + str);
    }
}