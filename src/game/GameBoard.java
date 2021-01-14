package game;

import piece.Guard;
import piece.Leader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame{

    private ArrayList<Object> pieceCollection;

    public GameBoard() {
        //yellow
        this.pieceCollection = new ArrayList<>();
        this.pieceCollection.add(new Leader(0,4));
        this.pieceCollection.add(new Guard(0,0));
        this.pieceCollection.add(new Guard(0,1));
        this.pieceCollection.add(new Guard(0,2));
        this.pieceCollection.add(new Guard(0,3));

        //green
        this.pieceCollection = new ArrayList<>();
        this.pieceCollection.add(new Leader(5,0));
        this.pieceCollection.add(new Guard(5,1));
        this.pieceCollection.add(new Guard(5,2));
        this.pieceCollection.add(new Guard(5,3));
        this.pieceCollection.add(new Guard(5,4));


      this.setSize(500,500);
      this.setVisible(true);
      this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       /*  JFrame applicationFrame = new JFrame();
        applicationFrame.setSize(500,500);
        applicationFrame.setVisible(true);
        applicationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  */

    }

    //@Override
    public void paint(Graphics g) {

        super.paint(g);

        for (int row = 0; row < 5; row++){


            for (int col = 0; col < 5; col++){

                GameTile tile = new GameTile(row, col);
                tile.render(g);

                Guard g1 = new Guard();
                g1.render(g);

            }

        }
   }
}
