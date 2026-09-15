package org.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Sphere;

public class HelloController {

    //I found out that i need to create a variable
    //for each thing that needed to be accessed, thus i
    //created a variable for all the texts and buttons to
    //change them

    /**
     * Variables:
     * noCounter: holds the amount of clicks for the no button
     * yesCounter: holds the amount of clicks for the yes button
     * nameText: holds the text with Carlos Gonzalez in it
     * questionText: asks the question, "am i carlos gonzalez?"
     * yesButton: the yes button
     * noButton: the no button
     * mainPane: the main window that holds everything, used to change
     * background color
     * image_1: holds a inserted image
     * image_2: holds an inserted image
     * sphere_1: the image of a sphere
     * sphere_2: the image of a sphere
     * count1: keeps tracks of the amount of clicks for the yes button
     * count2: keeps track of the amount of clicks for the no button
     */
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

    @FXML
    private ImageView image_1;

    @FXML
    private ImageView image_2;

    @FXML
    private Sphere sphere_1;

    @FXML
    private Sphere sphere_2;

    private int count1 = 0;
    private int count2 = 0;

    @FXML
    /*
     * Title: incrementYesCounter() method
     * -- increments the text above the yes button by one
     * when it is clicked. also changes the color
     * scheme of all text and the window. it also changes the
     * images in the window
     */
    private void incrementYesCounter() {
        count1++;
        yesCounter.setText(String.valueOf(count1));

        updateColors();
        updateImage();
    }

    @FXML
    /**
     * Title: incrementNoCounter() method
     * -- increments the text above the no button by one
     * when it is clicked. also changes the color
     * scheme of all text and the window. it also changes the
     * images in the window
     */
    private void incrementNoCounter() {
        count2++;
        noCounter.setText(String.valueOf(count2));

        updateColors();
        updateImage();
    }

    /**
     * Title: colorChanger
     * Description: This method changes the colors of all the buttons and text on the
     * screen depending on which button has been clicked more. if both buttons have equal
     * numbers, leave the colors as the default staring colors.
     */
    private void updateColors() {

        //if yes has more clicks changes to a heavenly color scheme
        if (count1 > count2) {
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
        }
        //if NO has more clicks, changes to a darker color scheme
        else if (count2 > count1) {
            nameText.setStyle("-fx-text-fill: #860111;");
            questionText.setStyle("-fx-text-fill: #FA4113;");

            yesButton.setStyle(
                    "-fx-background-color: #B1F2FF;" +
                            "-fx-text-fill: gold;"
            );

            noButton.setStyle(
                    "-fx-background-color: #B1F2FF;" +
                            "-fx-text-fill: gold;"
            );

            yesCounter.setStyle("-fx-text-fill: white;");
            noCounter.setStyle("-fx-text-fill: white;");

            mainPane.setStyle("-fx-background-color: black;");

        }
        //if clicks of yes and no are the same, changes the color scheme
        //to the original colors
        else {

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

    /**
     * title: updateImage() method
     * -- if the yes button has more clicks, changes the dull spheres to
     * the image of a sun and removes the dull spheres. if the no button has
     * more clicks, changes the dull spheres to the image of a moon and removes
     * the dull spheres. if the buttons have equal clicks, the images are removed from
     * the 2 image views and the spheres are made visible again
     */
    private void updateImage() {
        //if yes has more clicks changes image to a sun
        if (count1 > count2) {
            image_1.setImage(new Image(
                    getClass().getResourceAsStream("sun_photo.jpg")
            ));

            image_2.setImage(new Image(
                    getClass().getResourceAsStream("sun_photo.jpg")
            ));

            sphere_1.setVisible(false);
            sphere_2.setVisible(false);

        }
        //if no has more clicks changes to image of a moon
        else if (count2 > count1) {
            image_1.setImage(new Image(
                    getClass().getResourceAsStream("the_moon_photo.jpg")
            ));

            image_2.setImage(new Image(
                    getClass().getResourceAsStream("the_moon_photo.jpg")
            ));

            sphere_1.setVisible(false);
            sphere_2.setVisible(false);

        }
        //when clicks are equal, there is no image in the imageview boxes
        else {
            image_1.setImage(null);
            image_2.setImage(null);
            sphere_1.setVisible(true);
            sphere_2.setVisible(true);
        }
    }


}
