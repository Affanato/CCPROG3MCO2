import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AreaScreenController {
    public AreaScreenView areaScreenView;

    public AreaScreenController(AreaScreenModel areaScreenModel, Character character){
        this.areaScreenView = new AreaScreenView(character);

        areaScreenView.addWActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(areaScreenView.canMoveUp(character)) {
                    areaScreenView.dispose();
                    areaScreenModel.moveCharacter(character, 'w');
                } else {
                    areaScreenView.setFeedbackLabel("Can't move up");
                }
            }
        });

        areaScreenView.addAActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(areaScreenView.canMoveLeft(character)) {
                    areaScreenView.dispose();
                    areaScreenModel.moveCharacter(character, 'a');
                } else {
                    areaScreenView.setFeedbackLabel("Can't move left");
                }
            }
        });

        areaScreenView.addSActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(areaScreenView.canMoveDown(character)) {
                    areaScreenView.dispose();
                    areaScreenModel.moveCharacter(character, 's');
                } else {
                    areaScreenView.setFeedbackLabel("Can't move down");
                }
            }
        });

        areaScreenView.addDActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(areaScreenView.canMoveRight(character)) {
                    areaScreenView.dispose();
                    areaScreenModel.moveCharacter(character, 'd');
                } else {
                    areaScreenView.setFeedbackLabel("Can't move right");
                }
            }
        });

        areaScreenView.addInteractAddActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //Spawn Tile
                if(areaScreenView.getCurrentTileType(character) == Tile.TileType.SpawnTile){
                    if(character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(character.getCurrentTileIndex()).getIsActive()) {
                        if(character.getCurrentAreaIndex() == 3) {
                            double randomValue = Math.random();
                            if (randomValue <= 0.25) {
                                areaScreenView.dispose();
                                areaScreenModel.getTreasure(character);
                                character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(character.getCurrentTileIndex()).turnOff();
                            } else {
                                areaScreenView.setFeedbackLabel("You found nothing");
                                character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(character.getCurrentTileIndex()).turnOff();
                            }
                        } else {
                            double randomValue = Math.random();
                            if (randomValue <= 0.25) {
                                areaScreenView.dispose();
                                areaScreenModel.getTreasure(character);
                                character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(character.getCurrentTileIndex()).turnOff();
                            } else {
                                areaScreenView.dispose();
                                areaScreenModel.battleEnemy(character);
                                character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(character.getCurrentTileIndex()).turnOff();
                            }
                        }
                    } else {
                        areaScreenView.setFeedbackLabel("You have interacted here already");
                    }
                //Boss Tile
                } else if (areaScreenView.getCurrentTileType(character) == Tile.TileType.BossTile) {
                    if(character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(character.getCurrentTileIndex()).getIsActive()) {
                        areaScreenView.dispose();
                        areaScreenModel.battleBoss(character);
                    } else {
                        areaScreenView.setFeedbackLabel("You have already defeated the boss");
                    }
                //Fast Travel Tile
                } else if (areaScreenView.getCurrentTileType(character) == Tile.TileType.FastTravelTile){
                    if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(character.getCurrentTileIndex()).getIsActive()) {
                        areaScreenView.dispose();
                        areaScreenModel.travelBack(character);
                    } else {
                        areaScreenView.setFeedbackLabel("This tile is not activated");
                    }
                //Door Tile
                } else if (areaScreenView.getCurrentTileType(character) == Tile.TileType.DoorTile){
                    if (character.getAreas().get(character.getCurrentAreaIndex()).getFloors().get(character.getCurrentFloorNumber()).getTiles().get(character.getCurrentTileIndex()).getIsActive()) {
                        areaScreenView.dispose();
                        areaScreenModel.travelDoor(character);
                    } else {
                        areaScreenView.setFeedbackLabel("This tile is not activated");
                    }
                //Credits Tile
                } else if(areaScreenView.getCurrentTileType(character) == Tile.TileType.CreditsTile){
                    areaScreenView.dispose();
                    areaScreenModel.goCredits();
                }
            }
        });
    }

    public AreaScreenView getAreaScreenView(){
        return this.areaScreenView;
    }
}
