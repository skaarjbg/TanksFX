package tanksfx.gameobjects.players;

import javafx.scene.image.Image;
import tanksfx.gameobjects.Sprite;

/**
 * Created by ppetrov on 4/25/16.
 */
public class BasePlayer extends Sprite {
    private int speed = 1;
    private int bulletSpeed = 1;
    private int armor = 1;
    private int power = 1;
    private int stars = 0;
    private int lifes = 0;
    private boolean invincible = false;

    protected BasePlayer(int posX, int posY, Image image) {
        this.posX = posX;
        this.posY = posY;
        this.spriteImg = image;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }

    public int getBulletSpeed() {
        return bulletSpeed;
    }

    public void setBulletSpeed(int bulletSpeed) {
        this.bulletSpeed = bulletSpeed;
    }

    public void consumeStarPowerup() {
        switch (stars) {
            case 0: {
                bulletSpeed++;
            }
            break;
            case 1: {
                speed++;
            }
            break;
            case 2: {
                power++;
            }
            break;
        }
        stars++;
    }
}
