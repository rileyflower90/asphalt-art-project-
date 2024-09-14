
import org.code.neighborhood.*;


public class EdgePainter extends PainterPlus {


//paints a line around each edge
 public void paintEdge(String color) {
  for(int i = 0; i < 4; i++) {
    paintLine(color);
    turnRight();
    
  }
  
  }


}
