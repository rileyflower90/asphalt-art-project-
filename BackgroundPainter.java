import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {


//goes in a line. If there isn't paint, it fills it in with a color
  public void paintRow(String color){
    while (canMove()) {
      if (!isOnPaint()) {
        paint(color);
      }
      move();

      if (!isOnPaint()) {
        paint(color);
      }
    }
  }

  //uses paintRow to paint 1 row at a time, turn, and repeat for every row
  public void paintBackground(String color){
    while(canMove()){
      paintRow(color);
      turnRight();
      move();
      turnRight();

      paintRow(color);
      turnLeft();
      move();
      turnLeft();
    }
  }
}
