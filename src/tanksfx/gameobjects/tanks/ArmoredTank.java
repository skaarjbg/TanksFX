package tanksfx.gameobjects.tanks;

import javafx.scene.image.Image;

/**
 * Created by ppetrov on 4/25/16.
 */
public class ArmoredTank extends BaseTank {
    private static final String IMAGE_PATH = "res/images/tanks/tank_enemy_armor";
    private static final int ARMOR = 4;
    private static final int SPEED = 2;
    private static final int BULLET_SPEED = 2;
    private static final int POINTS = 400;

    public ArmoredTank(int posX, int posY) {
        super(ARMOR, SPEED, BULLET_SPEED, POINTS, new Image(IMAGE_PATH));
        this.posX = posX;
        this.posY = posY;
    }
}
