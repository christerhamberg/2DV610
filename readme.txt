This is a small project developing the base for a yatzy game TDD style.
Some parts of the design might not be the "best" possible but from an 
implementation point of view. But my aim is not to make the fanciest code possible
but rather do TDD and play around with testing components.

Each method added should result in a RED (Only test case done) push 
Following a GREEN (test case passed, i.e. there is also some code done) push
REFACTOR might be used if some code is cleaned up. Some additional comments might also be used.

Rules of the game: http://www.spelregler.org/yatzy-regler/


1. Getting started and setting up the basics
--------------------------------------------------------

Testing a hook for checking that the correct messages can be displayed / trapped by JUNIT
Method implemented: YatzyMain.displayWelcome()

2. Implementation of a DICE class started 
--------------------------------------------------------

Added functions to freeze the dice 
Methods implemented: isFrozen and freezeDice

3. Implementation of the function to roll the dice
--------------------------------------------------------

Needed function to get a random value between 1 and 6
Method implemented: rollDice

4. A dice that is in froze state should throw an exception
--------------------------------------------------------

In a real case I would probably not have implemented it this way but I choose to do it like this 
to get an Exception assertion into the test case


