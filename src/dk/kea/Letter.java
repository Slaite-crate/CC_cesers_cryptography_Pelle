package dk.kea;

public class Letter {
    private int number;
    private char letter;

    public Letter(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "\nLetter{" +
                "number=" + number +
                ", letter=" + letter +
                '}';
    }
}
