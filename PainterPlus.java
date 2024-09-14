import org.code.neighborhood.*;

/*
 * Creates a PainterPlus
 * PainterPlus is a subclass of Painter.
 */
public class PainterPlus extends Painter {

  /*
   * Turns a PainterPlus object to the right
   * by turning left three times
   */
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }


  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }


  public void paintLine(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
  }


  public void moveOrTakePaint() {
    while (canMove()) {
      if (!isOnBucket()) {
        move();
      }
      else {
        takeAllPaint();
      }
    }
  }

  public void moveSouth() {
    while (canMove("south")) {
      if (!isFacingSouth()) {
        turnRight();
      }
      else {
        move();
      }
    }
  }


  public void printStatus() {
    System.out.println("Paint: " + getMyPaint());
    System.out.println("X Location: " + getX());
    System.out.println("Y Location: " + getY());
    System.out.println("Direction: " + getDirection());
  }


  public void moveFast() {
    while (canMove()) {
      move();

      if (isOnBucket()) {
        takeAllPaint();
      }
    }
  }


  public void paintSquare(String color) {
    while (hasPaint()) {
      paint(color);
      move();

      if (!canMove()) {
        turnRight();
      }
    }
  }


  public void paintDashes(String color) {
    paint(color);
    
    if (canMove()) {
      move();
    }
    
    paint(color);

    if (canMove()) {
      move();
    }

    if (canMove()) {
      move();
    }
  }

 
  public void paintFast(String color) {
    paint(color);
    while (canMove()) {
      move();
      
      if (isOnBucket()) {
        takeAllPaint();
      }

      if (hasPaint()) {
        paint(color);
      }
    }
  }


  public void paintTruckBorder(String color) {
    while (hasPaint()) {
      paintFast(color);

      if (!canMove()) {
        turnLeft();
      }
    }
  }


  public void paintFastAndTurn(String color) {
    while (canMove()) {
      move();

      if (isOnBucket()) {
        takeAllPaint();
      }

      if (hasPaint()) {
        paint(color);
      }

      if (!canMove()) {
        makeTurn();
      }
    }
  }

 
  public void makeTurn() {
    if (isFacingEast()) {
      turnRight();
    }
    else {
      turnLeft();
    }
  }
   //this method creates a square of paint by going in a circle an painting when not on a painted square
  public void paintPattern(String color) {
    while(!isOnPaint()) {
      paint(color);
      move();
      turnRight();
    }   
  }
}
