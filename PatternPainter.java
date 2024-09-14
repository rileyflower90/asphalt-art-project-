import org.code.neighborhood.*;

public class PatternPainter extends PainterPlus {

  //paintRow paints a pattern across an entire row
  public void paintRow(String color) {
    while(canMove()){
      paintPattern(color);
      move();
      move();
      move();
    }
  }

/*
This uses paintRow to paint a row, then it turns to the next row
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
