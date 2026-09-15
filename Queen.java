/**
 * Holds the Queen's Attributes, constructs, and paramenters.
 * Can move diagonally, horizontal and Vertical.
 * 
 * @author Ismael Renova
 * @version 1.0
 * @since 9/15/26
 * 
 * Change logs: Added missing enumarated and fixed moving diagonally whilst fixing some attributes
 */
public class Queen {

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
    public Queen() {
        pieceName = PieceType.QUEEN;
    }

    /**
     * Creates a Queen with its starting information.
     *
     * @param pieceName name/type of the piece
     * @param color color of the piece
     * @param col starting column
     * @param row starting row
     */
    public Queen(PieceType pieceName, String color, char col, int row) {
        this.pieceName = pieceName;
        this.color = color;
        this.col = col;
        this.row = row;
    }

    /**
     * Gets the color of the Queen.
     *
     * @return color of the Queen
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
     * Checks if the Queen can move to the target position.
     *
     * @param newCol target column
     * @param newRow target row
     * @return true if the move is valid, otherwise false
     */
    public boolean verifyTarget(char newCol, int newRow) {
        // Finds the difference between the current and target column and row.
        int colDifference = Math.abs(col - newCol);
        int rowDifference = Math.abs(row - newRow);

        if (col == newCol && row != newRow) {
            return true;
        }
        // Checks if the Queen moves horizontally or vertically
        if (row == newRow && col != newCol) {
            return true;
        }
        // Checks if the Queen moves diagonally like a Bishop.
        if (colDifference == rowDifference && colDifference != 0) {
            return true;
        }

        return false;
    }
}
