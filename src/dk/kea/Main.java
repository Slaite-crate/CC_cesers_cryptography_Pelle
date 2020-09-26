package dk.kea;

public class Main {

    public static void main(String[] args) {
        Crypto crypto = new Crypto();
        int shift = 5;
        String str = "abc ABC æøå 123 ,.!=?";
        System.out.println("message: " + str);
        str = crypto.enCrypt(shift, str);
        System.out.println("encrypted: " + str);
        str = crypto.deCrypt(shift, str);
        System.out.println("decrypted: " + str);
    }
}