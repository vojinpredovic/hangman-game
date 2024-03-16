package HangMan;

import java.util.*;

/**
 * HangMan game
 */
public class HangMan {

    public static void main(String[] args) {
        String relativePath = "HangMan/1000-most-common-words.txt";
        WordList wordList = new WordList(relativePath);
        CharacterList characterList = new CharacterList(wordList.generateWord());
        int numGuesses = 6;
        Figure figure = new Figure();
        Scanner console = new Scanner(System.in);
        
        while (!characterList.isCompleted() && numGuesses > 0) {
            System.out.println(figure.toString());
            System.out.println();
            System.out.println(characterList.toString());
            System.out.println();
            System.out.print("Your guess: ");
            String input = console.nextLine();

            if (input.equals("quit")) {
                console.close();
                break;
            } else {
                boolean g = false;

                if (input.length() == 1) {
                    g = characterList.guessLetter(input.charAt(0));
                } else {
                    g = characterList.guessWord(input);
                }

                if (g == false) {
                    numGuesses--;
                }
                System.out.println("Guesses left: " + numGuesses);
                
                switch(numGuesses) {
                    case 5:
                        figure.drawHead();
                        break;
                    case 4:
                        figure.drawBody();
                        break;
                    case 3:
                        figure.drawLeftArm();
                        break;
                    case 2:
                        figure.drawRightArm();
                        break;
                    case 1:
                        figure.drawLeftLeg();
                        break;
                    case 0:
                        figure.drawRightLeg();
                        break;
                }

                System.out.println("Guessed letters: " + characterList.printGuessed());
                
            }
        }
        System.out.println(figure.toString());
        System.out.println("The word was: " + characterList.revealWord());
    }

}