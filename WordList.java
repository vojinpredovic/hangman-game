package HangMan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Word list class that processes a file and adds all the words into a list to be used for guessing
 */
public class WordList {
    private List<String> words;

    /**
     * Constructs a new word list by reading the file and processing each line (word)
     * @param filePath - String representation of the file path
     */
    public WordList(String filePath) {
        words = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the list of words
     * @return The list of words
     */
    public List<String> getWords() {
        return words;
    }

    /**
     * Generates a random word from the list
     * @return The randomly generated word
     */
    public String generateWord() {
        Random rand = new Random();
        
        return words.get(rand.nextInt(1000));
    }
}
