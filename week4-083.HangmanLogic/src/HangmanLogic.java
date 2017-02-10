
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        String guess = letter.toUpperCase();
        if (guessedLetters.contains(guess)) {
        } else {
            if (!this.word.contains(guess)) {
                this.numberOfFaults++;
                this.guessedLetters += guess;
            } else {
                this.guessedLetters += guess;
            }
        }
    }

    public String hiddenWord() {
        String wordAfter = "";
       
            for (int i = 0; i < word.length(); i++) {
                char letter = this.word.charAt(i);
                String aString = "" + letter;
                if (this.guessedLetters.contains(aString)) {

                    wordAfter += aString;
                } else {
                    wordAfter += "_";
                }

            }

        
        return wordAfter;
    }
}
