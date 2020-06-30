/** This class use to draw a wheel of robot.
 *  When created it have all the feature below.
 *  The user can modify x, y Co-ordinate
 *  @author Phan, Truong Son
 *  */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Wheel {
    private double x;
    private double y;

    /**
     * Constructor to create a Wheel object.
     * @param x coordinate
     * @param y coordinate
     */
    public Wheel(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Draw the wheel of Robot
     * @param gc
     */
    public void draw(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(x, y, 5, 50);
    }


}
