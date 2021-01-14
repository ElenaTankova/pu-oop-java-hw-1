package game;

import java.awt.*;

public class GameTile {

    private int row;
    private int col;
    private int tileSize;

    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;
        this.tileSize = 100;

    }
        public void render (Graphics g){

            int tileX= this.col * this.tileSize;
            int tileY= this.row * this.tileSize;

            g.setColor(Color.BLACK);
            g.fillRect(tileX,tileY,this.tileSize,this.tileSize);
            g.fillOval(tileX,tileY,this.tileSize,this.tileSize);


        }
}
