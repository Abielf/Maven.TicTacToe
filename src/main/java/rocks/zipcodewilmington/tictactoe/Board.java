package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] gameBoard;
    public Board(Character[][] matrix) {

        this.gameBoard=matrix;
    }

    public Boolean isInFavorOfX() {{
        if(gameBoard[0][0]=='X') {
            if(gameBoard[0][1]=='X'&&gameBoard[0][2]=='X'){return true;}
            if(gameBoard[1][1]=='X'&&gameBoard[2][2]=='X'){return true;}
            if(gameBoard[1][0]=='X'&&gameBoard[2][0]=='X'){return true;}
        }
        if(gameBoard[2][0]=='X') {
            if(gameBoard[2][1]=='X'&&gameBoard[2][2]=='X'){return true;}
            if(gameBoard[1][1]=='X'&&gameBoard[0][2]=='X'){return true;}
        }
        if(gameBoard[1][1]=='X') {
            if(gameBoard[0][1]=='X'&&gameBoard[2][1]=='X'){return true;}
            if(gameBoard[1][0]=='X'&&gameBoard[1][2]=='X'){return true;}
        }
        if(gameBoard[0][2]=='X') {
            if(gameBoard[1][2]=='X'&&gameBoard[2][2]=='X'){return true;}
        }
        return false;
    }
    }

    public Boolean isInFavorOfO() {
        if(gameBoard[0][0]=='O') {
            if(gameBoard[0][1]=='O'&&gameBoard[0][2]=='O'){return true;}
            if(gameBoard[1][1]=='O'&&gameBoard[2][2]=='O'){return true;}
            if(gameBoard[1][0]=='O'&&gameBoard[2][0]=='O'){return true;}
        }
        if(gameBoard[2][0]=='O') {
            if(gameBoard[2][1]=='O'&&gameBoard[2][2]=='O'){return true;}
            if(gameBoard[1][1]=='O'&&gameBoard[0][2]=='O'){return true;}
        }
        if(gameBoard[1][1]=='O') {
            if(gameBoard[0][1]=='O'&&gameBoard[2][1]=='O'){return true;}
            if(gameBoard[1][0]=='O'&&gameBoard[1][2]=='O'){return true;}
        }
        if(gameBoard[0][2]=='O') {
            if(gameBoard[1][2]=='O'&&gameBoard[2][2]=='O'){return true;}
        }
    return false;
    }

    public Boolean isTie() {
        if(this.isInFavorOfO()) {
            return false;
        }
        if(this.isInFavorOfX()) {
            return false;
        }

        return true;
    }

    public String getWinner() {
        if(this.isInFavorOfO()) {
            return "O";
        }
        if(this.isInFavorOfX()) {
            return "X";
        }
        if(this.isTie()){return "";}
        return null;
    }

}
