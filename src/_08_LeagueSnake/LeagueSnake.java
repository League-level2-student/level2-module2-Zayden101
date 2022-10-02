package _08_LeagueSnake;

import java.awt.Color;
import java.awt.event.KeyEvent;

import processing.core.PApplet;

public class LeagueSnake extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    
    /*
     * Game variables
     * 
     * Put all the game variables here.
     */
    
    Segment snakeHead;
    int foodX;
    int foodY;
    
    
    int direction = UP;
    
    
    int food = 0;

    
    /*
     * Setup methods
     * 
     * These methods are called at the start of the game.
     */
    @Override
    public void settings() {
    	 size(500, 500);
    }

    @Override
    public void setup() {
    	snakeHead=new Segment(250,250);
    	
    	frameRate(20);
    	
    	dropFood();
    }

    void dropFood() {
        // Set the food in a new random location
    	foodX = ((int)random(50)*10);
    	foodY = ((int)random(50)*10);

    }

    /*
     * Draw Methods
     * 
     * These methods are used to draw the snake and its food
     */

    @Override
    public void draw() {
    	
    	background(0,0,0);
    	
    	move();
    	
    	drawFood();
    	drawSnake();
    }



	void drawFood() {
        // Draw the food
		
		fill(255,0,0);
		rect(foodX, foodY, 10, 10);

    }

    void drawSnake() {
        // Draw the head of the snake followed by its tail
    	
		fill(0,255,0);
    	rect(snakeHead.x, snakeHead.y, 10, 10);
    }

    void drawTail() {
        // Draw each segment of the tail
        
    }

    /*
     * Tail Management methods
     * 
     * These methods make sure the tail is the correct length.
     */

    void manageTail() {
        // After drawing the tail, add a new segment at the "start" of the tail and
        // remove the one at the "end"
        // This produces the illusion of the snake tail moving.

    }

    void checkTailCollision() {
        // If the snake crosses its own tail, shrink the tail back to one segment
        
    }

    /*
     * Control methods
     * 
     * These methods are used to change what is happening to the snake
     */

    public void keyPressed() {
        // Set the direction of the snake according to the arrow keys pressed
        

    	if(key == CODED) {
        if (keyCode == UP) {
            direction = UP;
            
        } else if (keyCode == DOWN) {
            direction = DOWN;
            
        } else if (keyCode == LEFT) {
            direction = LEFT;
            
        } else if (keyCode == RIGHT) {
            direction = RIGHT;
            
        }
        
    	}
    	
    }

    void move() {
        // Change the location of the Snake head based on the direction it is moving.

        
        if (direction == UP) {
            snakeHead.y -= 10;
            
        } else if (direction == DOWN) {
            snakeHead.y += 10;
        	
        } else if (direction == LEFT) {
            snakeHead.x -= 10;
        	
        } else if (direction == RIGHT) {
            snakeHead.x += 10;
        	
        }
        
        checkBoundaries();
        
    }

    void checkBoundaries() {
        // If the snake leaves the frame, make it reappear on the other side
    	if(snakeHead.x>500){
    		snakeHead.x=0;
    		 }
    		 if(snakeHead.x<0){
    			 snakeHead.x=500;
    		 }
    		 if(snakeHead.y<0){
    			 snakeHead.y=500;
    		 }
    		 if(snakeHead.y>500){
    			 snakeHead.y=0;
    		 }

    }

    void eat() {
        // When the snake eats the food, its tail should grow and more
        // food appear
        
    	if(snakeHead.x == foodX  && snakeHead.y == foodY) {
    		food+=1;
    		dropFood();
    	}
    	
    }

    static public void main(String[] passedArgs) {
        PApplet.main(LeagueSnake.class.getName());
    }
}
