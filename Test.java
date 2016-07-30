import map.*;
import java.io.File;

class Test
{
  public static void main(String[] args)
  {
    try
    {
      Map map = MapGen.GenerateMap(new File("resources/maps/map.png"));

      System.out.println(map.getTile(4, 2));
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

  }
}
