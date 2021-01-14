package piece;

import java.awt.*;

public class Leader {

    private int row;
    private int col;
    private String color;
    private int point;

    public Leader(int row, int col){

        this.row = row;
        this.col = col;

    }

  /*  public boolean isMoveValid(int moveRow, int moveCol){

        int rowCoeficient = Math.abs(moveRow - this.row);
        int colCoeficient = Math.abs(moveCol - this.col);

        return rowCoeficient == 1,-1 &&
                colCoeficient == 1, -1;
    } */

    public boolean isAttackValid(int attackRow, int attackCol){
        return false;
    }


    public void render(Graphics g){

        g.setColor(Color.YELLOW);
        g.fillRect(0,0,10,10);
    }


}
