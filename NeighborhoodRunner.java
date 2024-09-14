import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter myBackgroundPainter = new BackgroundPainter();

    //declares all the painters that will be used
    PatternPainter myPatternPainter = new PatternPainter();
    EdgePainter myEdgePainter = new EdgePainter();

    //gives all the painters paint so use
    myBackgroundPainter.setPaint(1000);
    myPatternPainter.setPaint(1000);
    myEdgePainter.setPaint(1000);

    //runs the methods with their respective colors
    myEdgePainter.paintEdge("pink");
    myPatternPainter.paintMural("lightblue");
    myBackgroundPainter.paintBackground("pink");
    
  }
}
