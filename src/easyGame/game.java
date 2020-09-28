package easyGame;

public class game {


        private char[][] board;
        private char player;

        public game() {
            board = new char[3][3];
            player = 'X';
            createBoard();
        }

        public char getPlayer(){
            return player;
        }

        public void createBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = ' ';
                }
            }
        }

        public void printBoard() {
            System.out.println("~~~~~~~~~~~~~");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("~~~~~~~~~~~~~");
            }
        }

        public boolean thereIsNoSpace(){
            boolean thereIsNoSpace = true;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        thereIsNoSpace = false;
                    }
                }
            }
            return thereIsNoSpace;
        }
        boolean lookForWinner(){
            return (lookRowForWinner() || lookColForWinner() || lookDiagonalForWinner());
        }

        private boolean lookRowForWinner() {
            for (int i = 0; i < 3; i++) {
                if (determineSimilarity(board[i][0], board[i][1], board[i][2]) == true) {
                    return true;
                }
            }
            return false;
        }

        private boolean lookColForWinner(){
            for (int i = 0; i < 3; i++) {
                if (determineSimilarity(board[0][i], board[1][i], board[2][i]) == true) {
                    return true;
                }
            }
            return false;
        }

        private boolean lookDiagonalForWinner(){
            for (int i = 0; i < 3; i++) {
                if ((determineSimilarity(board[0][0], board[1][1], board[2][2]) == true)
                        || (determineSimilarity(board[0][2], board[1][1], board[2][0]) == true)) {
                    return true;
                }
            }
            return false;
        }

        private boolean determineSimilarity(char char1, char char2, char char3){
            return ((char1 == char2) &&
                    (char2 == char3) &&
                    (char1 != ' '));
        }

        public void whoseTurn() {
            if (player == 'X') {
                player = 'O';
            }
            else {
                player = 'X';
            }
        }

        public boolean placePlayer(int row, int col) {

            if ((row >= 0) && (row < 3)) {
                if ((col >= 0) && (col < 3)) {
                    if (board[row][col] == ' ') {
                        board[row][col] = player;
                        return true;
                    }
                }
            }
            return false;
        }
    }

