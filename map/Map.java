package map;

/**
* Contains a map to hold tile values. Map should be access as (xCoord, yCoord).
*/
public class Map
{
  private final int[][] mapTiles;
  private final int width;
  private final int height;

  public final static int OPEN = 0;
  public final static int WALL = 1;

  /**
  * Create the Map.
  * @param width The number of tiles wide the map is.
  * @param height The number of tile high the map is.
  */
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

  /**
  * Get the width of the Map in tiles.
  * @return How many tiles wide the map is.
  */
  public int getWidth()
  {
      return width;
  }

  /**
  * Get the height of the Map in tiles.
  * @return How many tiles high the map is.
  */
  public int getHeight()
  {
    return height;
  }

  /**
  * Set the contents of the tile. See the emum for supported tile types.
  * @param xCoord The x coordinate of the tile to set.
  * @param yCoord The y coordinate of the tile to set.
  * @param tileType The new contents of the file according to the enum.
  */
  public void setTile(int xCoord, int yCoord, int tileType)
  {
    mapTiles[xCoord][yCoord] = tileType;
  }

  /**
  * Get the contents of the tile.
  * @param xCoord The x coordinate of the tile.
  * @param yCoord The y coordinate of the tile.
  * @return The contents of the tile according to the enum.
  */
  public int getTile(int xCoord, int yCoord)
  {
    return mapTiles[xCoord][yCoord];
  }
}
