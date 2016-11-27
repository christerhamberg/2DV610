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



xx. Create a score class with the different options from the WWW page 
--------------------------------------------------------------------------------------------------------
http://www.spelregler.org/yatzy-regler/
https://sv.wikipedia.org/wiki/Yatzy
