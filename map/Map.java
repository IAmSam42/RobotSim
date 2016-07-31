package map;

/**
* Contains a map to hold tile values. Map should be access as (xCoord, yCoord)
*/
public class Map
{
  private final int[][] mapTiles;
  private final int width;
  private final int height;

  public Map(int width, int height)
  {
    this.width = width;
    this.height = height;

    mapTiles = new int[width][height];

    for(int i=0; i<width; i++)
    {
      for(int j=0; j<height; j++)
      {
        mapTiles[i][j] = 0;
      }
    }
  }

  public int getWidth()
  {
      return width;
  }

  public int getHeight()
  {
    return height;
  }

  public void setTile(int xCoord, int yCoord, int tileType)
  {
    mapTiles[xCoord][yCoord] = tileType;
  }

  public int getTile(int xCoord, int yCoord)
  {
    return mapTiles[xCoord][yCoord];
  }
}
