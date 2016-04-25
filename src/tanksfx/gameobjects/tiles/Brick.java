package tanksfx.gameobjects.tiles;

import javafx.scene.image.Image;

/**
 * Created by ppetrov on 4/25/16.
 */
public class Brick extends BaseTile {
    private static final String IMAGE_PATH = "res/images/tiles/tiles_bricks.png";

    public Brick(int posX, int posY) {
        super(posX, posY, new Image(IMAGE_PATH));
    }
}
