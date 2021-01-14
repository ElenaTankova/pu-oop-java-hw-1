package piece;

import java.awt.*;

public class Guard {

    private int row;
    private int col;
    private String color;
    private int point;

    public Guard(int row, int col){

        this.row = row;
        this.col = col;

    }

    public Guard() {

    }

   /* public boolean isMoveValid(int moveRow, int moveCol){

        int rowCoeficient = Math.abs(moveRow - this.row);
        int colCoeficient = Math.abs(moveCol - this.col);

        return rowCoeficient == 1,-1;
        return colCoeficient == 1,-1;
    } */

  /*  public boolean isAttackValid(int attackRow, int attackCol){
        return false;
    } */


    public void render(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(10,25,50,50);
    }

}
