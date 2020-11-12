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
public class Player{
    private final int idPlayer;
    private float posX;
    private float posY;
    private float speedX;
    private float speedY;
    private boolean moveRight;
    private boolean moveLeft;
    private boolean moveUp;
    private boolean moveDown;

    public Player(int idPlayer, float posX, float posY) {
        this.idPlayer = idPlayer;
        this.speedX = 0;
        this.speedY = 0;
        this.posX = posX;
        this.posY = posY;
    }

    public int getIdPlayer() {
        return idPlayer;
    }
    
    public boolean getMoveRight() {
        return moveRight;
    }

    public boolean getMoveLeft() {
        return moveLeft;
    }

    public boolean getMoveUp() {
        return moveUp;
    }

    public boolean getMoveDown() {
        return moveDown;
    }
    
    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }
    
    public void move()
    {
        posX += speedX;
        posY += speedY;
    }  
    
    public void draw()
    {
        move();
    }
    
    public void start()
    {
        if(idPlayer == 1)
        {
            posX = 50;
            moveRight = true;
            moveLeft = false;
        }
        else
        {
            posX = 700;
            moveLeft = true;
            moveRight = false;
        }
        posY = 375;
        moveUp = false;
        moveDown = false;
        
    }
    
    public void moveRight()
    {
        if(!moveLeft)
        {
            moveRight = true;
            
            if(moveRight)
            {
                speedX = (float) 0.5;
                speedY = (float) 0;
		moveDown = false;
		moveUp = false;
            }
            else
            {
                speedX = (float) 0;
            }
        }
        
    }
    
    public void moveLeft()
    {
        if(!moveRight)
        {
            moveLeft = true;
            
            if(moveLeft)
            {
                speedX = (float) -0.5;
                speedY = (float) 0;
		moveDown = false;
		moveUp = false;
            }
            else
            {
                speedX = (float) 0;
            }
        }
    }
    
    public void moveUp()
    {
        if(!moveDown)
        {
            moveUp = true;
            
            if(moveUp)
            {
                speedY = (float) -0.5;
                speedX = (float) 0;
		moveRight = false;
		moveLeft = false;
            }
            else
            {
                speedX = (float) 0;
            }
        }
    }
    
    public void moveDown()
    {
        if(!moveUp)
        {
            moveDown = true;
            
            if(moveDown)
            {
                speedY = (float) 0.5;
                speedX = (float) 0;
		moveRight = false;
		moveLeft = false;
            }
            else
            {
                speedX = (float) 0;
            }
        }
    }
}
