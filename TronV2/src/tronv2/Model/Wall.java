/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tronv2.Model;

import javafx.scene.shape.Line;

/**
 *
 * @author verri
 */
public class Wall 
{
    private int posX;
    private int posY;
    private Line wallLine;

    public Wall(Line wallLine) 
    {
        this.wallLine = wallLine;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Line getWallLine() {
        return wallLine;
    }
}
