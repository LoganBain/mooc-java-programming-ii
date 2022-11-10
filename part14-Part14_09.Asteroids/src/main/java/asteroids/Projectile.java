package asteroids;

import javafx.scene.shape.Polygon;

/**
 *
 * @author logan
 */

public class Projectile extends Character {

    private boolean alive;

    public Projectile(int x, int y) {
        super(new Polygon(2, -2, 2, 2, -2, 2, -2, -2), x, y);
        this.alive = true;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
