/**
 * Holds the Knights's Attributes, constructs, and paramenters.
 * Can move in an L shaped matter.
 * 
 * @author Ismael Renova
 * @version 1.0
 * @since 9/15/26
 * 
 * Change logs: Adding missing attributes and enumerated.
 */
public class Knight {

    // Stores the name/type of the chess piece.
    private PieceType pieceName;

    // Stores the color of the chess piece.
    private String color;

    // Stores the current column.
    private char col;

    // Stores the current row.
    private int row;

    /**
     * Empty constructor.
     */
    public Knight() {
        pieceName = PieceType.KNIGHT;
    }

    /**
     * Creates a Knight with its starting information.
     *
     * @param pieceName name/type of the piece
     * @param color color of the piece
     * @param col starting column
     * @param row starting row
     */
    public Knight(PieceType pieceName, String color, char col, int row) {
        this.pieceName = pieceName;
        this.color = color;
        this.col = col;
        this.row = row;
    }

    /**
     * Gets the color of the Knight.
     *
     * @return color of the Knight
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the current column.
     *
     * @return current column
     */
    public char getColumn() {
        return col;
    }

    /**
     * Gets the current row.
     *
     * @return current row
     */
    public int getRow() {
        return row;
    }

    /**
     * Changes the current column.
     *
     * @param col new column
     */
    public void setColumn(char col) {
        this.col = col;
    }

    /**
     * Changes the current row.
     *
     * @param row new row
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Checks if the Knight can move to the target position.
     *
     * @param newCol target column
     * @param newRow target row
     * @return true if the move is valid, otherwise false
     */
    public boolean verifyTarget(char newCol, int newRow) {
        // Checks the difference between current and target column and row.
        int colDifference = Math.abs(col - newCol);
        int rowDifference = Math.abs(row - newRow);
        // Checks if the Knight is moving in diagonally or L shaped matter.
        // Example is A -> B & 1 -> 3 (1st) 
        if ((colDifference == 1 && rowDifference == 2) || (colDifference == 2 && rowDifference == 1)) {
            return true;
        }

        return false;
    }
}