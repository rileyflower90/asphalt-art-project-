import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter myBackgroundPainter = new BackgroundPainter();

    //This is the pattern painter which paints all the squares.
    //And, this is the edge painter which which will be used to paint all the edges of the grid.
    PatternPainter myPatternPainter = new PatternPainter();
    EdgePainter myEdgePainter = new EdgePainter();

    //This gives all the painters paint so that they can use it. 
    //The background painter provides 1000 paint. 
    //The pattern painter provides 1000 paint. 
    //And the edge painter provides 1000 paint.
    myBackgroundPainter.setPaint(1000);
    myPatternPainter.setPaint(1000);
    myEdgePainter.setPaint(1000);

    //These run the methods with their respective colors. 
    //So, the edge painter first goes around the grid painting the edge pink. 
    //The pattern painter sets the windows to a light blue color. 
    //And then the background painter paints the rest of the background pink after the edge and windows are completed.
    myEdgePainter.paintEdge("pink");
    myPatternPainter.paintMural("lightblue");
    myBackgroundPainter.paintBackground("pink");
    
  }
}
