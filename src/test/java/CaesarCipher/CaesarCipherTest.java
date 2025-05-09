package CaesarCipher;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CaesarCipherTest {
    private CaesarCipher caesarCipher = new CaesarCipher();

    @Test
    public void testCipheredMessageWithOffset12() {
        String message = "how are you doing today";
        int offset = 12;
        String expected = "tai mdq kag pauzs fapmk";

        String actual = caesarCipher.cipher(message, offset);
        assertEquals(expected, actual);

        String deciphered = caesarCipher.decipher(actual, offset);
        assertEquals(message, deciphered);
    }

    @Test
    public void testCipheredMessageWithOffset1() {
        String message = "HELLO WORLD";
        int offset = 1;
        String expected = "IFMMP XPSME";

        String actual = caesarCipher.cipher(message, offset);
        assertEquals(expected, actual);

        String deciphered = caesarCipher.decipher(actual, offset);
        assertEquals(message, deciphered);
    }

    @Test
    public void testCipheredMessageWithOffset0() {
        String message = "HELLO WORLD";
        int offset = 0;
        String expected = "HELLO WORLD";

        String actual = caesarCipher.cipher(message, offset);
        assertEquals(expected, actual);

        String deciphered = caesarCipher.decipher(actual, offset);
        assertEquals(message, deciphered);
    }

    @Test
    public void testCipheredMessageWithNegativeOffset() {
        String message = "HELLO WORLD";
        int offset = -12;
        String expected = "VSZZC KCFZR";

        String actual = caesarCipher.cipher(message, offset);
        assertEquals(expected, actual);

        String deciphered = caesarCipher.decipher(actual, offset);
        assertEquals(message, deciphered);
    }

    @Test
    public void testEmptyMessage() {
        String message = "";
        int offset = 5;
        String expected = "";

        String actual = caesarCipher.cipher(message, offset);
        assertEquals(expected, actual);

        String deciphered = caesarCipher.decipher(actual, offset);
        assertEquals(message, deciphered);
    }

    @Test
    public void testNullMessage() {
        String message = null;
        int offset = 5;

        try {
            caesarCipher.cipher(message, offset);
        } catch (IllegalArgumentException e) {
            assertEquals("Message cannot be null", e.getMessage());
        }
    }
}
