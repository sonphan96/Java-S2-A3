/** This class use to draw a Robot player.
 *  When created it have all the feature below.
 *  The user can modify x, y Co-ordinate,...
 *  @author Phan, Truong Son
 *  */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Player {
    private double x;
    private double y;
    private int average;
    private Color color;
    private String title;
    private Wheel wheel1, wheel2;
    private Head head;

    Random random = new Random();

    /**
     * Constructor to create a Player object.
     * @param x coordinate
     * @param y coordinate
     * @param color of robot
     */
    public Player(double x, double y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
        wheel1 = new Wheel(x, y);
        wheel2 = new Wheel(x + 50,y);
        head = new Head(x + 10,y - 35);
    }

    /**
     * Contructor to create a Player object with a title
     * @param x
     * @param y
     * @param color
     * @param title
     */
    public Player(double x, double y, Color color, String title){
        this.x = x;
        this.y = y;
        this.color = color;
        this.title = title;
        wheel1 = new Wheel(x, y);
        wheel2 = new Wheel(x + 50,y);
        head = new Head(x + 10,y- 35);
    }

    /**
     * Get the value of average
     * @return
     */
    public int getAverage() {
        return average = random.nextInt(100);
    }

    /**
     * Draw the robot
     * @param gc
     */
    public void draw(GraphicsContext gc){
        gc.setFill(color);
        gc.fillOval(x,y, 50,50);
        gc.strokeText(String.valueOf(average),x+10,y+20);
        gc.strokeText(title,x, y + 70);
        wheel1.draw(gc);
        wheel2.draw(gc);
        head.draw(gc);
    }
}
