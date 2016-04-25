package tanksfx.gameobjects.tiles;

import javafx.scene.image.Image;
import tanksfx.gameobjects.Sprite;

/**
 * Created by ppetrov on 4/25/16.
 */
public class BaseTile extends Sprite {
    protected BaseTile(int posX, int posY, Image image) {
        this.posX = posX;
        this.posY = posY;
        this.spriteImg = image;
    }
}
