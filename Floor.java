import java.util.ArrayList;

/**
 * Represents a floor in the game.
 */
public class Floor {
    private int floorArea;
    private int floorNumber;
    private ArrayList<Tile> tiles = new ArrayList<>();
    private int height;
    private int width;

    /**
     * Creates a new floor.
     *
     * @param floorArea   The area of the floor.
     * @param floorNumber The number of the floor.
     */
    public Floor(int floorArea, int floorNumber) {

        if ((floorArea == 1 && (1 <= floorNumber && floorNumber <= 3))
                || (floorArea == 2 && (1 <= floorNumber && floorNumber <= 5))
                || (floorArea == 3 && (1 <= floorNumber && floorNumber <= 3))) {
            this.floorArea = floorArea;
            this.floorNumber = floorNumber;

            switch (floorArea) {
                case 1:
                    switch (floorNumber) {
                        case 1:
                            this.height = 7;
                            this.width = 3;

                            // row 1
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 2
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));

                            // row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 4
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 6
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 7
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.FastTravelTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.get(19).turnOn(); // makes sure the tile is teleportable
                            break;
                        case 2:
                            this.height = 7;
                            this.width = 7;

                            // row 1
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 2
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 4
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));

                            // row 5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 6
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 7
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            break;
                        case 3:
                            this.height = 7;
                            this.width = 5;

