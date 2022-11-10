package asteroids;

import java.util.Random;
import javafx.scene.shape.Polygon;

/**
 *
 * @author logan
 */
public class Asteroid extends Character {

    private double rotationalMovement;
    private boolean alive;

    public Asteroid(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);

        Random rnd = new Random();

        super.getCharacter().setRotate(rnd.nextInt(360));

        int accelerationAmount = 1 + rnd.nextInt(10);
        for (int i = 0; i < accelerationAmount; i++) {
            accelerate();
        }
        this.alive = true;

        this.rotationalMovement = 0.5 - rnd.nextDouble();
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public void move() {
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotationalMovement);
    }
}
