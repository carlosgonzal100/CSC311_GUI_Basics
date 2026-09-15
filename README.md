Title: CSC311_GUI_Basics

Ram ID: R02190266

Course: CSC311 Advanced Programming

Professor: Moaath Alrajab

Author: Carlos Gonzalez with the assistance of CHATGPT and GitHub Copilot

Description: A simple program that tests the basics of JAVAFX using scenebuilder. The program asks a simple question, "am i carlos gonzalez?".
the user clicks the yes or no button. depending on which button has more clicks, if the yes button has more clicks, the color scheme changes to a
light color scheme and 2 pictures of a sun. if the no button has more clicks, the color scheme changes to a dark color scheme and 2 pictures of a moon.
if the button have an equal amount of clicks, the color scheme changes to the starting color scheme and the starter images, which is 2 dull spheres.

resources:

got the sun photo here:
https://similarpng.com/hand-drawn-sun-on-transparent-background-png-2/

got the moon photo here:
https://en.wikipedia.org/wiki/Moon


AI Disclosure:
Note: i used CHAT-GPT to help me install and start a javafx project in intellij
never used javafx before but once i saw all the different views and stuff, i realized
that this is pretty similar to using android studios as i already took a mobile application
development course. I did need some refreshing though so i did use some AI to help me create
button clicking events, here are the prompts i used:

# used this prompt to help me create a button click event, this generated the skeleton
for creating this event. This includes the private int Label; variable which i made 2 of
and renamed each variable to yesCounter and noCounter.. it then made a counter variable
which i made 2 for each counter and renamed them to count1 and count2 and set them to 0.
it then gave me the button click event method which i created 2 of and renamed them to
incrementYesCounter and incrementNoCounter. These 2 methods increment the counter variables
and then set the text of the label to the new value of the count variables.
  1. "how do i increment the number in the label above my button when pressed in scenebuilder"

#used this prompt to change the colors of the whole window depending on the number of the
counters above the yes and no buttons. it gave me the code to change the colors of all the
text in the window. i then realized the variables it was trying to access did not exist and realized
that those variable had to be created with the @FXML annotation in order to access them from
the scenebuilder. Thus i created a variable for each thing i wanted to change and changed the code
CHATGPT gave to me accordingly.
  2. #if the yes button has been clicked more than the no button, change the color
     of the name label to #7E7CD9, the question label color to #FFFD01, change the yes
     and no button colors to red, with the text inside each button to white. change the noCounter
     and yesCounter label color to #046307. then make the background of the whole window to #B1f2FF


 #used this prompt to learn how to insert photos into my window. i lawrned that i had to
 load up the photo in a variable first before doing anything with it. very similar to when
 i had to add photos in my mobile application. i asked chatgpt for this one. this prompt
 generated the skeleton for the method fot updating pictures, it also generated me variables
 to load up my sun and moon pictures after i put them in my resources folder. it then generated me
 the skeleton for the updateImage() method
   3. "how do i switch the photo depending on the color scheme, a sun for yes and a moon for no"

 #Prompts used fo updateColors() method:

    if the yes button has been clicked more than the no button, change the color
    of the name label to #7E7CD9, the question label color to #FFFD01, change the yes
    and no button colors to red, with the text inside each button to white. change the noCounter
    and yesCounter label color to #046307. then make the background of the whole window to #B1f2FF
     

    if the no button has been clicked more than the yes button, change the color of the name
    label to #860111, the question label to #FA4113, the yes and no button to #B1f2FF, the text inside
    each button to gold, change the yes and no counter labels to white, then make the background of the
    whole window black
