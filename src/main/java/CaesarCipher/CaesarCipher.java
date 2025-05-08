package CaesarCipher;

public class CaesarCipher {
    public static final char LETTER_A = 'a';
    public static final char LETTER_Z = 'z';
    public static final int ALPHABET_SIZE = 26;

    public String cipher(String message, int offset) {
        offset %= ALPHABET_SIZE;
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                charArray[i] = offsetChar(charArray[i], offset);
            }
        }
        return new String(charArray);
    }

    public char offsetChar(char c, int offset) {
        c += offset;
        if (c < LETTER_A){
            c += ALPHABET_SIZE;
        }
        else if (c > LETTER_Z){
            c -= ALPHABET_SIZE;
        }
        return c;
    }
}
