package Classes;

import java.awt.*;

public class Cell {
    private Color bcolor;
    private String piece;
    private Color tcolor;
    private int row;
    private char column;
    private int round;
    public Cell(Color bcolor, String piece, Color tcolor, int row, char column, int round) {
        this.bcolor = bcolor;
        this.piece = piece;
        this.tcolor = tcolor;
        this.row = row;
        this.column = column;
        setRound(round);

    }

    public Color getBcolor() {
        return bcolor;
    }

    public void setBcolor(Color bcolor) {
        this.bcolor = bcolor;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public Color getTcolor() {
        return tcolor;
    }

    public void setTcolor(Color tcolor) {
        this.tcolor = tcolor;
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getKey() {
        return "" + row + column;
    }

}
