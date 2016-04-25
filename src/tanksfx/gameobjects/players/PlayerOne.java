package tanksfx.gameobjects.players;

import javafx.scene.image.Image;

/**
 * Created by ppetrov on 4/25/16.
 */
public class PlayerOne extends BasePlayer {
    private static final String IMAGE_PATH = "res/images/tanks/tank_player_1.png";

    public PlayerOne(int posX, int posY) {
        super(posX, posY, new Image(IMAGE_PATH));
    }
}
