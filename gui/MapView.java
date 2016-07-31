package gui;

import map.Map;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;

@SuppressWarnings("serial")
public class MapView extends JPanel
{
  private final Map map;

  private double xScale;  //The width of each tile.
  private double yScale;  //The height of each tile.

  private ArrayList<Rectangle2D> tiles;

  /**
  * Create the map view.
  * @param map The map to create the view from.
  */
  public MapView(Map map)
  {
    super();

    this.map = map;

    tiles = new ArrayList<Rectangle2D>();
  }

  /**
  * Calcualte the scale of the tiles.
  */
  public void setScale()
  {
    xScale = this.getSize().width/(double)(map.getWidth());
    yScale = this.getSize().height/(double)(map.getHeight());
  }

  /**
  * Generate all of the tile.
  */
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

  /**
  * Paint the tiles.
  */
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
