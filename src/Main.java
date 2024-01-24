import ir.sharif.math.bp02_1.hex_chess.graphics.Application;
import ir.sharif.math.bp02_1.hex_chess.graphics.listeners.SystemOutEventListener;
import ir.sharif.math.bp02_1.hex_chess.util.PieceName;
import train.PiecePack;
import train.changeBackColor;

import ir.sharif.math.bp02_1.hex_chess.graphics.models.StringColor;

public class Main {
    public static void main(String[] args) {
        PiecePack data = new PiecePack();
        Application application = new Application();
        application.registerEventListener(new SystemOutEventListener());
        application.setRemovedPieces(new StringColor[]{
                new StringColor(PieceName.BLACK_BISHOP, StringColor.BLACK),
                new StringColor(PieceName.WHITE_BISHOP, StringColor.WHITE)
        });
        
        application.setMessage("White's Turn");
        application.registerEventListener(new changeBackColor(application, data));
        data.setPieces(application);
    }
}