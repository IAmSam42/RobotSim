import map.*;
import java.io.File;
import javax.swing.*;

class Test
{
  public static void main(String[] args)
  {
    Map map;

    map = MapGen.GenerateMap(new File("resources/maps/map.png"));

    MapView view = new MapView(map);

    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(30, 30, 300, 300);
    window.getContentPane().add(view);
    window.setVisible(true);
  }
}
