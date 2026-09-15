/**
 * Holds the Bishop's Attributes, constructs, and paramenters.
 * Can move only diagonally.
 * 
 * @author Ismael Renova
 * @version 1.0
 * @since 9/15/26
 * 
 * Change logs: Fixing enumarated PieceType. Checking if function reads diagonally.
 */
public class Bishop {

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
    public Bishop() {
        pieceName = PieceType.BISHOP;
    }

    /**
     * Creates a Bishop with its starting information.
     *
     * @param pieceName name/type of the piece
     * @param color color of the piece
     * @param col starting column
     * @param row starting row
     */
    public Bishop(PieceType pieceName, String color, char col, int row) {
        this.pieceName = pieceName;
        this.color = color;
        this.col = col;
        this.row = row;
    }

    /**
     * Gets the color of the Bishop.
     *
     * @return color of the Bishop
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
     * Checks if the Bishop can move to the target position.
     *
     * @param newCol target column
     * @param newRow target row
     * @return true if the move is valid, otherwise false
     */
    public boolean verifyTarget(char newCol, int newRow) {
        //Finds the difference between the current and Target column and Row.
        int colDifference = Math.abs(col - newCol);
        int rowDifference = Math.abs(row - newRow);
        // Checks if moving diagonally while checks if it not same position.
        if (colDifference == rowDifference && colDifference != 0) {
            return true;
        }

        return false;
    }
}
