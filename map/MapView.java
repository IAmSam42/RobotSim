package map;

import javax.swing.JComponent;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class MapView extends JComponent
{
  private final Map map;


  public MapView(Map map)
  {
    this.map = map;
  }

  public void paint(Graphics g)
  {
    g.drawRect (10, 10, 200, 200);
  }
}
