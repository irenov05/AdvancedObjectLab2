
public class Pawn {
    public String pieceName; // left it as public to call it since directions didnt specify setter and getter for this
    String color;
    char col;
    int row;

    Pawn(String pieceName, String color, char col, int row){
        this.pieceName = pieceName;
        this.color = color;
        this.col = col;
        this.row = row;
    }
    public String getPieceName() {
        return pieceName;
    }

    public String getColor() {
        return color;
    }

    public char getColumn() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setColumn(char col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean verifyTarget(char newCol, int newRow) {

        if (color.equals("WHITE")) {
            if (col == newCol && row + 1 == newRow) {
                return true;
            }
        }

        if (color.equals("BLACK")) {
            if (col == newCol && row - 1 == newRow) {
                return true;
            }
        }

        return false;
    }
}
