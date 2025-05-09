package CaesarCipher;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();

        if (args.length < 3) {
            System.out.println("Usage: java -jar CaesarCipher.jar <cipher|decipher> <text> <offset>");
            return;
        }

        String command = args[0];
        String text = args[1];
        int offset = Integer.parseInt(args[2]);

        if (command.equalsIgnoreCase("cipher")) {
            System.out.println("Encrypted String: " + cipher.cipher(text, offset));
        } else if (command.equalsIgnoreCase("decipher")) {
            System.out.println("Decrypted String: " + cipher.decipher(text, offset));
        } else {
            System.out.println("Unknown command. Use 'cipher' or 'decipher'.");
        }
    }
}
