/**
 * The Tile class represents a tile in the game world.
 */
public class Tile {

    /**
     * Enumerates the types of tiles.
     */
    enum TileType {
        RegularTile, SpawnTile, BossTile, DoorTile, FastTravelTile, CreditsTile, OutOfBounds
    }

    private boolean isActive;
    private TileType tileType;

    /**
     * Constructs a Tile object with the specified tile type.
     *
     * @param tileType The type of tile.
     */
    public Tile(TileType tileType) {

        this.tileType = tileType;
        if (tileType == TileType.FastTravelTile) {
            this.isActive = false;
        } else if (tileType == TileType.SpawnTile) {
            this.isActive = true;
        }
    }

    /**
     * Turns on the tile.
     */
    public void turnOn() {
        this.isActive = true;
    }

    /**
     * Turns off the tile.
     */
    public void turnOff() {
        this.isActive = false;
    }

    /**
     * Retrieves the type of the tile.
     *
     * @return The type of the tile.
     */
    public TileType getTileType() {
        return tileType;
    }

    /**
     * Checks if the tile is active.
     *
     * @return true if the tile is active, otherwise false.
     */
    public boolean getIsActive() {
        return isActive;
    }
}