                            // row 1
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.FastTravelTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 2
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 4
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.BossTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 6
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            // row 7
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            break;
                    } break;
                case 2:
                    switch (floorNumber) {
                        case 1:
                            this.height = 5;
                            this.width = 5;

                            //row 1
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.FastTravelTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.get(2).turnOn(); // makes sure the tile is teleportable

                            //row 2
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 4
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            break;
                        case 2:
                            this.height = 7;
                            this.width = 3;

                            //row 1
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 2
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 4
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));

                            //row  5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 6
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 7
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            break;
                        case 3:
                            this.height = 7;
                            this.width = 5;

                            //row 1
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));

                            //row 2
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));

                            //row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 4
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));

                            //row 5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 6
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));

                            //row 7
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            break;
                        case 4:
                            this.height = 3;
                            this.width = 6;

                            //row 1
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 2
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            break;
                        case 5:
                            this.height = 8;
                            this.width = 7;

                            //row 1
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.FastTravelTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));

                            //row 2
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 4
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.BossTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 6
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 7
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 8
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            break;
                    } break;
                case 3:
                    switch(floorNumber) {
                        case 1:
                            this.height = 9;
                            this.width = 8;

                            //row 1
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 2
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 4
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 6
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 7
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 8
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 9
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.FastTravelTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            break;
                        case 2:
                            this.height = 7;
                            this.width = 7;

                            //row 1
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));

                            //row 2
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 4
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.BossTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 6
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 7
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.OutOfBounds));
                            break;
                        case 3:
                            this.height = 9;
                            this.width = 3;

                            //row 1
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.CreditsTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 2
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));

                            //row 3
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 4
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));

                            //row 5
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 6
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));

                            //row 7
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));

                            //row 8
                            tiles.add(new Tile(Tile.TileType.SpawnTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.SpawnTile));

                            //row 9
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            tiles.add(new Tile(Tile.TileType.DoorTile));
                            tiles.add(new Tile(Tile.TileType.RegularTile));
                            break;
                    }
                    break;
            }
        }
    }

    /**
     * Displays the floor layout.
     *
     * @param character The character whose position needs to be displayed.
     */
    public void displayFloor(Character character) {
        String areaName = null;
        if (floorArea == 1) {
            areaName = "Stormveil Castle";
        } else if (floorArea == 2) {
            areaName = "Raya Lucaria Academy";
        } else if (floorArea == 3) {
            areaName = "The Elden Throne";
        }

        System.out.println("Area: " + areaName + " | Floor : " + this.floorNumber);
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                int tileIndex = i * this.width + j;

                if (tiles.get(tileIndex).getTileType() == Tile.TileType.RegularTile) {
                    System.out.print(" _____ ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.SpawnTile) {
                    System.out.print(" ***** ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.BossTile) {
                    System.out.print(" ^^^^^ ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.DoorTile) {
                    System.out.print(" ##### ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.FastTravelTile) {
                    System.out.print(" ~~~~~ ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.CreditsTile) {
                    System.out.print(" ..... ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.OutOfBounds) {
                    System.out.print("       ");
                }
            }
            System.out.println(); // Move to the next line after printing a row

            for (int j = 0; j < this.width; j++) {
                int tileIndex = i * this.width + j;

                if (tiles.get(tileIndex).getTileType() == Tile.TileType.RegularTile) {
                    System.out.print("|     |");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.SpawnTile) {
                    System.out.print("*  S  *");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.BossTile) {
                    System.out.print("^  B  ^");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.DoorTile) {
                    System.out.print("#  D  #");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.FastTravelTile) {
                    System.out.print("~  F  ~");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.CreditsTile) {
                    System.out.print(".  C  .");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.OutOfBounds) {
                    System.out.print("       ");
                }
            }
            System.out.println(); // Move to the next line after printing a row

            for (int j = 0; j < this.width; j++) {
                int tileIndex = i * this.width + j;

                if (character.getCurrentTileIndex() == tileIndex) {
                    if (tiles.get(tileIndex).getTileType() == Tile.TileType.RegularTile) {
                        System.out.print("|  @  |");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.SpawnTile) {
                        System.out.print("*  @  *");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.BossTile) {
                        System.out.print("^  @  ^");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.DoorTile) {
                        System.out.print("#  @  #");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.FastTravelTile) {
                        System.out.print("~  @  ~");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.CreditsTile) {
                        System.out.print(".  @  .");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.OutOfBounds) {
                        System.out.print("   @   ");
                    }
                } else {
                    if (tiles.get(tileIndex).getTileType() == Tile.TileType.RegularTile) {
                        System.out.print("|     |");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.SpawnTile) {
                        System.out.print("*     *");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.BossTile) {
                        System.out.print("^     ^");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.DoorTile) {
                        System.out.print("#     #");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.FastTravelTile) {
                        System.out.print("~     ~");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.CreditsTile) {
                        System.out.print(".     .");
                    } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.OutOfBounds) {
                        System.out.print("       ");
                    }
                }
            }
            System.out.println(); // Move to the next line after printing a row

            for (int j = 0; j < this.width; j++) {
                int tileIndex = i * this.width + j;

                if (tiles.get(tileIndex).getTileType() == Tile.TileType.RegularTile) {
                    System.out.print(" _____ ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.SpawnTile) {
                    System.out.print(" ***** ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.BossTile) {
                    System.out.print(" ^^^^^ ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.DoorTile) {
                    System.out.print(" ##### ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.FastTravelTile) {
                    System.out.print(" ~~~~~ ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.CreditsTile) {
                    System.out.print(" ..... ");
                } else if (tiles.get(tileIndex).getTileType() == Tile.TileType.OutOfBounds) {
                    System.out.print("       ");
                }
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }

    /**
     * Retrieves the width of the floor.
     *
     * @return The width of the floor.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Retrieves the size of the tiles array.
     *
     * @return The size of the tiles array.
     */
    public int getTilesSize() {
        return tiles.size();
    }

    /**
     * Retrieves the type of a tile at the specified index.
     *
     * @param index The index of the tile.
     * @return The type of the tile.
     */
    public Tile.TileType getTileType(int index) {
        return tiles.get(index).getTileType();
    }

    /**
     * Retrieves the tiles of the floor.
     *
     * @return The tiles of the floor.
     */
    public ArrayList<Tile> getTiles() {
        return tiles;
    }

}
