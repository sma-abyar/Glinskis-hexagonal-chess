package train;

import java.awt.Color;
import java.io.File;

import ir.sharif.math.bp02_1.hex_chess.graphics.Application;
import ir.sharif.math.bp02_1.hex_chess.graphics.listeners.EventListener;
import train2.Cell;


public class changeBackColor implements EventListener {
     Cell cell;
     Cell lcell;
    Application app;
    PiecePack data;
    int lrow;
    char lcol;
    Color lBColor;

    public changeBackColor(Application app, PiecePack data) {
        this.app = app;
        this.data = data;
    }

    public void onClick(int row, char col) {

        try {
            cell = data.getbBoard().get(""+row+col);
            if (lBColor==Color.GREEN){
                app.setCellProperties(row, col, lcell.getPiece(), Color.BLUE, lcell.getTcolor());
                data.getbBoard().put(""+row+col,new Cell(null, lcell.getPiece(), lcell.getTcolor()));
                data.getbBoard().remove(""+lrow+lcol);
                app.setCellProperties(lrow, lcol, null, null, null);
                lBColor = Color.BLUE;
            }
            if (cell!=null){
                app.changeBackGround(row, col, Color.GREEN);
                lBColor = Color.GREEN;
            }else{
                app.changeBackGround(row, col, Color.blue);
            }
            System.out.println(row+""+col+cell.getPiece());
        }catch (Exception e){
        }
        if ((row != lrow) || (col != lcol)){
            app.changeBackGround(lrow, lcol, null);
        }
        lrow = row;
        lcol = col;
        lcell = cell;

    }

    @Override
    public void onLoad(File file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onLoad'");
    }

    @Override
    public void onSave(File file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onSave'");
    }

    @Override
    public void onNewGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onNewGame'");
    }
}
