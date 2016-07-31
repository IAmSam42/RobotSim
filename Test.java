import map.*;
import gui.*;

import java.io.File;
import javax.swing.*;

class Test
{
  public static void main(String[] args)
  {
    Map map;

    map = MapGen.GenerateMap(new File("resources/maps/map.png"));


    JFrame window = new JFrame("Robot Simulation");
    window.setSize(300, 300);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    MapView view = new MapView(map);


    window.add(view);
    window.setVisible(true);
  }
}
