package map;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;

@SuppressWarnings("serial")
public class MapView extends JPanel
{
  private final Map map;
  private final JFrame window;

  private double xScale;
  private double yScale;

  private ArrayList<Rectangle2D> tiles;


  public MapView(Map map, JFrame window)
  {
    super();

    this.map = map;
    this.window = window;

    tiles = new ArrayList<Rectangle2D>();
  }

  public void setScale()
  {
    xScale = this.getSize().width/(double)(map.getWidth());
    yScale = this.getSize().height/(double)(map.getHeight());
  }

  public void genTiles()
  {
    tiles.clear();

    for(double i=0; i<map.getWidth(); i++)
    {
      for(double j=0; j<map.getHeight(); j++)
      {
        tiles.add(new Rectangle2D.Double(i*xScale, j*yScale, xScale, yScale));
      }
    }
  }

  public void paint(Graphics g)
  {
    Graphics2D g2 = (Graphics2D)g;

    setScale();
    genTiles();

    for(Rectangle2D tile : tiles)
    {
      g2.draw(tile);
    }
  }
}
