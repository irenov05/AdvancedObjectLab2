/**
 * Holds the Pawn's Attributes, constructs, and paramenters.
 * 
 * @author Ismael Renova
 * @version 1.0
 * @since 9/15/26
 * 
 * Change logs: Adding missing documentation whilst changing its color function to read both white & black.
 */
public class Pawn {

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
    public Pawn() {
        pieceName = PieceType.PAWN;
    }

    /**
     * Creates a Pawn with its starting information.
     *
     * @param pieceName name/type of the piece
     * @param color color of the piece
     * @param col starting column
     * @param row starting row
     */
    public Pawn(PieceType pieceName, String color, char col, int row) {
        this.pieceName = pieceName;
        this.color = color;
        this.col = col;
        this.row = row;
    }

    /**
     * Gets the color of the Pawn.
     *
     * @return color of the Pawn
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
     * Checks if the Pawn can move to the target position.
     *
     * @param newCol target column
     * @param newRow target row
     * @return true if the move is valid, otherwise false
     */
    public boolean verifyTarget(char newCol, int newRow) {

        // A Pawn must stay in the same column.
        if (col != newCol) {
            return false;
        }

        // Checks if a white Pawn moves one row forward.
        if (color.equalsIgnoreCase("white")) {
            if(col == newCol && row + 1 == newRow) {
                return true;
            }
        }

        // Checks if a black Pawn moves one row forward.
        if (color.equalsIgnoreCase("black")) {
            if(col == newCol && row - 1 == newRow) {
                return true;
            }
        }

        // The move is not valid.
        return false;
    }
}