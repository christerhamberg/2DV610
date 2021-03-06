This is a small project developing the base for a yatzy game TDD style.
Some parts of the design might not be the "best" possible but from an 
implementation point of view. But my aim is not to make the fanciest code possible
but rather do TDD and play around with testing components.

Each method added should result in a RED (Only test case done) push 
Following a GREEN (test case passed, i.e. there is also some code done) push
REFACTOR might be used if some code is cleaned up. Some additional comments might also be used.

Rules of the game: http://www.spelregler.org/yatzy-regler/


1. Getting started and setting up the basics
--------------------------------------------------------------------------------------------------------

Testing a hook for checking that the correct messages can be displayed / trapped by JUNIT
Method implemented: YatzyMain.displayWelcome()



2. Implementation of a DICE class started 
--------------------------------------------------------------------------------------------------------

Added functions to freeze the dice 
Methods implemented: isFrozen() and freezeDice()



3. Implementation of the function to roll the dice
--------------------------------------------------------------------------------------------------------

Needed function to get a random value between 1 and 6
Method implemented: rollDice()



4. A dice that is in froze state should throw an exception
--------------------------------------------------------------------------------------------------------

In a real case I would probably not have implemented it this way but I choose to do it like this 
to get an Exception assertion into the test case
Method changed: rollDice()


5. Adding a few more classes and test case 
--------------------------------------------------------------------------------------------------------

It should be possible to unfreeze a dice, get the last rolled value 
(note 0 is a default value if dice has not been rolled) and it should 
be possible to reset the dice. 
Methods implemented: getValue (), unfreezeDice(), resetDice()

6. The game will also need to be able to read data from the Keyboard
--------------------------------------------------------------------------------------------------------

The testing can be done in a few ways the better way is probably to hookup
the System.in function in the same way as System.out was hooked
Methods implemented: getKbValue ()

7. Add a Player class
--------------------------------------------------------------------------------------------------------

It should only store the name of the player
It will then be extended with a score class that handles counting of the scores for the player
Methods implemented: setName (), getName()

8. Score
--------------------------------------------------------------------------------------------------------

First part of the implementation is to handle the bottom of the scoring card
And just for fun I will probably make a rule class and connect that to an interface then it will be easy to extend the 
set of rules

The Score class should store the current total score, the current "bottom half score" and bonus
Lets start implementation of the bottom half of the scoring table
Methods implemented: getTotalScore(), getBottomTotalScore(), isBonus()

9.Added a FakeScore class 
--------------------------------------------------------------------------------------------------------

This is just a way of working that I've used before to be able to monipulate the values prior to implementation of
propper setters or functions that calculates something. It is a way of mocking that we use often when we don't want
to implement a real set method. The drawback is that it requires the values to be visible hence that is why totalScore
is changed to protected in this commit

10. Just a Refatoring step
--------------------------------------------------------------------------------------------------------
Just a Refatoring step to make the Object oriented model a bit clearer it makes more sense that Player Extends Score 
and not vise versa so this step corrects this logical "error".  


11. Adding methods to the Score Class
--------------------------------------------------------------------------------------------------------
Mehod Implemented: getBottomTotalScore()


12. Adding methods to the Score Class
--------------------------------------------------------------------------------------------------------
Mehod Implemented: isBonus()

13. Lets start SWINGING
--------------------------------------------------------------------------------------------------------
Originally I was thinking of making a console based game as I'm no big fan of GUIs they just take too much time
to implement... But on the other hand a console based yatzy game is something that no one will ever play anoymore
so Lets start adding some GUI components and connect the classes into the game that we have already made.

Methods to be implemented: Class ViewGui

14. Add the 5 Dices to the board
--------------------------------------------------------------------------------------------------------
Lets add them now as I'd like to have them on the top and I'll use a GridBagLayout (I h#�%te developing guis...)
The Dices should be shown as pictures hence I'll add a few GIFs into the model and by default the '6' will be shown

Needed Methods are: setupBoard ()   A function that sets up all components in the end. Added already now as
                                    I will use it to initialize the JPane and BrigBag layout

                    addComponent () Adds a component in a GridBag layout
                    addDice ()      Adds the dice (with an icon) DEFAULT = 6
                    updateDice ()   Changes the dice value (needed when roll is implemented)


15. Add a roll dice button and freeze indicators
--------------------------------------------------------------------------------------------------------
At row 3 a freeze checkbox will be added to freeze all Icons
At row 4 in the middle of the icons a New Game / Roll should be added


16. Add get/set name of two players
--------------------------------------------------------------------------------------------------------

Add 2 TextFields where the name of the players are entered


17. Add a basic state machine for rolling the dices
--------------------------------------------------------------------------------------------------------
Start of the game radomize which player that starts the game

First turn, it should not be possible to freeze any dices
Secod turn any dice can be forzen
Third turn no deices 

Roll Dice button should change description


18. Add an info field on the top showing what is going on...
--------------------------------------------------------------------------------------------------------
Info text 


19. Add a quit button
--------------------------------------------------------------------------------------------------------
Just a butto to exit the game (no are you very very very sure question is used)


20. Add the score and implement the rules functions
--------------------------------------------------------------------------------------------------------
The rules will be implemented as an interface and then added one rule at the time. 
A rule can hence be made optional etc.




xx. Start putting all the things together into a working game
--------------------------------------------------------------------------------------------------------



Rules of the game collected from:
--------------------------------------------------------------------------------------------------------
http://www.spelregler.org/yatzy-regler/
https://sv.wikipedia.org/wiki/Yatzy
