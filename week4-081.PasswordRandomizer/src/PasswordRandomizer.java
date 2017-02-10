
import java.util.Random;

public class PasswordRandomizer {

    private int passwordLength;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.passwordLength = length;// Initialize the variable
    }

    public String createPassword() {
        // write code that returns a randomized password
        String randomPassword = "";
        for (int i = 0; i < this.passwordLength; i++) {
            int randomNumber = random.nextInt(26);
            char randomSymbol = "abcdefghijklmnopqrstuvwxyz".charAt(randomNumber);
            randomPassword += randomSymbol;
        }
        return randomPassword;
    }
}
