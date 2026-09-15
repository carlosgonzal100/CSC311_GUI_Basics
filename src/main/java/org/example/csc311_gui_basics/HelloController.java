package org.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloController {

    //I found out that i need to create a variable
    //for each thing that needed to be accessed, thus i
    //created a variable for all the texts and buttons to
    //change them
    @FXML
    private Label noCounter;

    @FXML
    private Label yesCounter;

    @FXML
    private Label nameText;

    @FXML
    private Label questionText;

    @FXML
    private Button yesButton;

    @FXML
    private Button noButton;

    @FXML
    private VBox mainPane;

    private int count1 = 0;
    private int count2 = 0;

    @FXML
    private void incrementYesCounter() {
        count1++;
        yesCounter.setText(String.valueOf(count1));

        updateColors();
    }

    @FXML
    private void incrementNoCounter() {
        count2++;
        noCounter.setText(String.valueOf(count2));

        updateColors();
    }

    /**
     * Title: colorChanger
     * Description: This method changes the colors of all the buttons and text on the
     * screen depending on which button has been clicked more. if both buttons have equal
     * numbers, leave the colors as the default staring colors.
     */

    /* if the yes button has been clicked more than the no button, change the color
     * of the name label to #7E7CD9, the question label color to #FFFD01, change the yes
     * and no button colors to red, with the text inside each button to white. change the noCounter
     * and yesCounter label color to #046307. then make the background of the whole window to #B1f2FF
     */

    private void updateColors() {

        if (count1 > count2) {
            // YES has more votes
            nameText.setStyle("-fx-text-fill: #7E7CD9;");
            questionText.setStyle("-fx-text-fill: #FFFD01;");

            yesButton.setStyle(
                    "-fx-background-color: red;" +
                            "-fx-text-fill: white;"
            );

            noButton.setStyle(
                    "-fx-background-color: red;" +
                            "-fx-text-fill: white;"
            );

            yesCounter.setStyle("-fx-text-fill: #046307;");
            noCounter.setStyle("-fx-text-fill: #046307;");

            mainPane.setStyle("-fx-background-color: #B1F2FF;");
        } else {
            // Counts are equal OR NO has more votes
            nameText.setStyle("-fx-text-fill: gold;");
            questionText.setStyle("-fx-text-fill: black;");

            // Empty style restores the normal JavaFX button appearance
            yesButton.setStyle("");
            noButton.setStyle("");

            // Restore normal counter text
            yesCounter.setStyle("");
            noCounter.setStyle("");

            // Restore normal window background
            mainPane.setStyle("");
        }
    }


}
