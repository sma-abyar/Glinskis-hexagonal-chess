package Classes;

import java.io.File;

import ir.sharif.math.bp02_1.hex_chess.graphics.listeners.EventListener;


public class Listener implements EventListener {
    GameManager game;

    public Listener(GameManager game) {
        this.game = game;
    }

    public void onClick(int row, char col) {
        game.clicked(row, col);
    }

    @Override
    public void onLoad(File file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onLoad'");
    }

    @Override
    public void onSave(File file) {
        game.mapToFile(file);
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'onSave'");
    }

    @Override
    public void onNewGame() {
//        game.
        game.arrangeNewBoard();
//        throw new UnsupportedOperationException("Unimplemented method 'onNewGame'");
    }
}
