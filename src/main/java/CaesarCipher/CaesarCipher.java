package CaesarCipher;

public class CaesarCipher {
    public static final int ALPHABET_SIZE = 26;

    /**
     * Ciphers a message using a Caesar cipher with the specified offset.
     * Only alphabetic characters (a-z, A-Z) are shifted; others are preserved.
     *
     * @param message The input message to cipher.
     * @param offset  The shift offset (positive or negative).
     * @return The ciphered message.
     * @throws IllegalArgumentException if message is null.
     */
    public String cipher(String message, int offset) {
        if (message == null) {
            throw new IllegalArgumentException("Message cannot be null");
        }
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = offsetChar(charArray[i], offset);
        }
        return new String(charArray);
    }

    /**
     * Deciphers a message by applying the negative offset.
     *
     * @param message The input message to decipher.
     * @param offset  The shift offset used for ciphering.
     * @return The deciphered message.
     */
    public String decipher(String message, int offset) {
        return cipher(message, -offset);
    }

    /**
     * Offsets a single character by the specified amount.
     * Only alphabetic characters are shifted; others are unchanged.
     *
     * @param c      The input character.
     * @param offset The shift offset.
     * @return The offset character.
     */
    public char offsetChar(char c, int offset) {
        if (Character.isLowerCase(c)) {
            return (char) (((c - 'a' + offset) % ALPHABET_SIZE + ALPHABET_SIZE) % ALPHABET_SIZE + 'a');
        } else if (Character.isUpperCase(c)) {
            return (char) (((c - 'A' + offset) % ALPHABET_SIZE + ALPHABET_SIZE) % ALPHABET_SIZE + 'A');
        }
        return c;
    }
}
