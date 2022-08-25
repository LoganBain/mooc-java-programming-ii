/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class Organism implements Movable {
    private int xCoord;
    private int yCoord;
    
    public Organism(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    @Override
    public void move(int dx, int dy) {
        xCoord += dx;
        yCoord += dy;
    }
    
    @Override
    public String toString() {
        return "x: " + xCoord + "; y: " + yCoord;
    }
}
