package map;

import javax.swing.*;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class MapView extends JComponent
{
  private final Map map;
  private final JFrame window;

  private double xScale;
  private double yScale;


  public MapView(Map map, JFrame window)
  {
    this.map = map;
    this.window = window;

    setScale();
  }

  public void setScale()
  {
    xScale = window.getBounds().width/(double)(map.getWidth());
    yScale = (window.getBounds().height)/(double)(map.getHeight());
  }

  public void paint(Graphics g)
  {
    setScale();
    for(double i=0; i<map.getWidth(); i++)
    {
      for(double j=0; j<map.getHeight(); j++)
      {
        g.drawRect((int)(i*xScale), (int)(j*yScale), (int)xScale, (int)yScale);
      }
    }
  }
}
