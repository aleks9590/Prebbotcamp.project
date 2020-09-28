# oleksandra-helga-project
1.Create a new java package with a class TicTacToe.
2.Print out a game board with 3 rows and 3 columns (by using a 2 dimensional array). 
3.Create a method that will place the x or the o (depending on which player is doing the input) in the position that 
each of the users will have chosen. The placement of x or o will continue until all the spaces will be filled in.
4.Define 2 users : “player1”, ‘player2’ and assign characters to them - o for one, x for the other
5.Using the scanner, we will receive input from both users (in squares 1 - 9)
6.Create a method to check the winner ( creating all the winning positions)
7.Create array lists for each player to check their placement of symbols
8.Create a method to congratulate whoever has won or to print out a message "It's a tie"if it is a tie.
9.Make sure, that it is not possible to make any changes in the squares, that are already taken.

  oleksandra - helga - project
  
DESCRIPTION
During these few last weeks we got familiar with numerous tutorials. We tried to repeat some of them, did some analysis of different codes and finally made this version of the Tic Tac Toe game.

 So first of all, we decided that we will create the game Tic Tac Toe. A game that prints out the board and then asks the user(player - “X”) for his input (two integers, determining the placement of the player’s sign) . After player 1 has made his move, the game prints out a new board with the first input already in the board and asks player  - “O” to make his move. Then players are taking turns until the board is full (made possible by using if-else statement).

Description of steps for writing code for this game:

Creation of package easyGame and java class 'game'.
Creation of java class ‘gameOutput' where the main method of the game is stored.
In java class ‘game' - initialisation of 2 dimensional array that creates a game board ‘board' containing 9 game bars and a variable ‘player’  that will display either X or O, signalling the turn of the respective player.
Creation of a public constructor ‘game’ where we create the board and are noting who will be the first player(X or O).
Creation of a method ‘createBoard’ that ensures that all the bars of the game are empty in the beginning of the game. Using nested for loop we loop through the three columns and three rows to set each bar to ‘  ‘(empty bar).
Creation of a method ‘printBoard' that will print out the game board using nested for loop. First, we use characters ‘~’ for printing out the first horizontal line, then the for loop loops through three rows and  calls to print a character ‘| ’ , another for loop that loops through rows to create columns and prints out a new '~' line after looping through every line.
Creation of a method ‘thereIsNoSpace' that loops through rows and columns, searching for an empty bar   (‘  ‘) and checks if the game board is full or not.
Creation of a method ‘lookForWinner’ that checks if the player has won(has got 3 consecutive X or O signs in a row/column/diagonal). So under this method we have three separate ones : lookRowForWinner, lookColForWinner and lookDiagonalForWinner. 
The checkRowsForWin method: loops through the rows of the game board, checking if there is a winner. This requires for loop with an if statement inside of it. The if statement compares each bar in the row to each other and returns ‘true’ if all three are equal. After the for loop, if the method never stopped  there were no three consecutive symbols with the same value and the return will be false.
In lookColForWinner method we use the same logic as in checkRowsForWin, but now we check the columns.
In lookDiagonalForWinner method - first we check the diagonal from the top left corner to the bottom right corner. checkDiagonalForWinner (board[0][0], board[1][1], board[2][2]) == true) The second statement checks the diagonal from the top right corner to the bottom left corner. checkDiagonalForWinner(board[0][2], board[1][1], board[2][0]) == true)

Method 'determineSimilarity' checks if all three signs are the same (all are X or all are O) and none of them are empty.
Creation of whoseTurn method, that swaps player’s value from X to O and vice versa using if-else method.
The 'placePlayer' method will place the correct sign(value) into the specified row and column in the board variable . It returns true when the placement is valid. Otherwise, the board will stay the same and the game will ask the player to try again if an invalid game bar or an already taken bar was selected. We check that the row and column values from the input are between 0 and 2 as well as we make sure that the chosen bar is not taken yet. If any of these three conditions are false, then value 'false' will be returned.
Creation of the main method in public class 'gameOutput'. We use Scanner, to receive input from the player. Then we must initialise the game board by calling the createBoard method. We create a do-while loop to go through all the turns and it should brake whenever the game board is full or there is a winner. Before each turn the game prints out the current state of the game board to show the player the available bars. Then the game takes in player input and after executing it, swaps the player.
Finally, we determine the winner or if the game was a tie using while loops. If the board is full and there is no winner -  the game prints out a message “It's a tie!”. Otherwise it prints out the winner.