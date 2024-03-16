package HangMan;

import java.util.*;

/**
 * Character list class that adds functionality to HangMan
 */
public class CharacterList {
    private List<Character> characterList;
    private List<Character> hiddenList;
    private Set<Character> guessedLetters;

    /**
     * Constructs two lists of characters to represent the word and a set to store guessed letters
     * @param word - The word to be guessed
     */
    public CharacterList(String word) {
        characterList = new ArrayList<Character>();
        hiddenList = new ArrayList<Character>();
        guessedLetters = new HashSet<Character>();

        for (char c : word.toCharArray()) {
            characterList.add(c);
            hiddenList.add('_');
        }
    }

    /**
     * Guesses a letter in the character list
     * @param letter The letter to be guessed
     * @return true if a letter is correctly guessed and false if not
     */
    public boolean guessLetter(char letter) {
        boolean set = false;

        for (int i = 0; i < characterList.size(); i++) {
            if (letter == characterList.get(i)) {
                hiddenList.set(i, characterList.get(i));
                set = true;
            }
        }

        if (!set) {
            guessedLetters.add(letter);
        }

        return set;
    }

    /**
     * Guesses the entire word
     * @param word The word to be guessed
     * @return true if the word is correctly guessed and false if not
     */
    public boolean guessWord(String word) {
        //boolean set = false;
        String current = convertToString();

        if (word.equals(current)) {
            for (int i = 0; i < characterList.size(); i++) {
                if (word.charAt(i) == characterList.get(i)) {
                    hiddenList.set(i, characterList.get(i));
                }
            }

            return true;
        }

        return false;
    }

    /**
     * Private helper method that converts the list of characters into a string
     * @return String representation of characters from the character list
     */
    private String convertToString() {
        String result = "";

        for (char c : characterList) {
            result += c;
        }

        return result;
    }

    /**
     * Checks if the user has guessed the word correctly
     * @return True if the user has guessed the word correctly and false if not
     */
    public boolean isCompleted() {
        for (char c : hiddenList) {
            if (c == '_') {
                return false;
            }
        }

        return true;
    }

    /**
     * Prints the word at the end
     * @return String representation of the word
     */
    public String revealWord() {
        String result = "";

        for (char c : characterList) {
            result += c;
        }

        return result;
    }

    /**
     * Prints the guessed letters to the console
     * @return String representation of guessed letters
     */
    public String printGuessed() {
        String result = "";

        for (char c: guessedLetters) {
            result += c + " ";
        }

        return result;
    }

    @Override
    public String toString() {
        String result = "";

        for (char c : hiddenList) {
            result += c + " ";
        }

        return result;
    }
}
