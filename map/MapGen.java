package map;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

/**
* Generated maps based on pixel values of a png image
*/
public class MapGen
{
  
  /**
  * Generate the map from a source file.
  * @param source The image that describes the map
  */
  public static Map GenerateMap(File source)
  {
    BufferedImage img = null;

    try
    {
      img = ImageIO.read(source);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    int width = img.getWidth();
    int height = img.getHeight();

    Map map = new Map(width, height);

    for(int i = 0; i<width; i++)
    {
      for(int j = 0; j<height; j++)
      {
        int value = img.getRGB(i, j);

        if(value == 255)
        {
          map.setTile(i, j, 0);
        }
        else
        {
          map.setTile(i, j, 1);
        }
      }
    }

    return map;
  }
}
