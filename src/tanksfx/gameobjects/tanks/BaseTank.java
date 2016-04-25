package tanksfx.gameobjects.tanks;

import javafx.scene.image.Image;
import tanksfx.gameobjects.Sprite;

/**
 * Created by ppetrov on 4/25/16.
 */
public class BaseTank extends Sprite {
    private int armor;
    private int speed;
    private int bulletSpeed;
    private int points;
    private boolean invincible = false;

    public BaseTank(int armor, int speed, int bulletSpeed, int points, Image image) {
        this.armor = armor;
        this.speed = speed;
        this.bulletSpeed = bulletSpeed;
        this.points = points;
        this.spriteImg = image;
    }

    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }
}
