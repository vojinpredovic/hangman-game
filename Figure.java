package HangMan;

/**
 * Figure class that prints the hangman figure
 */
public class Figure {
    private String figure;

    /**
     * Constructs a string representation of a hangman figure
     */
    public Figure() {
        figure = "";
        figure += " ______\n";
        figure += " |    |\n";
        figure += " |     \n";
        figure += " |     \n";
        figure += " |     \n";
        figure += "_|_    \n";

    }

    /**
     * Draws the head of the figure
     */
    public void drawHead() {
        figure = "";
        figure += " ______\n";
        figure += " |    |\n";
        figure += " |  ( )\n";
        figure += " |     \n";
        figure += " |     \n";
        figure += "_|_    \n";
    }

    /**
     * Draws the body of the figure
     */
    public void drawBody() {
        figure = "";
        figure += " ______\n";
        figure += " |    |\n";
        figure += " |  ( )\n";
        figure += " |   | \n";
        figure += " |     \n";
        figure += "_|_    \n";
    }

    /**
     * Draws the left arm of the figure
     */
    public void drawLeftArm() {
        figure = "";
        figure += " ______\n";
        figure += " |    |\n";
        figure += " |  ( )\n";
        figure += " |  -| \n";
        figure += " |     \n";
        figure += "_|_    \n";
    }  

    /**
     * Draws the right arm of the figure
     */
    public void drawRightArm() {
        figure = "";
        figure += " ______\n";
        figure += " |    |\n";
        figure += " |  ( )\n";
        figure += " |  -|-\n";
        figure += " |     \n";
        figure += "_|_    \n";
    }

    /**
     * Draws the left leg of the figure
     */
    public void drawLeftLeg() {
        figure = "";
        figure += " ______\n";
        figure += " |    |\n";
        figure += " |  ( )\n";
        figure += " |  -|-\n";
        figure += " |  /  \n";
        figure += "_|_    \n";
    }

    /**
     * Draws the right leg of the figure
     */
    public void drawRightLeg() {
        figure = "";
        figure += " ______\n";
        figure += " |    |\n";
        figure += " |  ( )\n";
        figure += " |  -|-\n";
        figure += " |  / \\\n";
        figure += "_|_    \n";
    }

    
    @Override
    public String toString() {
        return figure.toString();
    }
}
