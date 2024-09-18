import org.code.neighborhood.*;

public class PatternPainter extends PainterPlus {

  //This PaintRow whileloop paints a pattern across an entire row.
  //If the painter can move, the painter will paint a square and then keep on going, until the painter can't move anymore.
  public void paintRow(String color) {
    while(canMove()){
      paintPattern(color);
      move();
      move();
      move();
    }
  }

/*
This uses paintRow to paint a row, and then it turns to the next row
It then paints a new row
It repeats this until every row has the pattern
*/
  public void paintMural(String color) {
    turnRight();
    move();
    turnLeft();
    
    for (int i = 0; i < 2; i++) {
      paintRow(color);
      turnRight();
      move();
      move();
      move();
      move();
      turnRight();
    
      paintRow(color);
      turnLeft();
      move();
      move();
      turnLeft();
    }
    
    paintRow(color);
    turnRight();
    move();
    move();
    
  }
    
}
